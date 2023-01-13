package com.Practice._4;

import java.util.Arrays;

//832. Flipping an Image
//        Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
//
//        To flip an image horizontally means that each row of the image is reversed.
//
//        For example, flipping [1,1,0] horizontally results in [0,1,1].
//        To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
//
//        For example, inverting [0,1,1] results in [1,0,0].

//        Example 1:
//        Input: image = [[1,1,0],[1,0,1],[0,0,0]]
//        Output: [[1,0,0],[0,1,0],[1,1,1]]
//        Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//        Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
//
//        Example 2:
//        Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
//        Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//        Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
//        Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
public class Flipping_an_Image {
    public static void main(String[] args) {
        int[][] image = {   {1,1,0},
                            {1,0,1},
                            {0,0,0}     };
        int[][] flipped = flip(image,image.length);
        for (int[] num: flipped) {
            System.out.println(Arrays.toString(num));
        }
    }
    static int[][] flip(int[][] image, int n) {
        int[][] temp = new int[n][n];
        for (int i = 0; i < image.length; i++) {
            int k = 0;
            for(int j = image.length - 1; j >=0 ; j--) {
                temp[i][j] = image[i][k];
                k++;
                if(temp[i][j] == 0) temp[i][j] = 1;
                else temp[i][j] = 0;
            }
        }

        return temp;
    }
}
