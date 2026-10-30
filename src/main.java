
import java.util.Scanner;

class sach {
    String masach;
    String tensach;
    String tacgia;
    int namxuatban;
    int dongia;
    int soluong;
}

public class main {

    // Bai 1: Nhap thong tin sach
    static void nhapsach(sach s, Scanner sc) {
        System.out.println("Nhap ma sach:");
        s.masach = sc.nextLine();

        System.out.println("Nhap ten sach:");
        s.tensach = sc.nextLine();

        System.out.println("Nhap tac gia:");
        s.tacgia = sc.nextLine();

        System.out.println("Nhap nam xuat ban:");
        s.namxuatban = sc.nextInt();

        while (s.namxuatban < 1801 || s.namxuatban >= 2100) {
            System.out.println("Nam xuat ban khong hop le, hay nhap lai:");
            s.namxuatban = sc.nextInt();
        }

        System.out.println("Nhap don gia:");
        s.dongia = sc.nextInt();

        while (s.dongia <= 5000) {
            System.out.println("Gia khong hop le, hay nhap lai:");
            s.dongia = sc.nextInt();
        }

        System.out.println("Nhap so luong:");
        s.soluong = sc.nextInt();

        while (s.soluong < 0) {
            System.out.println("So luong khong hop le, hay nhap lai:");
            s.soluong = sc.nextInt();
        }

        sc.nextLine();
    }

    // Bai 1: Hien thi thong tin sach
    static void hienthi(sach s) {
        System.out.println("\n===== THONG TIN SACH =====");
        System.out.println("Ma sach: " + s.masach);
        System.out.println("Ten sach: " + s.tensach);
        System.out.println("Tac gia: " + s.tacgia);
        System.out.println("Nam xuat ban: " + s.namxuatban);
        System.out.println("Don gia: " + s.dongia);
        System.out.println("So luong: " + s.soluong);
    }

    // Bai 2: Phan loai sach theo don gia
    static int phanloai(sach s) {
        if (s.dongia < 50000)
            return 1;
        else if (s.dongia < 100000)
            return 2;
        else if (s.dongia <= 200000)
            return 3;
        else
            return 4;
    }

    // Hien thi phan loai gia bang if-else
    static void hienthiphanloai(sach s) {
        int loai = phanloai(s);

        if (loai == 1)
            System.out.println("Sach gia thap");
        else if (loai == 2)
            System.out.println("Sach gia trung binh");
        else if (loai == 3)
            System.out.println("Sach gia cao");
        else
            System.out.println("Sach dat biet");
    }

    // Bai 3: Phan loai ton kho
    static int phanloaitonkho(sach s) {
        if (s.soluong == 0)
            return 1;
        else if (s.soluong <= 5)
            return 2;
        else if (s.soluong <= 20)
            return 3;
        else
            return 4;
    }

    // Hien thi tinh trang ton kho
    static void hienthitonkho(sach s) {
        int tonkho = phanloaitonkho(s);

        switch (tonkho) {
            case 1:
                System.out.println("Het sach");
                break;
            case 2:
                System.out.println("Sach sap het");
                break;
            case 3:
                System.out.println("Sach con it");
                break;
            case 4:
                System.out.println("Sach con nhieu");
                break;
        }
    }

    // Bai 4: Dung switch phan loai sach theo gia
    static void switchphanloai(sach s) {
        switch (phanloai(s)) {
            case 1:
                System.out.println("Sach gia thap");
                break;
            case 2:
                System.out.println("Sach gia trung binh");
                break;
            case 3:
                System.out.println("Sach gia cao");
                break;
            case 4:
                System.out.println("Sach dat biet");
                break;
        }
    }

    // Tinh tien sach
    static int tinhtien(sach s) {
        return s.soluong * s.dongia;
    }

    // Tinh phi van chuyen
    static double phivanchuyen(sach s) {
        return tinhtien(s) * 0.05;
    }

    // Tinh tong tien
    static double tongtien(sach s) {
        return tinhtien(s) + phivanchuyen(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sach s = new sach();

        nhapsach(s, sc);

        hienthi(s);

        hienthiphanloai(s);

        hienthitonkho(s);

        switchphanloai(s);

        System.out.println("\n===== THANH TOAN =====");
        System.out.println("Tien sach: " + tinhtien(s));
        System.out.println("Phi van chuyen: " + phivanchuyen(s));
        System.out.println("Tong tien: " + tongtien(s));

        sc.close();
    }
}
