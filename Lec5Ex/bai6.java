/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec5;
import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while(n > 0){
            int sodu = n % 10;
            sum += sodu;
            n /= 10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
