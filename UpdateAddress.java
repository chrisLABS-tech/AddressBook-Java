package javaICT4300;
import java.util.ArrayList;
import java.util.Scanner;

public class UpdateAddress {
    Scanner t = new Scanner(System.in);
    public ArrayList<String> updateAddress (ArrayList<String> play){

        String name = t.nextLine();

        for (String s : play) {
            if (s.contains(name)) {
                play.remove(play.indexOf(s));
                CreateAddress createAddress = new CreateAddress();
                createAddress.Address(play);
                System.out.println(play);
            }
        }
        return play;

    }
}