package CB;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> danhSachCB ;

    public QLCB()
    {
        danhSachCB = new ArrayList<CanBo>(10);
    }

    public void themCanBo(CanBo cb)
    {
        danhSachCB.add(cb);
    }

    public void nhapDanhSach(Scanner sc)
    {
        CanBo cb;
        System.out.println("Nhap so luong can bo: ");
        int x = sc.nextInt(); sc.nextLine();
        System.out.println("Nhap thong tin chi tiet: ");
        for(int i = 0; i< x;i++)
        {
            System.out.println("Nhap lan thu " +(i+1) + " :");
            System.out.println("Chon can bo 1-Ky Su; 2-CongNhan; 3-NhanVien");
            int chon = sc.nextInt(); sc.nextLine();

            cb = new CanBo();
            switch (chon)
            {
                case 1:
                {
                    cb = new KySu();
                    break;
                }
                case 2:
                {
                    cb = new CongNhan();
                    break;
                }
                case 3:
                {
                    cb = new NhanVien();
                    break;
                }

                default:
                    cb = new KySu();
                    break;


            }
            cb.nhapThongTin(sc);
            themCanBo(cb);
        }

    }

    public void timKiemCB(String name) {
        for (CanBo cb : danhSachCB) {
            if (name.equals(cb.getHoTen())){
                cb.hienThongTin();
            }
        }
    }
}
