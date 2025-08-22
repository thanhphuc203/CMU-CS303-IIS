/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec5;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Loi!.Vui long nhap so khong am.");
        }
        long f = 1;
        for(int i = n; i >= 1; i--){
            f *= i;
        }
        System.out.println(n+ "!" + " = " +f);
    }
}
