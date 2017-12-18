/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Jaction76
 */
import java.util.Scanner;
public class ThreeDimensionalArray {
    public static void main(String args[]){
      		int m, n, o, c, d, e;
      		Scanner in = new Scanner(System.in);
System.out.println("_____________________________________________________________________________________");
System.out.println("Enter the no.of matrix,number of rows and columns of matrix in [...?][...?][...?]");
System.out.println("______________________________________________________________________________________");
m = in.nextInt();
n  = in.nextInt();
o  = in.nextInt();
int first [][][] = new int[m][n][o];
int second [][][] = new int[m][n][o];
int sum [][][] = new int[m][n][o];

System.out.println("_____________________________________________________");
        System.out.println("Enter first matrix elements:");
        System.out.println("_____________________________________________________");
           for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                for(e=0;e<o;e++){
                   first[c][d][e] = in.nextInt();
            }
        }
    }
           System.out.println("_____________________________________________________");
           System.out.println("Enter Second matrix elements:");
           System.out.println("_____________________________________________________");
           for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                for(e=0;e<o;e++){
                   second[c][d][e] = in.nextInt();
            }
        }
    }
           for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                for(e=0;e<o;e++){
                   sum [c][d][e] =first[c][d][e]+second[c][d][e];
                }
            }
           }
           
       
        for(c=0;c<m;c++){
            System.out.println("_____________________________________________________");
             System.out.println("Your sum:"); 
             System.out.println("_____________________________________________________");
             
            for(d=0;d<n;d++){
                
                for(e=0;e<o;e++){
                    
                  System.out.print(sum[c][d][e]+"\t");  
                }
                System.out.println(" "); 
            }
            
        }
            
    }

    
}
