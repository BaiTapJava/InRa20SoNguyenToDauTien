import java.util.Scanner;

public class InRaSoNguyenTo {
    public static void main(String[] args) {
        System.out.println("----In Ra 20 Nguyen So Dau Tien ------");

        Scanner input = new  Scanner(System.in);


        System.out.println("Nhap so numbers : ");
        int numbers = input.nextInt();

        int count =0;

        for (int  N= 2 ; N< numbers; N++)
        {
            for (int M =1 ; M<=N; M++)
            {
                if (N%M ==0)
                    count ++;
            }
            if (count==2)
            {
                System.out.println("So nguyen to la: "+ N);
            }
            count =0;
        }

    }
}
