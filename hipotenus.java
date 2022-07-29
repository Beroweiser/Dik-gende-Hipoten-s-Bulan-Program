import java.util.Scanner;
/**
 * hipotenus
 */
public class hipotenus {

    public static void main(String[] args) {
        int a,b;
        double c,u,alan;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz: ");
        a = girdi.nextInt();
        System.out.print("İkinci kenarı giriniz: ");
        b = girdi.nextInt();
        
        c = Math.sqrt((a*a) + (b*b));
        u = (a+b+c)/2;
        alan = Math.sqrt( u*(u-a)*(u-b)*(u-c));

        System.out.println("Ucgenin; \nHipotenüsü: "+ c +"\nCevresi: "+ 2*u + "\nAlanı:"+alan);

    }
}