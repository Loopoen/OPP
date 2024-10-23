package PS;

import java.text.ParsePosition;
import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo()
    {
        tuSo = 0;
        mauSo  = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public void nhapPs(Scanner sc){
        int a;
        int b;
        do {
            System.out.println("Nhap tu so");
            a = sc.nextInt();
            System.out.println("Nhap mau so");
            b = sc.nextInt();

            if(b == 0)
            {
                System.out.println("Vui long nhap mau so lai");
            }
            else {
                tuSo = a;
                mauSo = b;
            }
        }while(b == 0);
    }

    public void hienThiPs()
    {
        if(mauSo*tuSo < 0)
        {
            System.out.println("\t-" + Math.abs(tuSo)+ "/" + Math.abs(mauSo) );
        }
        else {
            System.out.println("\t" + Math.abs(tuSo)+ "/" + Math.abs(mauSo));
        }
    }

    public PhanSo congPs(PhanSo ps)
    {
        int a = tuSo*ps.mauSo + ps.tuSo*mauSo;
        int b = mauSo*ps.mauSo;

        return new PhanSo(a, b);
    }
    public PhanSo truPs(PhanSo ps)
    {
        int a = tuSo*ps.mauSo - ps.tuSo*mauSo;
        int b = mauSo*ps.mauSo;

        return new PhanSo(a, b);
    }

    public PhanSo nhanPs(PhanSo ps)
    {
        int a = tuSo*ps.tuSo;
        int b = mauSo*ps.mauSo;

        return new PhanSo(a, b);
    }

    public PhanSo chiaPs(PhanSo ps)
    {
        int a = tuSo*ps.mauSo;
        int b = mauSo*ps.tuSo;

        return new PhanSo(a, b);
    }

    private int timUCLL(int a, int b)
    {
        int r = a%b;
        while(r != 0)
        {
            a = b;

            b = r;
            r = a%b;
        }

        return b;
    }

    public boolean kiemTraTG(PhanSo ps)
    {
        if(timUCLL(ps.tuSo, ps.mauSo) == 1)
        {
            return true;
        }
        return false;
    }

    public void toiGian()
    {
        int x = timUCLL(tuSo , mauSo);
        tuSo /= x;
        mauSo /= x;
    }
}
