package siwoo.chapter4;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.Transaction;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Stack;

/**
 * Created by sm123tt@gmail.com on 2019-11-10
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class BinaryHeap<E extends Comparable<E>> implements PriorityQueue<E> {
    private E[] elements;
    private int N;

    @SuppressWarnings("unchecked")
    public BinaryHeap(int N) {
        elements = (E[]) new Comparable[N+1];
    }

    @Override
    public void enqueue(E element) {
        elements[++N] = element;
        swim(N);
    }

    @Override
    public E dequeue() {
        if (isEmpty())
            throw new NoSuchElementException();
        E e = elements[1];
        swap(1, N--);
        elements[N+1] = null; //GC help
        sink(1);
        return e;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public boolean contains(E e) {
        for (E el: elements)
            if (Objects.equals(el, e))
                return true;
        return false;
    }

    @Override
    public int size() {
        return N;
    }

    @Override
    public Iterator<E> iterator() {
        return new BinaryHeapIterator<E>();
    }

    private class BinaryHeapIterator<E> implements Iterator<E> {
        int i = N;

        @Override
        public boolean hasNext() {
            return i != 0;
        }

        @SuppressWarnings("unchecked")
        @Override
        public E next() {
            return (E) elements[i--];
        }
    }

    private void swim(int k) {
        while (k > 1 && less(elements[k >>> 1], elements[k])) {
            int parent = k >>> 1;
            swap(parent, k);
            k = parent;
        }
    }

    private void sink(int k) {
        while ((k << 1) <= N) {
            int child = k << 1;
            if (child < N && less(elements[child], elements[child+1]))
                child++;
            if (!less(elements[k], elements[child]))
                return;
            swap(k, child);
            k = child;
        }
    }

    private boolean less(E a, E b) {
        return b.compareTo(a) < 0;
    }

    private void swap(int i, int j) {
        if (i == j) return;
        E e = elements[i];
        elements[i] = elements[j];
        elements[j] = e;
    }

    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        PriorityQueue<Transaction> pq = new BinaryHeap<>(M+1);
        while (StdIn.hasNextLine()) {
            pq.enqueue(new Transaction(StdIn.readLine()));
            if (pq.size() > M)
                pq.dequeue();
        }
        for (Transaction t: pq)
            System.out.println(t);
        Stack<Transaction> stack = new Stack<>();
        while (!pq.isEmpty())
            stack.push(pq.dequeue());
        for (Transaction t: stack)
            System.out.println(t);
    }
}





























