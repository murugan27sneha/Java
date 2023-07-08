//check whether the given substring is present in the string!

import java.util.*;
public class findsubsequence{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
String ch=sc.next();
String ch1=sc.next();
char []s=new char[ch.length()];
s=ch.toCharArray();
char[] s1=new char[ch1.length()];
s1=ch1.toCharArray();
int i=0,j=0;
while(j<ch1.length())
{
if(s[i]==s1[j])
{
i++;
if(ch.length()==i)
{
System.out.println("true");
break;
}
}


j++;
}
if(i!=ch.length())
{
System.out.println("false");
}
}
}