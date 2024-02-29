import java.util.*;

public class MainPage {
    public static void main(String[] args) {
        LinkedList<Integer> one = new LinkedList<>();
        LinkedList<Integer> two = new LinkedList<>();

        one.push(9);
        one.push(8);
        one.push(7);
        one.push(6);
        one.push(5);
        one.push(4);

        two.push(9);
        two.push(8);
        two.push(7);
        two.push(6);
        two.push(5);
        two.push(4);

        LinkedList<Integer> three = new LinkedList<>();
        for (int x : one) {
            three.poll();

        }
        for (int x : three) {
            System.out.println(three.get(x));
        }

    }

}
