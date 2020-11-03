package com.shape;

public interface Drawable {


}


/*

Segment:
int h = 5, w = 5;
for (int i=0; i<h; i++)
{
    System.out.print("\n");
    for (int j=0; j<w; j++)
    {
        if (i == 0 || i == h-1 ||
                j== 0 || j == w-1)
            System.out.print("*");
        else
            System.out.print(" ");
    }
}



Triangle:
int rows = 5, k = 0;

for(int i = 1; i <= rows; ++i, k = 0) {
    for(int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
    }

    while(k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
    }

    System.out.println();
}

Segment:
* * * * * * * * * * * * *

Point:
*

 */