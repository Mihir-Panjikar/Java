package com.Patterns;

public class P2 {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern7(4);
    }

    static void pattern1(int n) {
        //* * * * *
        // * * * *
        //  * * *
        //   * *
        //    *
        // for n = 5

        for (int rows = 0; rows <= n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                if (cols < rows) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern2(int n) {
        //    * * * * *
        //     * * * *
        //      * * *
        //       * *
        //        *
        //        *
        //       * *
        //      * * *
        //     * * * *
        //    * * * * *
        //     for n = 5

        for (int rows = 0; rows < 2*n; rows++) {
            int SpacesIncols = rows < n ? rows : 2*n - rows -1;
            int symbols = rows < n ? n - SpacesIncols : rows - n +1;

            for (int s = 0; s < SpacesIncols; s++) {
                System.out.print(" ");
            }

            for (int cols = 0; cols < symbols; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern3(int n) {
        //         *
        //        * *
        //       *   *
        //      *     *
        //     *********
        //      for n = 5

        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < 2 * n; cols++) {
                if (cols < n - rows) {
                    System.out.print(" ");
                }
                else if (cols + rows == n || rows == n-1 || cols == n + rows) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern4(int n) {
        //    *********
        //     *     *
        //      *   *
        //       * *
        //        *
        //    for n = 5

        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < 2 * n -1; cols++) {
                if (cols < rows) {
                    System.out.print(" ");
                }
                else if (cols == rows || rows == 0 || cols == 2*n - rows -2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern7(int n) {
        //           1
        //          212
        //         32123
        //        4321234
        //         32123
        //          212
        //           1
        //         for n = 4

        for (int rows = 1; rows <= 2*n -1; rows++) {

            int spacesInCols = rows < n ? n - rows : rows - n;
            int symbols = rows < n ? rows : 2*n - rows;

            for (int spaces = 0; spaces < spacesInCols; spaces++) {
                System.out.print(" ");
            }

            for (int cols = symbols; cols >= 1; cols--) {
                System.out.print(cols);
            }

            for (int cols = 2; cols <= symbols; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }
        System.out.println();
    }

}
