package CB;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/1> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QLCB qlds = new QLCB();
        qlds.nhapDanhSach(sc);
        System.out.println("Nhap ten can bo can tim kiem: ");
        String name = sc.nextLine();
        qlds.timKiemCB(name);

        sc.close();

    }
}