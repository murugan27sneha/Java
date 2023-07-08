//Reversing the characters while preserving the position of space
import java.io.*;
import java.util.*;
public class reverseandprepos
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char[] ch=s.toCharArray();
char[] res=new char[ch.length];
int i,j;
for(i=0;i<ch.length;i++)
{
if(ch[i]==' ')
{
res[i]=' ';
}
}
j=res.length-1;
for(i=0;i<res.length;i++)
{
if(ch[i]!=' ')
{
if(res[j]==' ')
{
j--;
}
res[j]=ch[i];
j--;
}}
System.out.println(String.valueOf(res));
}}