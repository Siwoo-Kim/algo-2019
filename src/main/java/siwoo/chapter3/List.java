package siwoo.chapter3;

/**
 * Created by sm123tt@gmail.com on 2019-11-10
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public interface List<E> extends Collection<E> {

    void add(int index, E e);
    void set(int index, E e);
    void delete(int index);
    void get(int index);
}
