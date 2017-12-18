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
public class neDimensionalArray {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);

    System.out.println("enter number of elements for array : ");

    int n=s.nextInt();

    int arr[]=new int[n];

    System.out.println("enter elements of array : ");

    for(int i=0;i<n;i++){//for reading array
        arr[i]=s.nextInt();

    }

    for(int i: arr){ //for printing array

        System.out.println(i);
    }
}
}

    
