package siwoo.chapter4;

import siwoo.chapter3.Queue;

/**
 * Created by sm123tt@gmail.com on 2019-11-10
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public interface PriorityQueue<E> extends Queue<E> {

    default E maxPriority() {
        return peek();
    };

}
