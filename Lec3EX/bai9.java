/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec3EX;
import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Demonstrating");
        System.out.print("Enter an integer: "); 
        int number = scanner.nextInt(); 
        System.out.print("Enter a sentence: "); 
        String sentence = scanner.nextLine(); 
        System.out.println("Number: " + number); 
        System.out.println("Sentence: \"" + sentence + "\" (bi bo qua)");
        System.out.println("Fixed version");
        System.out.print("Enter an integer: ");
        int numberFix = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter a sentence: ");
        String sentenceFix = scanner.nextLine();
        System.out.println("Number: " + numberFix);
        System.out.println("Sentence: " + sentenceFix);
        scanner.close();
    }
}
