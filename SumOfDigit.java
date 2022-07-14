import java.util.Scanner;
class SumOfDigit
{
public static void main(String[] a)
{
  Scanner sc = new Scanner(System.in);

int num=0;
int digit=0;
int sum=0;
 System.out.println("Enter A Number");
 num = sc.nextInt();
while(num>0)
{
   digit = num%10;
   sum = sum + digit;
   num = num / 10;
}
 System.out.println("Sum of Digits:"+sum);
}
}