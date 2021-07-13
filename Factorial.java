import java.util.*;
class Fact
{
public void fact()
{
int f=1,i,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value : ");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
f=f*i;
}
System.out.println("Factorial of "+n+" is : "+f);
}
public void display()
{
fact();
}
}
public class Factorial
{
public static void main(String args[])
{
Fact a=new Fact();
a.display();
}
}

output:

Enter n value : 
5
Factorial of 5 is : 120
