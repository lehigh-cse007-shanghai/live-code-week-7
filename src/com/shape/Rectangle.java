package com.shape;

public class Rectangle implements Drawable {
    public String name = "Rectangle";

    public void draw(){

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
    }
}
