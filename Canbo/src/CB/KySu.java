package CB;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu()
    {

    }
    public KySu(String diaChi, String gioiTinh, String ngaySinh, String hoTen, String nganhDaoTao) {
        super(diaChi, gioiTinh, ngaySinh, hoTen);
        this.nganhDaoTao = nganhDaoTao;
    }

    public void nhapThongTin(Scanner sc)
    {
        super.nhapThongTin(sc);
        System.out.println("Nhap nganh dao tao");
        nganhDaoTao = sc.nextLine();
    }

    public void hienThongTin()
    {
        super.hienThongTin();
        System.out.println("Nganh dao tao: "+ nganhDaoTao);
    }
}
