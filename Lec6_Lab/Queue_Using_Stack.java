package AE.Lec6_Lab;

import java.util.Stack;

public class Queue_Using_Stack {

    Stack<Integer>s1;
    Stack<Integer>s2;
    public Queue_Using_Stack() {
        s1=new Stack<>();
        s2=new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if(s2.size() == 0){
            while(s1.size() > 0)s2.push(s1.pop());
        }
        return s2.pop();

    }

    public int peek() {
        if(s2.size()==0){
            while(s1.size()>0)s2.push(s1.pop());
        }
        return s2.peek();
    }

    public boolean empty() {
        if(s1.size()==0&&s2.size()==0)return true;
        return false;
    }
}
