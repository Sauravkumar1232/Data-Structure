//import java.util.ArrayList;
//import java.util.Stack;
import java.util.*;

class BasicOfStack{ 
    public static void main(String[] args) {
        System.out.println("java");
      //  int[] arr = new int[5];
       // ArrayList<Integer> arr1= new ArrayList<>(); 
       
       
       Stack<Integer> st = new Stack<>();
        System.out.println("Stack size is= "+st.size());
        st.push(5);
        st.push(4);
        
        System.out.println(st.isEmpty());
        st.push(8);
        st.push(9);
        st.push(3);
        System.out.println(st.peek());
        System.out.println(st);
        // st.pop();
        // System.out.println(st);
        // st.pop();
      ///  System.out.println(st);
      System.out.println("Stack size is= "+st.size());

      while(st.size()>1){
        st.pop();
      }System.out.println(st);
      System.out.println(st);
    }
}