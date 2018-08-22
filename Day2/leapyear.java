import java.util.Scanner;
class LeapYear
{
public static void main(String args[])
{
int x;
System.out.println("Enter  Year");
Scanner sc= new Scanner(System.in);
x= sc.nextInt();
if(x%4==0&&x%100==||x%400==0)
{
System.out.println("This is a Leap year");
}
else
{
System.out.println("is not a Leap year");
}
}
}



