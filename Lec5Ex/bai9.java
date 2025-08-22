/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec5;
import java.util.Scanner;
public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
        while(true){
            System.out.print("Enter a number (enter 0 to stop)");
            number = sc.nextInt();
            if(number == 0){
                break;
            }
            sum += number;
            count++;
        }
        if(count > 0){
            double avg = (double) sum / count;
            System.out.println("The avg is: " + avg);
        } else{
            System.out.println("No number were enter!");
        }
    }
}
