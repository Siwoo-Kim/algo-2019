package siwoo.chapter4;

import siwoo.chapter3.List;

/**
 * Created by sm123tt@gmail.com on 2019-11-10
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public interface ListPriorityQueue<E extends Comparable<E>> extends PriorityQueue<E>, List<E> {

    /**
     * insert element; associate it with index
     * @param index
     * @param e
     */
    @Override
    void add(int index, E e);

    /**
     * change the element associated with index to element
     * @param index
     * @param e
     */
    @Override
    void set(int index, E e);

    /**
     * remove index and its associated element
     * @param index
     */
    @Override
    void delete(int index);

    @Override
    void get(int index);
}
