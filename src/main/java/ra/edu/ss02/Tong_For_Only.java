package ra.edu.ss02;

public class Tong_For_Only {
    public static void main(String[] args) {

        for(int i=1,tong=0; i<=100; i+=2){
            tong += i;
            if(i<99)
                continue;

            System.out.println("Tổng các số lẻ từ 1 đến 100 là: "+tong);
        }

    }
}
