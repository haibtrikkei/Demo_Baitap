package ra.edu.ss02;

public class TongChan_For {
    public static void main(String[] args) {
        int tongchan = 0;
        for(int i=0;i<=100;i+=2){
            tongchan = tongchan + i;
        }
        System.out.println("Tổng các số chẵn từ 1 đến 100 là: "+tongchan);
    }
}
