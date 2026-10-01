package ra.edu.demo_baitap;

import java.text.NumberFormat;
import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        String customerFullName;
        String productName;
        double productPrice;
        int quantity;
        boolean isMember;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên khách hàng: ");
        customerFullName = sc.nextLine();
        System.out.println("Nhập vào tên sản phẩm: ");
        productName = sc.nextLine();
        System.out.println("Nhập vào giá sản phẩm: ");
        productPrice = sc.nextDouble();
        System.out.println("Nhập vào số lượng mua: ");
        quantity = sc.nextInt();
        System.out.println("Nhập vào có phải là thành viên hay không (true/false)? ");
        isMember = sc.nextBoolean();

        double totalPrice = productPrice * quantity;
        double decrease = 0;
        if(isMember){
            decrease  = totalPrice*10/100;
        }
        double vat = totalPrice*8/100;

        double totalPaid = totalPrice - decrease + vat;

        NumberFormat nf =  NumberFormat.getNumberInstance();
        System.out.println("Tên khách hàng: "+customerFullName);
        System.out.println("Sản phẩm: "+productName);
        System.out.println("Giá: "+nf.format(productPrice));
        System.out.println("Số lượng: "+quantity);
        System.out.println("Thành tiền: "+nf.format(totalPrice));
        System.out.println("Giảm giá: "+nf.format(decrease));
        System.out.println("Tiền VAT: "+nf.format(vat));
        System.out.println("Tổng thanh toán: "+nf.format(totalPaid)+" VND");

    }
}

