package quiz.chapter1;

/**
 * Created by sm123tt@gmail.com on 2019-11-02
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class LoggedBinarySearch implements BinarySearch {
    private Counter counter;

    public LoggedBinarySearch(Counter counter) {
        this.counter = counter;
    }

    @Override
    public int rank(int[] a, int el) {
        return rank(a, el, 0, a.length-1);
    }

    private int rank(int[] a, int el, int low, int high) {
        if (low > high) return -1;
        counter.increment();
        int mid = (low + high) / 2;
        if (a[mid] < el)
            return rank(a, el, mid+1, high);
        else if (a[mid] > el)
            return rank(a, el, low, mid-1);
        else
            return mid;
    }
}
