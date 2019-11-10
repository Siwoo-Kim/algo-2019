package siwoo.chapter3;


import edu.princeton.cs.algs4.StdIn;

import java.util.Iterator;

/**
 * Created by sm123tt@gmail.com on 2019-11-03
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class FixedCapacityStack<E> implements Stack<E> {
    private E[] elements;
    private int N;

    public FixedCapacityStack(int N) {
        elements = (E[]) new Object[N];
    }

    @Override
    public void push(E el) {
        if (N == elements.length)
            newCapacity(elements.length * 2);
        elements[N++] = el;
    }

    private void newCapacity(int n) {
        E[] newArray = (E[]) new Object[n];
        System.arraycopy(elements, 0, newArray, 0, N);
    }

    @Override
    public E pop() {
        E el = elements[--N];
        elements[N] = null;
        if (N!=0 && N < (elements.length/4))
            newCapacity(elements.length / 2);
        return el;
    }


    @Override
    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public int size() {
        return N;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    public static void main(String[] args) {
        Stack<String> stack = new FixedCapacityStack<>(100);
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("-"))
                System.out.println(stack.pop() + " ");
            else if (!s.isEmpty())
                stack.push(s);
        }
        System.out.println("(" + stack.size() + " left on stack)");
    }
}
