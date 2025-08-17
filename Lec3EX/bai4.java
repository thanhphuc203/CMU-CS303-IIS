/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec3EX;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so thuc thu nhat: ");
        double x = s.nextDouble();
        System.out.print("Nhap so thuc thu hai: ");
        double y = s.nextDouble();
        double avg = (x + y) / 2;
        System.out.println("Avenger = " + avg);
    }
}