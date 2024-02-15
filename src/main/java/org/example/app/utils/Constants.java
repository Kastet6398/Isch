package org.example.app.utils;

public class Constants extends BaseUtils {
    private Constants() {
        super();
    }

    public static final int ax1 = 1, ay1 = 4, bx1 = 6, by1 = 8;
    public static final int ax2 = 6, ay2 = 8, bx2 = 9, by2 = 9;

/*
Here's a canvas where you can draw the rectangles and visually check the output of the program.
0
9              *----------B2
8  *-----------|-B1        |
7  |           |  |        |
6  |      R1   |  |  R2    |
5  |           |  |        |
4  A1----------|--*        |
3              |           |
2              A2----------*
1
0  1  2  3  4  5  6  7  8  9
R1: A1(1, 4); B1(6, 8);
R2: A2(5, 2); B2(9, 9);

 */
}
