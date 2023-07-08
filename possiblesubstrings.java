//Find all the posiible substrings for the given string and find the palindrome
import java.util.*;
public class possiblesubstrings{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
int len=s.length();
int temp=0;
String[] arr=new String[len*(len+1)/2];
int i,j;
for(i=0;i<len;i++)
{
for(j=i;j<len;j++)
{
arr[temp]=s.substring(i,j+1);
System.out.println(arr[temp]);
temp++;
}}
for(i=0;i<len;i++){
String c=arr[i];
StringBuffer bf=new StringBuffer(c);
bf.reverse();
String s2=bf.toString();
//System.out.println("palindrome"+bf);
if(s2.equals(c) && s2.length()!=1)
{
System.out.println("palindrome:"+c);
}
}
}}