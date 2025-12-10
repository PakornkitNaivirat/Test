import java.util.Scanner;

public class Run {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        Fraction a1 = new Fraction(a,b);

         a = input.nextInt();
         b = input.nextInt();

        Fraction a2 = new Fraction(a,b);
        System.out.println(a1.isEqual(a2));




    }
}
