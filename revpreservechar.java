//Reverse the characters while preserving the position of special characters and space within a word
 
import java.util.*;
import java.io.*;
public class revpreservechar
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
String s = "ym ^&an$em@#$ 321si ahens";
StringBuilder word=new StringBuilder();
StringBuilder sen=new StringBuilder();
Stack<Character> st=new Stack<Character>();
char []ch=s.toCharArray();
  for (int i=0;i<s.length();i++){
char c=ch[i];
if(Character.isLetterOrDigit(c))
{
st.push(c);
}
else
{
while(!st.isEmpty())
{
System.out.print(st.peek());
st.pop();
}
System.out.print(c);
}
}

while(!st.isEmpty())
{
System.out.print(st.peek());
st.pop();
}
}
}

sample 
i/p:
ym #$&an$em@#$ 321 si ahens
o/p:
my #$&na$me@#$ 123 is sneha
