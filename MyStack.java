/**
 * Created by aman on 8/3/17.
 */

//Q1. Java program to implement stack using a queue

import java.util.LinkedList;
import java.util.Queue;
 
public class MyStack
{
    Queue<Integer> q = new LinkedList<Integer>();
     

    void push(int val) 
    {
        int size = q.size();
         
        q.add(val);
         
        for (int i = 0; i < size; i++)
        {
            int x = q.remove();
            q.add(x);
        }
    }
     
    int pop()
    {
        if (q.isEmpty()) 
        {
            System.out.println("No elements");
            return -1;
        }
        int x = q.remove();
        return x;
    }
     
    int top()
    {
        if (q.isEmpty())
            return -1;
        return q.peek();
    }
     
    boolean isEmpty()
    {
        return q.isEmpty();
    }
 
    public static void main(String[] args)
    {
        MyStack s = new MyStack();
        s.push(2);
        s.push(3);
        System.out.println("Top element :" + s.top());
        s.pop();
        s.push(4);
        s.pop();
        System.out.println("Top element :" + s.top());
    }
}