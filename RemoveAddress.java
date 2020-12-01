package javaICT4300;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAddress {

    Scanner t = new Scanner(System.in);

    public ArrayList<String> removeAddress (ArrayList<String> play){

        String name = t.nextLine();

        for (String s : play) {
            if (s.contains(name)) {
                if (play.size() == 1) {
                    play.clear();
                    return play;
                }
                else{
                play.remove(play.indexOf(s));
                 return play;
                }
            }
        }
        return play;
    }
}
