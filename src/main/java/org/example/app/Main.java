package org.example.app;

import org.example.app.models.Point;
import org.example.app.models.Rect;
import org.example.app.utils.Constants;
import org.example.app.utils.Utils;

public class Main {
    public static void main(String[] args) {
        int ax1 = Constants.ax1, ay1 = Constants.ay1, bx1 = Constants.bx1, by1 = Constants.by1;
        int ax2 = Constants.ax2, ay2 = Constants.ay2, bx2 = Constants.bx2, by2 = Constants.by2;

        System.out.println(Utils.intersectionType(new Rect(new Point(ax1, ay1), new Point(bx1, by1)), new Rect(new Point(ax2, ay2), new Point(bx2, by2))));

/*
Here's a canvas where you can draw the rectangles and visuallyhttps://github.com/Kastet6398/Isch check the output of the program.
0  1  2  3  4  5  6  7  8  9
1              *----------B2
2  *-----------|-B1        |
3  |           |  |        |
4  |      R1   |  |  R2    |
5  |           |  |        |
6  A1----------|--*        |
7              |           |
8              A2----------*
9

R1: A1(1, 6); B1(6, 2);
R2: A2(5, 8); B2(9, 1);

 */


    }
}
