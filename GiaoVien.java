
package Ob1;
import java.util.Scanner;
public class GiaoVien extends Nguoi{
    private String maGiaoVien;
    private String xepLoaiThiDua;

    public GiaoVien() {
        super();
    }

    public GiaoVien(String hoVaTen, java.util.Date ngaySinh, String gioiTinh, int cmnd,
                    String maGiaoVien, String xepLoaiThiDua) {
        super(hoVaTen, ngaySinh, gioiTinh, cmnd);
        this.maGiaoVien = maGiaoVien;
        this.xepLoaiThiDua = xepLoaiThiDua;
    }

    public String getMaGiaoVien() { return maGiaoVien; }
    public void setMaGiaoVien(String maGiaoVien) { this.maGiaoVien = maGiaoVien; }

    public String getXepLoaiThiDua() { return xepLoaiThiDua; }
    public void setXepLoaiThiDua(String xepLoaiThiDua) { this.xepLoaiThiDua = xepLoaiThiDua; }

    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma giao vien: ");
        maGiaoVien = sc.nextLine();
        xepLoaiThiDua();
    }

    public void xepLoaiThiDua() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon xep loai thi dua: ");
        System.out.println("1. Loai A");
        System.out.println("2. Loai B");
        System.out.println("3. Loai C");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: xepLoaiThiDua = "Loai A"; break;
            case 2: xepLoaiThiDua = "Loai B"; break;
            case 3: xepLoaiThiDua = "Loai C"; break;
            default: xepLoaiThiDua = "Khong xac dinh";
        }
    }

    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Ma giao vien: " + maGiaoVien);
        System.out.println("Xep loai thi dua: " + xepLoaiThiDua);
    }
}

