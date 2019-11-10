package siwoo.chapter3;

/**
 * Created by sm123tt@gmail.com on 2019-11-03
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public interface Queue<E> extends Collection<E> {
    /**
     * Add element in the last of the queue
     * @param element
     */
    void enqueue(E element);

    /**
     * return the first element of the queue
     * @return
     */
    E dequeue();

    E peek();
}
