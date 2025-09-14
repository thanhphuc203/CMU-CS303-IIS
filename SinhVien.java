
package Ob1;
import java.util.Scanner;
public class SinhVien extends Nguoi{
    private String maSinhVien;
    private String renLuyen;

    public SinhVien() {
        super();
    }
    public SinhVien(String hoVaTen, java.util.Date ngaySinh, String gioiTinh, int cmnd,
                    String maSinhVien, String renLuyen) {
        super(hoVaTen, ngaySinh, gioiTinh, cmnd);
        this.maSinhVien = maSinhVien;
        this.renLuyen = renLuyen;
    }
    public String getMaSinhVien() { return maSinhVien; }
    public void setMaSinhVien(String maSinhVien) { this.maSinhVien = maSinhVien; }

    public String getRenLuyen() { return renLuyen; }
    public void setRenLuyen(String renLuyen) { this.renLuyen = renLuyen; }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        maSinhVien = sc.nextLine();
        danhGiaRenLuyen();
    }

    public void danhGiaRenLuyen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon muc do ren luyen: ");
        System.out.println("1. Gioi");
        System.out.println("2. Kha");
        System.out.println("3. Trung binh");
        System.out.println("4. Yeu");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: renLuyen = "Gioi"; break;
            case 2: renLuyen = "Kha"; break;
            case 3: renLuyen = "Trung binh"; break;
            case 4: renLuyen = "Yeu"; break;
            default: renLuyen = "Khong xac dinh";
        }
    }

    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Ma sinh vien: " + maSinhVien);
        System.out.println("Ren luyen: " + renLuyen);
    }
}

