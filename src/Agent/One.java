package Agent;

import java.util.ArrayList;

public class One {


    private ArrayList<String>strings;

    public ArrayList<String> getStrings() {
        return strings;
    }

    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }

    public void fillString(){
        strings= new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            strings.add("ala"+i);

        }
    }
}
