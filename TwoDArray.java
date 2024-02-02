import java.util.*;
public class TwoDArray {
    public static void main(String[]args){
        int matrix[][]= new int[3][3];
        int n= matrix.length , m=matrix[0].length;

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the Elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();

            }
        }
       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

       }
    }
    
}



//Program 2
/*import java.util.Scanner;

public class star {
    public static void main(String[] args) {
       /*Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();

       int st=1;
       int sp= n-1;
       int number_of_lines=1;

       while (number_of_lines<=n) {
            //Star printing
        for(int i=0;i<st;i++){
            System.out.print("* ");
            //space printing
        } for(int i=0;i<sp;i++){
            System.out.print(" ");
        }
        System.out.println();
        st++;
        sp--;
        number_of_lines++;
       }

         }
    
}*/
