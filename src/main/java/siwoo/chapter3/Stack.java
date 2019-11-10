package siwoo.chapter3;

/**
 * Created by sm123tt@gmail.com on 2019-11-03
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public interface Stack<E> extends Collection<E> {

    /**
     * Add element at the last of the stack
     * @param element
     */
    void push(E element);

    /**
     * return element at the last of the stack
     * @return
     */
    E pop();
}
