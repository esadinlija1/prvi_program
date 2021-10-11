package ba.etf.unsa.rpr;
import java.util.Scanner;


public class MojaPrvaKlasa {
static int sumaCifara(int broj){
    int suma=0;
    if(broj>=1 && broj<=9)
        return broj;
    while(broj!=0){
        suma+=broj%10;
        broj/=10;
    }
    return suma;
}
    public static void main(String[] args) {
   Scanner ulaz=new Scanner(System.in);
   int n;
   System.out.println("Unesite broj n: ");
   n=ulaz.nextInt();
   System.out.println("Brojevi između 1 i " + n + " djeljivi sami sa sumom svojih cifara su: ");
   String s=new String("");
   for(int i=1;i<=n;i++){
       if(i%sumaCifara(i)==0) {
           s+=i+" ";
       }
   }
   System.out.println(s);

    }
}
