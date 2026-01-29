import java.util.Scanner;
    public class Code6 {
         public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("Enter the number:"+n);

            if(n%2==0)
            System.out.println("The given number is even");
            else
            System.out.println("The given number is odd");

    }
}