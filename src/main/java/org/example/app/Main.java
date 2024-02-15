package org.example.app;

import org.example.app.models.Point;
import org.example.app.models.Rect;
import org.example.app.utils.Constants;

public class Main {
    public static void main(String[] args) {
        int ax1 = Constants.ax1, ay1 = Constants.ay1, bx1 = Constants.bx1, by1 = Constants.by1;
        int ax2 = Constants.ax2, ay2 = Constants.ay2, bx2 = Constants.bx2, by2 = Constants.by2;

        Rect r1 = new Rect(new Point(ax1, ay1), new Point(bx1, by1));
        Rect r2 = new Rect(new Point(ax2, ay2), new Point(bx2, by2));

        System.out.println(r1.intersectionType(r2));


    }
}
