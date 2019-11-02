package quiz;

/**
 * Created by sm123tt@gmail.com on 2019-11-02
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class P127 {

    public static void main(String[] args) {
        assert mystery("abcd").equals("dcba");
        assert mystery("Hello World").equals("dlroW olleH");
    }

    static String mystery(String s) {
        final int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return mystery(b) + mystery(a);
    }
}
