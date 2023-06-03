package Stack;

import java.util.Stack;

public class Display {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        // Stack<Integer> tempStack = new Stack<>();
        // while(st.size()>0){
        //     int x=st.pop();
          
        //     tempStack.push(x);
        // }System.out.println(tempStack);

        // while(tempStack.size()>0){
        //     int x=tempStack.pop();
        //     System.out.print(x+" ");
        //     st.push(x);
        // }
        int n=st.size();
        int[] arr = new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=st.pop();
        }
        for (int i = 0; i < n; i++) {
            int c=arr[i];
            System.out.print(arr[i]+" ");
            st.push(c);
        }

    
    
    }
}
