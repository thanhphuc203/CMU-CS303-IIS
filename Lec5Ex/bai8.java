/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec5;
import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap 1-10: ");
            n = sc.nextInt();
            if(n < 1 || n > 10){
                System.out.println("Vuot ngoai pham vi.Vui long nhap lai! : ");
            }
        }while(n < 1 || n > 10); 
    }
}
