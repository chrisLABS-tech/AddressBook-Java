package javaICT4300;
import java.util.ArrayList;
import java.util.Scanner;


public class GetAddress {

    Scanner t = new Scanner(System.in);

    public ArrayList<String> getAddress (ArrayList<String> play) {
        String name = t.nextLine();
        for (String s : play) {
            if (s.contains(name)) {
                System.out.println(s);
            }
        }

        return play;
    }



}