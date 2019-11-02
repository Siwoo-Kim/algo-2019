package siwoo.chapter2;

import edu.princeton.cs.algs4.StdRandom;

public class Flips {

    //Client 코드을 구현해 Counter 가 필요한 연산을 확인한다.
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        for (int t=0; t<T; t++) {
            if (StdRandom.bernoulli(0.5))
                heads.increment();
            else
                tails.increment();
        }
        System.out.println(heads);
        System.out.println(tails);
        int delta = heads.tally() - tails.tally();
        System.out.println("delta: " + Math.abs(delta));
    }
}
