import java.util.Scanner;

public class ebob {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n1,n2;
        System.out.print("Enter The n1 Number: ");
        n1= input.nextInt();

        System.out.print("Enter The n2 Number: ");
        n2 = input.nextInt();

        int ebob = 0, i=1 , k= 1;

        while ( i <= (n1 * n2)){
            if (i % n1 == 0 && i % n2 == 0 ){
                System.out.println("EKOK: "+i);
                break;
            }
            i++;
        }

        while ( k<= n1 ){
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
            }
            k++;
        }
        System.out.print("EBOB: "+ebob);
       // System.out.println((n1 * n2) / ebob);
        /*
        int ebob=1;

        birim maliyeti 18 döngü (18 ve 24 için)
        for (int i = 1; i<= n1; i++){
            if (n1%i==0 && n2%i==0){
                System.out.println(i);
                ebob=i;
            }
        }
        System.out.println("===============");
        // birim maliyeti 14 döngü (18 ve 24 için)
        for (int k = n1; k>= 1; k--){
            if (n1%k==0 && n2%k==0){
                ebob = k;
                System.out.println(ebob);
                break;
            }
        }*/
    }
}
