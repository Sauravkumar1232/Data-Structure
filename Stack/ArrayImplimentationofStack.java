package Stack;
import java.util.*;

class Stack{
    int[] arr = new int[5];
    int idx=0;
    void push(int x){
        if(isFull()){
            System.out.println("Stack is Full"); return;  
        }
     arr[idx]=x;
     idx++;
 } 
 int pop(){
     if(idx==0){
         System.out.println("Stack is Empty");
         return -1;
     }
     int top = arr[idx-1];
     arr[idx-1]=0;
     idx--;

     return top;
 }

 int peek(){
     if(idx==0) {
         System.out.println("Stack is Empty");return -1;
      }
      else{
         return arr[idx-1];

      }

 }
 void display(){
     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
     }System.out.println();
 }
int size(){
    return idx;
}

boolean isEmpty(){
    if(idx==0) return true;
    else return false;
}
boolean isFull(){
    if(arr.length==idx) return true;
    else return false;
}
int capacity(){
    return arr.length;
}

}


class ArrayImplementationofStack{
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.pop();
        st.push(1);

        //st.display();
        
        st.display();
        System.out.println(st.size());
        st.pop();
        System.out.println(st.size());
        System.out.println(st.isFull());
        st.push(0);
        System.out.println(st.isFull());
        st.push(76);
}
}