package Stack;

import java.util.Stack;

public class  ReverseStack {

    public static void pushAtBottom(int top,Stack<Integer> st){
        if(st.size()==0){
            st.push(top);
           return;
        }
        int x = st.pop();
        pushAtBottom(top, st);
        st.push(x);
        

    }



    public static void reverseRec(Stack<Integer> st) {
        if(st.size()==1) return;
        int top = st.pop();
        reverseRec(st);
        pushAtBottom(top,st);
    }



    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverseRec(st);
       System.out.println(st);
       // ITERATIVELY
        // Stack<Integer> rStack = new Stack<>();
        // while(st.size()>0){
        //     rStack.push(st.pop());
        // }
        // Stack<Integer> qStack = new Stack<>();
        // while(rStack.size()>0){
        //     qStack.push(rStack.pop());
        // }
        // while(qStack.size()>0){
        //     st.push(qStack.pop());
        // }
        // System.out.println(st );
        
    }
}
