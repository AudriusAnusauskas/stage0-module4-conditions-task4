package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if ((first > second && first > third) || (first == second && first > third) || (first == third && first > second)){
            System.out.println(first);
        } else if ((second > first && second > third) || (second == first && second > third) || (second == third && second > second)){
            System.out.println(second);
        } else System.out.println(third);
    }
}
