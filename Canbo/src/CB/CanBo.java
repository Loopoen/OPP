package CB;

import java.util.Scanner;

public class CanBo {

    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;

    public CanBo()
    {

    }
    public CanBo(String diaChi, String gioiTinh, String ngaySinh, String hoTen) {
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.hoTen = hoTen;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.println("Nhap ho ten");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap gioi tinh");
        gioiTinh = sc.nextLine();
        System.out.println("Nhap dia chi");
        diaChi = sc.nextLine();
    }

    public void hienThongTin() {
        System.out.println("Ho va ten : " + hoTen);
        System.out.println("Ngay sinh : " + ngaySinh);
        System.out.println("Gioi tinh : " + gioiTinh);
        System.out.println("Dia chi : " + diaChi);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
