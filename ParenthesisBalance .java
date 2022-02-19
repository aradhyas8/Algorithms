
 import java.io.*; 
import java.util.*;
 
 public class Solution{
    public boolean isBalanced(String s) {
        
        Stack<Character> st = new Stack<>();
        
         if(s.length() == 1){
            return false;
        }
        else{
            
        for(int i =0; i<s.length();i++) {
            
            
            char ch = s.charAt(i);
           if(st.empty()){
               st.push(ch);
           }
           else if(ch == '{' || ch == '[' || ch =='(') {
                st.push(ch);
            }
            else if(ch == ')'){
                if (st.peek() == '(') {
                    st.pop();
                }
                 else{
                return false;
            }
           
                
            }
            else if(ch == ']'){
                if (st.peek() == '[') {
                    st.pop();
                }
                 else{
                return false;
            }
           
               
            }
            
            else if(ch == '}'){
                if (st.peek() == '{') {
                    st.pop();
                }
                 else{
                return false;
            }
           
                
            }
            
           
            
        }
        }
        
       
        if(st.empty()){
            return true;
        }
        else{
            return false;
        }
        
        
        
    }
      public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isBalanced("()")); // should be true
        System.out.println(solution.isBalanced("(")); // should be false
        System.out.println(solution.isBalanced("(])")); // should be false
    }
}
