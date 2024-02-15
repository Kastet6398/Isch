package org.example.app.models;

public record Rect(Point a, Point b, Point leftTop, Point rightBottom) {
    public Rect(Point a, Point b) {
        this(a, b, new Point(a.x(), b.y()), new Point(b.x(), a.y()));
    }

    public IntersectionType intersectionType(Rect rect2) {
        Point a2 = rect2.a, b2 = rect2.b;

        if (a2.isBelowThan(b) || b2.isAboveThan(a) || a2.isRighterThan(b) || b2.isLefterThan(a)) {
            return IntersectionType.NONE;
        }

        if (b2.equals(a) || b.equals(a2) || leftTop.equals(rect2.rightBottom) || rightBottom.equals(rect2.leftTop)) {
            return IntersectionType.DOT;
        }

        if (b.isSameHorizontal(a2) || b2.isSameHorizontal(a)) {
            return IntersectionType.VERTICAL;
        }

        if (b.isSameVertical(a2) || b2.isSameVertical(a)) {
            return IntersectionType.HORIZONTAL;
        }

        return IntersectionType.RECTANGLE;
    }
}
