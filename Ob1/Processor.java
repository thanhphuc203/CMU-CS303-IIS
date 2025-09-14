
package Ob1;
import java.util.Scanner;
public class Processor {
     public static void main(String[] args) {
        DanhSachNguoi ds = new DanhSachNguoi();
        Scanner sc = new Scanner(System.in);
        int tiepTuc = 1;

        while (tiepTuc == 1) {
            System.out.println("====== MENU ======");
            System.out.println("1. Nhap thong tin (Sinh vien / Giao vien)");
            System.out.println("2. Xuat danh sach");
            System.out.print("Chon chuc nang: ");
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Nhap doi tuong (1-Sinh vien, 2-Giao vien): ");
                    int loai = Integer.parseInt(sc.nextLine());
                    if (loai == 1) {
                        ds.themDanhSach(new SinhVien());
                    } else if (loai == 2) {
                        ds.themDanhSach(new GiaoVien());
                    } else {
                        System.out.println("Lua chon khong hop le!");
                    }
                    break;
                case 2:
                    ds.xuatDanhSach();
                    break;
                default:
                    System.out.println("Khong co chuc nang nay!");
            }

            System.out.print("Tiep tuc khong? (1-Co, 0-Khong): ");
            tiepTuc = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Chuong trinh ket thuc.");
    }
}

