/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec5;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu 2-9: ");
        int n = sc.nextInt();
        for(int i = 1; i < 10; i++){
            int tinh = n * i;
//            System.out.println(n + " * " + i " = " + tinh);
            System.out.println(n+ " * " +i+ " = " + tinh);
            System.out.println("--------------------");
        }
    }
}
