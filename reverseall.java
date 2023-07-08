//Reversing the characters while preserving the position of specialcharacters and space 
import java.util.*;
public class reverseall{
public static void main(String []args)
{
Stack<Character> st=new Stack<Character>();
String s="my #$&na$me@#$";
int i;
char []ch=new char[100];
for(i=0;i<s.length();i++)
{
if(s.charAt(i)=='^'||s.charAt(i)=='&'||s.charAt(i)=='$'||s.charAt(i)=='@'||s.charAt(i)=='#'||s.charAt(i)==' ')
{
ch[i]=s.charAt(i);
}
else
{
char c=s.charAt(i);
st.push(c);
}
}
for(i=0;i<s.length();i++)
{
if(s.charAt(i)=='^'||s.charAt(i)=='&'||s.charAt(i)=='$'||s.charAt(i)=='@'||s.charAt(i)=='#'||s.charAt(i)==' ')
{
System.out.print(ch[i]);
}
else
{
System.out.print(st.peek());
st.pop();
}
}
}}

Sample
i/p:
my #$&na$me@#$
o/p:
em #$&an$ym@#$