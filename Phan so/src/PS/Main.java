package PS;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo ps1= new PhanSo();
        PhanSo ps2 = new PhanSo();
        PhanSo tong = new PhanSo();

        System.out.println("Nhap phan so thu nhat");
        ps1.nhapPs(sc);
        System.out.println("Nhap phan so thu 2");
        ps2.nhapPs(sc);
        tong = ps1.congPs(ps2);
        tong.toiGian();
        System.out.println("Tong 2 phan so la: ");
        tong.hienThiPs();

        sc.close();



    }
}