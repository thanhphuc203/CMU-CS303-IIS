
package Ob1;
import java.util.ArrayList;
public class DanhSachNguoi {
         private ArrayList<Nguoi> danhSach = new ArrayList<>();

    public void themDanhSach(Nguoi nguoi) {
        nguoi.nhapThongTin();
        danhSach.add(nguoi);
    }

    public void xuatDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach rong");
            return;
        }
        for (Nguoi n : danhSach) {
            System.out.println("-------------------------");
            n.xuatThongTin();
        }
    }
}


