package org.example.app.models;

public record Rect(Point a, Point b, Point leftTop, Point rightBottom) {
    public Rect(Point a, Point b) {
        this(a, b, new Point(a.x(), b.y()), new Point(b.x(), a.y()));
    }

    public IntersectionType intersectionType(Rect another) {

        if (this.b.isBelowThan(another.a)   || this.a.isAboveThan(another.b)
         || this.a.isRighterThan(another.b) || this.b.isLefterThan(another.a)) {
            return IntersectionType.NONE;
        }

        if (this.a.equals(another.a)                 || this.b.equals(another.a)
         || this.leftTop.equals(another.rightBottom) || this.rightBottom.equals(another.leftTop)) {
            return IntersectionType.DOT;
        }

        if (this.b.isSameHorizontal(another.a) || this.a.isSameHorizontal(another.b)) {
            return IntersectionType.VERTICAL;
        }

        if (this.b.isSameVertical(another.a) || this.a.isSameVertical(another.b)) {
            return IntersectionType.HORIZONTAL;
        }

        return IntersectionType.RECTANGLE;
    }
}
