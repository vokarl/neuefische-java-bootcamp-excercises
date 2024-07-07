package oop.staticExercise;

public class Counter {

    public static int totalCount = 0;


    public int instanceCount = 0;


    public Counter() {
    }


    public static void incrementTotalCount() {
        totalCount++;
    }


    public void incrementInstanceCount() {
        instanceCount++;
    }


    @Override
    public String toString() {
        return "Total Count: " + totalCount + ", Instance Count: " + instanceCount;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();


        Counter.incrementTotalCount();
        Counter.incrementTotalCount();
        Counter.incrementTotalCount();


        counter1.incrementInstanceCount();
        counter2.incrementInstanceCount();
        counter2.incrementInstanceCount();


        System.out.println(counter1);
        System.out.println(counter2);
        System.out.println(counter3);
    }
}
