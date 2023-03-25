package lecture1;

public class Patterns {
    public static void main(String[] args) {
        printDownHollowTriangle(10);
    }

    public static void printLine(int n){
        int count = 0;
        while (count < n){
            System.out.print("*");
            count++;
        }
    }


    // n is 5
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    public static void printSquare(int n){
        int row = 0;
        while (row < n){
            int col = 0;
            while (col < n){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    // n is 5
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    public static void printUpTriangle(int n){
        int row = 0;
        while (row < n){
            int col = 0;
            while (col <= row){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void printDownTriangle(int n){
        int row = 0;
        while (row < n){
            int col = 0;
            while (col < (n-row)){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void printDownHollowTriangle(int n){
        int row = 0;
        while (row < n){
            int col = 0;
            while (col < (n-row)){
                if((row==0) || (col == 0) || (col == (n-row-1))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
