package Stack;
import java.util.Stack;

public class insertionStack {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        int pos=2;
        int x=10;
        Stack<Integer> rStack = new Stack<>();
        while(st.size()>=pos){
            rStack.push(st.pop());

        }
        st.push(x);
        System.out.println(st);
        System.out.println(rStack);
        while(rStack.size()>0){
            st.push(rStack.pop());
        }
        System.out.println(st);

    }
}
