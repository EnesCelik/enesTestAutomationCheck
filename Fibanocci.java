package Mulakat;

public class Fibanocci {
    public static void main(String[] args) {
        int f=0;
        int s=1;
        int n=10;

        for(int i=1 ;i<=16;i++){
            System.out.print(f + " ");
            int third = f+s;
            f = s ;
            s = third;
        }
    }
}
