
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char operator;
        double c;
        System.out.println(" select operators +,-,*,/");
        operator=sc.next().charAt(0);
        System.out.println("enter the value of a");
        double a=sc.nextDouble();
        System.out.println("enter the value of b");
        double b=sc.nextDouble();
        switch(operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
            case '*':
                System.out.println(a*b);
            case '/':
                System.out.println(a/b);

        }
    }
}
