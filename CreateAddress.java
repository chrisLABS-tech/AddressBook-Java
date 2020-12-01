package javaICT4300;
import java.util.Scanner;
import java.util.ArrayList;


public class CreateAddress {

    Scanner input = new Scanner(System.in);

    public ArrayList<String> Address(ArrayList<String> play) {
        System.out.println("Enter name, street, city, state, zip: ");
        String name = input.nextLine();
        play.add(name);
        return play;
    }
}