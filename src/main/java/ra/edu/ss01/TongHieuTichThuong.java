package ra.edu.ss01;

import java.util.Scanner;

public class TongHieuTichThuong {
    public static void main(String[] args) {
        int a1,a2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên a1: ");
        a1 = sc.nextInt();
        System.out.println("Nhập số nguyên a2: ");
        a2 = sc.nextInt();

        int tong = a1+a2;
        int hieu = a1-a2;
        int tich = a1*a2;
        float thuong = (float)a1/a2;

        System.out.println("Tổng của "+a1+" + "+a2+" = "+tong);
        System.out.println("Hiệu "+a1+" - "+a2+" = "+hieu);
        System.out.println("Tích "+a1+" * "+a2+" = "+tich);
        System.out.println("Thương "+a1+" / "+a2+" = "+thuong);
        System.out.printf("Thương %d / %d = %.1f",a1,a2,thuong);
    }
}

