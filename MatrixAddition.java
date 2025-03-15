import java.util.Scanner;

class MatrixAddition
{
     public  static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter no of columns:");
        int cols=sc.nextInt();
         
        int[][] matrix1=new int[rows][cols];
        System.out.println("Enter first matrix:");
        for(int i=0;i<rows;i++)
         {
            for(int j=0;j<cols;j++)
             {
                matrix1[i][j]=sc.nextInt();
             }
         }
        
        
        int[][] matrix2=new int[rows][cols];
        System.out.println("Enter second matrix:");
        for(int i=0;i<rows;i++)
         {
            for(int j=0;j<cols;j++)
              {
                matrix2[i][j]=sc.nextInt();
              }
         }
        

        int[][] matrix3=new int[rows][cols];
        for(int i=0;i<rows;i++)
         {
            for(int j=0;j<cols;j++)
             {
                matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
             }
         }
        System.out.println("Matrix after addition:");
        
        for(int i=0;i<rows;i++)
        {
          for(int j=0;j<cols;j++)
           {
              System.out.println(matrix3[i][j]);
           }



        }     
        
           
   }
}
