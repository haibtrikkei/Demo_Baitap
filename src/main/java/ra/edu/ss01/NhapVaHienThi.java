package ra.edu.ss01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NhapVaHienThi {
    public static void main(String[] args) {
        int a;
        float b;
        double d;
        long c;
        String name;
        char ch;
        boolean bl;
        Date dob;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên: ");
//        a = scanner.nextInt();
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào 1 số thực: ");
        b = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào 1 số double: ");
        d = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào 1 số long: ");
        c = Long.parseLong(scanner.nextLine());
        System.out.println("Nhập vào họ tên của bạn: ");
        name = scanner.nextLine();
        System.out.println("Nhập vào 1 kí tự: ");
        ch = scanner.nextLine().charAt(0);
        System.out.println("Nhập vào ngày sinh của bạn: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dob = sdf.parse(scanner.nextLine());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Nhập vào 1 giá trị boolean: ");
        bl = scanner.nextBoolean();

        System.out.println("\n Thông tin giá trị các biến vừa nhập: ");
        System.out.println("a = "+a+", b="+b);
        System.out.println("c = "+c+", d = "+d);
        System.out.println("Chào bạn: "+name);
        System.out.println("Ngày sinh của bạn: "+sdf.format(dob));
        System.out.println("Ký tự: "+ch);
        System.out.println("Giá trị boolean: "+bl);
    }
}
