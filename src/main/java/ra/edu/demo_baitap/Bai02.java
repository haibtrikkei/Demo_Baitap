package ra.edu.demo_baitap;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;

        float mark;
        int totalStudents = 0;
        float totalMarks = 0;
        float markOfMax = 0;
        float markOfMin = 10;
        int inputContinue = 1;

        while (true) {
            System.out.println("***************MENU NHẬP ĐIỂM***************");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.println("Lựa chọn của bạn: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    do{
                        while(true){
                            System.out.println("Nhập điểm học viên: ");
                            mark = sc.nextFloat();
                            if(mark<0 || mark>10){
                                System.out.println("Nhập sai điểm!!!");
                            }else{
                                break;
                            }
                        }

                        totalStudents++;
                        totalMarks +=mark;
                        if(mark>markOfMax){
                            markOfMax = mark;
                        }
                        if(mark<markOfMin){
                            markOfMin = mark;
                        }

                        //xếp loại
                        if(mark>=9){
                            System.out.println("Xuất sắc");
                        }else if(mark>=8){
                            System.out.println("Giỏi");
                        }else if(mark>=7){
                            System.out.println("Khá");
                        }else  if(mark>=5){
                            System.out.println("Trung bình");
                        }else{
                            System.out.println("Yếu");
                        }

                        System.out.println("Bạn có nhập tiếp không (-1: kết thúc nhập): ");
                        inputContinue = sc.nextInt();
                    }while(inputContinue != -1);
                    break;
                case 2:
                    if(totalStudents==0){
                        System.out.println("Chưa nhập điểm học viên nào");
                    }else{
                        System.out.println("Tổng số học viên đã nhập: "+totalStudents);
                        System.out.println("Tổng điểm: "+totalMarks);
                        System.out.println("Điểm trung bình: "+totalMarks/totalStudents);
                        System.out.println("Điểm cao nhất: "+markOfMax);
                        System.out.println("Điểm thấp nhất: "+markOfMin);
                    }
                    break;
                case 3:
                    System.out.println("Tạm biệt!!!");
                    System.exit(0);
                default:
                    System.out.println("Bạn chỉ được chọn từ 1 đến 3");
            }
        }
    }
}
