//Rotate the characters by the given number of operations.
import java.util.*;
import java.lang.*;
import java.io.*;

public class rotatecharacters
{
	public static void main (String[] args)
	{
LinkedList <Integer> l=new LinkedList<Integer> ();
int n,i;
int op;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();// get the number of elements in the array
op=sc.nextInt();//get the number of operations
for(i=0;i<n;i++)
{
int a=sc.nextInt();
l.add(a);
}

int c=0;
while(c<op)
{
i=0;
int b=l.get(i);
l.remove(i);
l.addLast(b);
c++;
}
System.out.println(l);

}
	}

