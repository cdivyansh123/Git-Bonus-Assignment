import java.util.Scanner;
public class Spiral {
    public static int[][] generateSpiralMat(int size){
        //initializing 2D matrix
        int [][] myMatrix=new int[size][size];

        //startCol variable represents starting column of the matrix so, our column starts from 0.
        int startCol=0;

        //lastCol variable represents last index of the column.
        int lastCol=size-1;

        //startRow variable represents starting row of the matrix so, our raw starts from 0...
        int startRow=0;

        //lastRow variable represents last index of the Row.
        int lastRow=size-1;

        //variable count represents the value for the cells and its value is start from 1...
        int count=1;

        int n=size*size;
        //our loop will be run till last index of the matrix
        while(count<=n){

            //to assign the values for first row, here row is constant column varies
            for(int i=startCol;i<=lastCol;i++){
                myMatrix[startRow][i]=count;
                count++;
            }

            //to assign the values for last column, here column is constant row varies
            for(int i=startRow+1;i<=lastRow;i++){
                myMatrix[i][lastCol]=count;
                count++;
            }

            //to assign the values for last row,here row is constant column varies
            for(int i=lastCol-1;i>=startCol;i--){
                myMatrix[lastRow][i]=count;
                count++;

            }

            //to assign the values for first column, here column is constant row varies
            for(int i=lastRow-1;i>=startRow+1;i--){
                myMatrix[i][startCol]=count;
                count++;
            }
            startCol++;
            startRow++;
            lastCol--;
            lastRow--;
        }
        return myMatrix;
    }

    //function to print spiral matrix
    public static void printSpiralMat(int [][] mat){
        for(int i=0;i<mat.length;i++){
            for (int j=0;j<mat.length;j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size : ");
        int size=sc.nextInt();

        int arr[][]=generateSpiralMat(size);
        printSpiralMat(arr);
    }
}
