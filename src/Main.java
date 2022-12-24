import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sayi;
        System.out.print("Sayı giriniz :");
        sayi=scanner.nextInt();
        if (asalMi(sayi,2)==1){
            System.out.println(sayi+" :asaldır.");
        }else{
            System.out.println(sayi+" : asal değil.");
        }

    }
    static int asalMi(int sayi,int y){
       if (y<sayi){
           if (sayi%y!=0){
               return(asalMi(sayi,++y));
           }else {
               return 0;
           }
       }
       return 1;
    }
}