package ra.edu.ss02;

import java.util.Scanner;

public class XepLoai {
    public static void main(String[] args) {
        float dtb;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào điểm trung bình của bạn: ");
        dtb=sc.nextFloat();

        if(dtb>=9 && dtb<=10){
            System.out.println("Bạn đạt loại xuất sắc");
        }else if(dtb>=8 && dtb<9){
            System.out.println("Bạn đạt loại giỏi");
        }else if(dtb>=6.5 && dtb<8){
            System.out.println("Bạn đạt loại khá");
        }else if(dtb>=5 && dtb<6.5){
            System.out.println("Bạn đạt loại trung bình");
        }else if(dtb>=3.5 && dtb<5){
            System.out.println("Bạn đạt loại yếu");
        }else if(dtb>=0 && dtb<3.5){
            System.out.println("Bạn đạt loại kém");
        }else{
            System.out.println("Bạn nhập điểm trung bình không đúng");
        }
    }
}
