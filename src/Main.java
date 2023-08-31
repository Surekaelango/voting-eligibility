import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            Scanner obj=new Scanner(System.in);
            int a= obj.nextInt();
            if(a>=18)
            {
                System.out.println("eligible to vote");
            }
            else
            {
                System.out.println("not eligible to vote");
            }
        }
    }
}