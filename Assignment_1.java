import java.util.Scanner;
public class Assignment_1{
    /*
     * AUTHOR: GBEWORDOH PRECIOUS XOESE
     * REGISTRATION NUMBER:PS/CSC/22/0077
     * DATE:JUNE,5TH 2025
     * DESCRIPTION:POSITIVE,NEGATIVE AND ZERO
     */
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int number;
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        if (number > 0){
            System.out.println("The number is positive");  
        } 
        else if (number < 0){
            System.out.println("The number is negative");
        }
        else {
            System.out.println("The number is zero");
        }

    sc.close();
    }
}