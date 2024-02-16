package org.example.app.models;

public record Rect(Point rightTop, Point leftBottom, Point leftTop, Point rightBottom) {
    public Rect(Point a, Point b) {
        this(a, b, new Point(a.x(), b.y()), new Point(b.x(), a.y()));
    }

    public IntersectionType intersectionType(Rect another) {

        if (this.leftBottom.isAboveThan(another.rightTop)   || this.rightTop.isBelowThan(another.leftBottom)
         || this.rightTop.isRighterThan(another.leftBottom) || this.leftBottom.isLefterThan(another.rightTop)) {
            return IntersectionType.NONE;
        }

        if (this.rightTop.equals(another.rightTop)   || this.leftBottom.equals(another.rightTop)
         || this.leftTop.equals(another.rightBottom) || this.rightBottom.equals(another.leftTop)) {
            return IntersectionType.DOT;
        }

        if (this.leftBottom.isSameHorizontal(another.rightTop) || this.rightTop.isSameHorizontal(another.leftBottom)) {
            return IntersectionType.VERTICAL;
        }

        if (this.leftBottom.isSameVertical(another.rightTop) || this.rightTop.isSameVertical(another.leftBottom)) {
            return IntersectionType.HORIZONTAL;
        }

        return IntersectionType.RECTANGLE;
    }
}
