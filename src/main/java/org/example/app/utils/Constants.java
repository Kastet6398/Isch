package org.example.app.utils;

public class Constants extends BaseUtils {
    private Constants() {
        super();
    }

    public static final int ax1 = 1, ay1 = 6, bx1 = 6, by1 = 2;
    public static final int ax2 = 5, ay2 = 8, bx2 = 9, by2 = 1;

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
