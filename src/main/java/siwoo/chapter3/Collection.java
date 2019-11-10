package siwoo.chapter3;

import java.util.Iterator;
import java.util.Objects;

/**
 * Created by sm123tt@gmail.com on 2019-11-03
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public interface Collection<E> extends Iterable<E> {
    /**
     * true if bag is empty,
     * otherwise return false.
     * @return
     */
    boolean isEmpty();

    default boolean contains(E e) {
        Iterator<E> itr = iterator();
        while (itr.hasNext()) {
            if (Objects.equals(itr.next(), e))
                return true;
        }
        return false;
    };

    /**
     * return the number of elements in bag
     * @return size
     */
    int size();
}
