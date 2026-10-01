package ra.edu.demo_baitap;

import java.util.Scanner;

public class GiaiThichNhapSoRoiNhapChu {
    public static void main(String[] args) {
        int number;
        String name;
        double d;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: "); //Ấn các phím số 1 5 3 4 + enter (ký tự kết thúc)
        number = sc.nextInt();

        System.out.println("Nhập chữ: ");
        sc.nextLine();
        name = sc.nextLine();

        System.out.println("Nhập số double: ");
        d = sc.nextDouble();

        System.out.println("Số: "+number);
        System.out.println("Chữ: "+name);
        System.out.println("Số double: "+d);
    }
}

// biến chữ lưu luôn ký tự kết thúc nhập ở cuối của nó