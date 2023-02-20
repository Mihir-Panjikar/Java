package com.Patterns;

public class P3 {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
          pattern3(3);
//        pattern4(5);
//        pattern5(5);
//        pattern6(6);
//        pattern8(5);
//        pattern9(5);
//        pattern10(5);
//        pattern11(4);
//        pattern12(5);
//        pattern13(5);
//        pattern14(5);
//        pattern15(4);
    }

    static void pattern1(int n) {
        //        1
        //        2	   3
        //        4	   5	6
        //        7	   8	9	10
        //        11   12	13	14	15
        //        for n = 5

        int i = 1;
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols <= rows; cols++) {
                System.out.print(i + "\t");
                i++;
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern2(int n) {
        //      1
        //      0	1
        //      1	0	1
        //      0	1	0	1
        //      1	0	1	0	1
        //      for n = 5

        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols <= rows; cols++) {
                if ((rows+cols)%2 == 0) {
                    System.out.print(1 + "\t");
                }
                else {
                    System.out.print(0 + "\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern3(int n) {
        //        *       *
        //      *   *   *   *
        //    *       *       *

        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < 3 * n; cols++) {
                if((rows == 0 && (cols == 2 || cols == 6)) || (rows == 1 && cols%2 != 0) || (rows == 2 && (cols == 0 || cols == 4 || cols == 8))) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    
    static void pattern4(int n) {
        //    *        *
        //    **      **
        //    * *    * *
        //    *  *  *  *
        //    *   **   *
        //    *   **   *
        //    *  *  *  *
        //    * *    * *
        //    **      **
        //    *        *
        //        for n = 5
        for (int rows = 0; rows < 2 * n; rows++) {
            for (int cols = 0; cols < 2 * n; cols++) {
                if (cols == 0 || cols == 2*n -1 || cols == rows || cols+rows == 2*n-1) {
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

    static void pattern5(int n) {
        //        ******
        //       *    *
        //      *    *
        //     *    *
        //    ******
        //     for n = 5

        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < 2 * n; cols++) {
                if(rows+cols == n-1 || (rows == 0 && cols >= n-1) || (rows == n-1 && cols < n) || cols == 2*n-1-rows)
                {
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

    static void pattern6(int n) {
        //        1 1 1 1 1 1
        //        2 2 2 2 2
        //        3 3 3 3
        //        4 4 4
        //        5 5
        //        6
        //         for n = 6
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = n; cols >= rows; cols--) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    

    static void pattern8(int n) {
        //        *
        //       * *
        //      * * *
        //     * * * *
        //    * * * * *
        //     * * * *
        //      * * *
        //       * *
        //        *
        //    for n = 5

        for (int rows = 0; rows < 2 * n; rows++) {
            int totalColsInRow = rows > n ? 2 * n - rows : rows;

//            int noOfSpaces = rows > n ? rows - n : n - rows;
            int noOfSpaces = n - totalColsInRow;

            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int cols = 0; cols < totalColsInRow; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern9(int n) {
        //    *        *
        //    **      **
        //    ***    ***
        //    ****  ****
        //    **********
        //    ****  ****
        //    ***    ***
        //    **      **
        //    *        *
        //    for n = 5
        for (int rows = 0; rows < 2 * n -1; rows++) {
            for (int cols = 0; cols < 2 * n; cols++) {
                if ((cols <= rows && rows+cols < 2*n-1) || (cols+rows >= 2*n-1 && cols > rows))  {
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
        //                        1
        //                    2	  1	  2
        //                3	  2	  1	  2	  3
        //            4	  3	  2	  1	  2	  3	  4
        //        5	  4	  3	  2	  1	  2	  3	  4	  5
        //        for n = 5

        for (int rows = 1; rows <= n; rows++) {
            for (int spaces = n; spaces > rows; spaces--) {
                System.out.print("\t");
            }

            for (int cols = rows; cols >= 1; cols--) {
                System.out.print(cols + "\t");
            }

            for (int cols = 2; cols <= rows; cols++) {
                System.out.print(cols + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern11(int n) {
        //        4 4 4 4 4 4 4
        //        4 3 3 3 3 3 4
        //        4 3 2 2 2 3 4
        //        4 3 2 1 2 3 4
        //        4 3 2 2 2 3 4
        //        4 3 3 3 3 3 4
        //        4 4 4 4 4 4 4
        //         for n = 4

        int Original_N = n;
        n = 2 * n -1;
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                int symbol = Original_N - Math.min(Math.min(rows, cols), Math.min(n-rows-1, n-cols-1));
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern12(int n) {
        //      E
        //      D	E
        //      C	D	E
        //      B	C	D	E
        //      A	B	C	D	E
        //      for n = 5

        for (char rows = 'E'; rows >= 'A'; rows--) {
            for (char cols = rows; cols <= 'E'; cols++) {
                System.out.print(cols + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern13(int n) {
        //        a
        //        B c
        //        D e F
        //        g H i J
        //        k L m N o
        //    for n = 5

        char symbol = 'a';
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols <= rows; cols++) {
                if ((symbol)%2 == 0) {
                    System.out.print(Character.toUpperCase(symbol) + " ");
                }
                else {
                    System.out.print(Character.toLowerCase(symbol) + " ");
                }
                symbol++;
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern14(int n) {
        //        E D C B A
        //        D C B A
        //        C B A
        //        B A
        //        A
        //        for n = 5

        for (char rows = 'E'; rows >= 'A'; rows--) {
            for (char cols = rows; cols >= 'A'; cols--) {
                System.out.print(cols + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern15(int n) {
        //        1      1
        //        12    21
        //        123  321
        //        12344321
        //    for n = 5

        for (int rows = 1; rows <= n; rows++) {
            for (int symbol = 1; symbol <= rows; symbol++) {
                System.out.print(symbol);
            }

            int spaces = 2 * (n-rows);
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int symbol = rows; symbol > 0; symbol--) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        System.out.println();
    }
}
