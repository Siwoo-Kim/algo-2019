package siwoo.chapter2;


public class Counter {  //Class Name

    private final String name;  //Instance variable
    private int count;          //Instance variable

    public Counter(String name) {   //Constructor
        this.name = name;
    }

    public void increment() {
        count++;
    }   //Instance method

    public int tally() {
        return count;
    }   //Instance method

    @Override
    public String toString() {                  //Instance method
        return count + " " + name;
    }

    public static void main(String[] args) {
        Counter heads = new Counter("heads");   //Initializing
        Counter tails = new Counter("tails");   //Initializing

        heads.increment();
        heads.increment();
        tails.increment();

        System.out.println(heads + " " + tails);
        System.out.println(heads.tally() - tails.tally());
    }
}
