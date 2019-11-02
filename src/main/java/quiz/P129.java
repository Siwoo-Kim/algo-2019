package quiz;

import quiz.chapter1.Counter;
import quiz.chapter1.VisualCounter;

/**
 * Created by sm123tt@gmail.com on 2019-11-02
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class P129 {

    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        final int MAX = Integer.parseInt(args[1]);
        Counter c = new VisualCounter("count", MAX);

        for (int i=0; i<N; i++) {
            if (c.tally() == MAX)
                while (c.tally() != 0)
                    c.decrement();
            else
                while (c.tally() != MAX)
                    c.increment();
        }
    }
}
