//Counting the frequency of the characters present in the string.
import java.util.*;
import java.io.*;

public class countchar
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

String s=sc.nextLine();
int len=s.length();
char ar[]=new char[100];
ar=s.toCharArray();
int i,j;
int k=1;
for(i=0;i<len;i++)
{
System.out.print(ar[i]);
}
System.out.println();

for(i=0;i<len-1;i++)
{

if(ar[i]==ar[i+1])
{
k++;
}
else
{
System.out.print(ar[i]);
System.out.print(k);
k=1;
}}
System.out.print(ar[len-1]);
System.out.print(k);
}}


sample input:
aaaaabbbccdcd

sample output:
aaaaa5bbb3cc2d1c1d1

