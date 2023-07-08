import java.util.*;
import java.io.*;
//substring palindrome
public class substringpalindrome
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

String s=sc.next();
int len=s.length();
String ar[]=new String[len*(len+1)/2];
int i,j;
int k=0;
for(i=0;i<len;i++)
{
for(j=i;j<len;j++)
{
ar[k]=s.substring(i,j+1);

String sample=ar[k];
int n=sample.length();
StringBuffer bf=new StringBuffer(sample);
bf.reverse();
String s2=bf.toString();

if((s2.equals(ar[k]))&&(n!=1))
{
System.out.println("palindrome:"+ar[k]);
}


k++;
}
}

}}