import java.util.Scanner;
public class array{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int rowsize,colsize;
        System.out.print("enter rowsize: ");
        rowsize=scanner.nextInt();
        System.out.print("enter colsize: ");
        colsize=scanner.nextInt();
        int [][] matrix=new int[rowsize][colsize];
        for(int i=0;i<rowsize;i++){
            for(int j=0;j<colsize;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }
        int index=0;
        int [] array=new int[rowsize*colsize];
        for(int i=0;i<rowsize;i++){
            for(int j=0;j<colsize;j++){
                array[index++]=matrix[i][j];
            }
        }
        System.out.print("2-D array : ");
        for(int i=0;i<rowsize;i++){
            System.out.println("");
            for(int j=0;j<colsize;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
        System.out.println("");
        System.out.print("1-D array : ");
        for(int i=0;i<rowsize*colsize;i++){
            System.out.print(array[i]+" ");
        }
        scanner.close();
    }
}
