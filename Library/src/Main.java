import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Clock<String, Integer> c;
        Pair<String, Integer> p;
        c = new Clock<>("Twenty hour : ", 49);
        p = new Pair<> ("Hello ", 68);
        System.out.print(p.getGenE());
        System.out.println(p.getGenT());
        System.out.print(c.getHour());
        System.out.println(c.getMinute());
    }
}
