/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec5;
import java.util.Random;
public class bai11 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n1, n2;
        int count = 0;
        do {
            n1 = rand.nextInt(6) + 1;
            n2 = rand.nextInt(6) + 1;
            count++;
            System.out.println("Roll " + count + ": " + n1 + " and " + n2);
        } while (n1 != n2);
        System.out.println("You rolled doubles after " + count + " tries!");
    }
}

