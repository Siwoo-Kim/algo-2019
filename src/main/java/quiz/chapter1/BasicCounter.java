package quiz.chapter1;

/**
 * Created by sm123tt@gmail.com on 2019-11-02
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class BasicCounter implements Counter {
    private String name;
    private int v;

    public BasicCounter(String name) {
        this.name = name;
    }

    @Override
    public void increment() {
        v++;
    }

    @Override
    public void decrement() {
        v--;
    }

    @Override
    public int tally() {
        return v;
    }

    @Override
    public String toString() {
        return String.format("%s = %d", name, v);
    }
}
