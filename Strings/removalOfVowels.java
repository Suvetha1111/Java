class HelloWorld {
public static void main(String[] args) {
String s="suvetha";
//StringBuilder sbr=new StringBuilder();
String vowels="aeiouAEIOU";
String m="";
for(char c:s.toCharArray())
{
    if(vowels.indexOf(c)==-1)
    {
        m+=c;//sbr.append(c);
    }
}
System.out.println(m);
    }
}
