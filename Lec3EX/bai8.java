/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec3EX;
import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap multiple words: ");
        while(true){
            String word = sc.next();
            if(word.equalsIgnoreCase("stop")) break;
            System.out.println(word);
        }
    }
}