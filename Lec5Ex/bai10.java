/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec5;
import java.util.Scanner;
public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap height: ");
        int h = sc.nextInt();
        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= 2 * h - 1; j++){
                if(i == 1 && j == h){
                    System.out.print("*");
                } else if(i == h){
                    System.out.print("*");
                } else if(j == h - i + 1 || j == h + i - 1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
