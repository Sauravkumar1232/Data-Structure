package Stack;
import java.util.*;

public class MoveStackInSameOrder {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        
        // System.out.println("Enter The number of ele of Stack");
        // int n=sc.nextInt();
        // System.out.println("Enter the ele : " );
        // for(int i=0;i<n;i++){
        //     int x=sc.nextInt();
        //     st.push(x);
        // }
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        Stack<Integer> gStack = new Stack<>();
        while(st.size()>0){
            // int x=st.pop(); rStack.push(x);
            gStack.push(st.pop());
        }
        Stack<Integer> rStack = new Stack<>();
        while(gStack.size()>0){
            // int x=st.pop(); rStack.push(x);
            rStack.push(gStack.pop());
        }
        System.out.println(rStack);
    }
}
