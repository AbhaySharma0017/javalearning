//17) 1 	2	 4	 7	 11	 16 	…… n terms
import java.util.Scanner;
class Series2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n =sc.nextInt();

        int a =1;
        for(int i=1; i<=n; i++)
        {
           System.out.print(a+" ");
           a+=i;
        }
    }
}