package Agent;

import java.util.ArrayList;

public class Two {

    public static void main(String[] args) {
        One one = new One();
        one.fillString();
        ArrayList<String>strings = one.getStrings();
        System.out.println(strings);
        Three three = new Three();
        three.changeArray(one);
        System.out.println(strings);
    }
}
