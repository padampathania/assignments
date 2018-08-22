import java.util.Scanner;
class Lar No
{
public static void main(String args[])
{
int p,q,r;
Scanner sc= new Scanner(System.in);
p= sc.nextInt();
q= sc.nextInt();
r= sc.nextInt();
if(p>=q && p>=r)
{
System.out.println("p is largest");
}
else if(q>=p && q>=r)
{
System.out.println("q is largest");
}
else 
{
System.out.println("r is largest");
}
}
}
