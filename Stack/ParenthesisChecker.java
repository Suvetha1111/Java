class Solution
{//Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    { // add your code here
       Stack<Character> s=new Stack<>();
       int i;
       for(i=0;i<x.length();i++)
       {
         char ch=x.charAt(i);
          if(ch=='{'||ch=='('||ch=='[')
             s.push(ch);
          else
            {
                if(s.isEmpty())
                  return false;
                char top=s.pop();
                if(ch=='}'&&top!='{')
                  return false;
                else if(ch==')'&&top!='(')
                  return false;
                else if(ch==']'&&top!='[')
                  return false;
            }
       }
       return s.isEmpty();
    }
}
