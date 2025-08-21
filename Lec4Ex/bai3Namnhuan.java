
package Lec4Ex;
    import java.util.Scanner;
public class bai3Namnhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap so nam: ");
         int n = sc.nextInt();
         if (n %4 == 0 && n % 100 != 0 || n % 400 == 0){
             System.out.print("day la nam nhuan: ");
         } else{
             System.out.print("khong phai nam nhuan");
         }
    }
}
