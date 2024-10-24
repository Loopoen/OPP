package CB;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private String bac;

    public CongNhan()
    {

    }

    public CongNhan(String diaChi, String gioiTinh, String ngaySinh, String hoTen, String bac) {
        super(diaChi, gioiTinh, ngaySinh, hoTen);
        this.bac = bac;
    }
    public void nhapThongTin(Scanner sc)
    {
        super.nhapThongTin(sc);
        System.out.println("Nhap bac: ");
        bac = sc.nextLine();

    }

    public void hienThongTin()
    {
        super.hienThongTin();
        System.out.println("Bac la: " + bac);
    }
}
