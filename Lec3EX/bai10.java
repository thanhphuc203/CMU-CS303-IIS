/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec3EX;
import java.util.Scanner;
public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",|\\n");
        System.out.println("Enter words separated by: ");
        while(scanner.hasNextInt()){
            int number = scanner.nextInt();
            System.out.println("Number " + number);
        }
        scanner.close();
    }
}
