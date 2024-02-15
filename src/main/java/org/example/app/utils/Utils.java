package org.example.app.utils;

import org.example.app.models.IntersectionType;
import org.example.app.models.Point;
import org.example.app.models.Rect;

public class Utils extends BaseUtils {
    private Utils() {
        super();
    }

    public static IntersectionType intersectionType(Rect rect1, Rect rect2) {
        Point a1 = rect1.a(), b1 = rect1.b(), leftTop1 = rect1.leftTop(), rightBottom1 = rect1.rightBottom();
        Point a2 = rect2.a(), b2 = rect2.b(), leftTop2 = rect2.leftTop(), rightBottom2 = rect2.rightBottom();

        if (a2.isAboveThan(b1) || b2.isBelowThan(a1) || a2.isRighterThan(b1) || b2.isLefterThan(a1)) {
            return IntersectionType.NONE;
        }

        if (b2.equals(a1) || b1.equals(a2) || leftTop1.equals(rightBottom2) || rightBottom1.equals(leftTop2)) {
            return IntersectionType.DOT;
        }

        if (b1.isSameHorizontal(a2) || b2.isSameHorizontal(a1)) {
            return IntersectionType.VERTICAL;
        }

        if (b1.isSameVertical(a2) || b2.isSameVertical(a1)) {
            return IntersectionType.HORIZONTAL;
        }

        return IntersectionType.RECTANGLE;
    }
}
