package CB;

import java.util.Scanner;

public class NhanVien  extends  CanBo{
    public String congViec;

    public NhanVien()
    {

    }


    public NhanVien(String diaChi, String gioiTinh, String ngaySinh, String hoTen, String congViec) {
        super(diaChi, gioiTinh, ngaySinh, hoTen);
        this.congViec = congViec;
    }

    public void nhapThongTin(Scanner sc)
    {
        super.nhapThongTin(sc);
        System.out.println("Nhap cong viec");
        congViec = sc.nextLine();
    }

    public void hienThongTin()
    {
        super.hienThongTin();
        System.out.println("Cong Vienc :"  + congViec);
    }
}
