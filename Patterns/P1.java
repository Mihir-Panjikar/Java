package com.Patterns;

public class P1 {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);
    }

    static void pattern1(int n) {
        //        * * * * *
        //        * * * * *
        //        * * * * *
        //        * * * * *
        //        * * * * *
        // for n = 5

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern2(int n) {
        //        *
        //        * *
        //        * * *
        //        * * * *
        // for n = 5

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern3(int n) {
        //         * * * * *
        //         * * * *
        //         * * *
        //         * *
        //         *
        //  for n = 5

        for (int row = n; row > 0; row--) {
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern4(int n) {
        //        1
        //        1 2
        //        1 2 3
        //        1 2 3 4
        //        1 2 3 4 5
        // for n = 5

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern5(int n) {
        //        *
        //        * *
        //        * * *
        //        * * * *
        //        * * * * *
        //        * * * *
        //        * * *
        //        * *
        //        *
        // for n = 5

        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow = row > n ? 2*n-row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern6(int n) {
        //         *
        //        **
        //       ***
        //      ****
        //     *****
        // for n = 5

        for (int rows = 0; rows <= n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                if (cols < n - rows) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern7(int n) {
        //     *****
        //      ****
        //       ***
        //        **
        //         *
        // for n = 5

        for (int rows = 0; rows <= n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                if (cols < rows) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern8(int n) {
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        // for n = 5

        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols <= n + rows; cols++) {
                if (cols < n - rows) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern9(int n) {
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        //     for n = 5

        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < 2*n - rows; cols++) {
                if (cols > rows) {
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

    static void pattern10(int n) {
        //        *
        //       * *
        //      * * *
        //     * * * *
        //    * * * * *
        //      for n = 5

        for (int rows = 0; rows <= n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                if (cols < n - rows) {
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
}
