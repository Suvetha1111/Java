
class HelloWorld {
    public static void main(String[] args) {
        String s="su)ve(th(a(dh)iya)";
        String si="";
       for(char c:s.toCharArray())
       {
           if(c==')'||c=='(')
           {
              continue;
           }
           si+=c;
       }
        System.out.println(si);
    }
}
