/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec5;
import java.util.Scanner;
import java.util.Random;
public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int number = rd.nextInt(100) + 1;
        int guess = 0;
        System.out.println("----Ramdom Number----");
        System.out.println("Computer the number: " + number);
        while(guess != number){
            System.out.print("Your Number: ");
            guess = sc.nextInt();
            if(guess > number){
                System.out.println("Your number higher than the Computer number");
            } else if(guess < number){
                System.out.println("Your number lower than the Computer ");
            }
        }
    }
}
