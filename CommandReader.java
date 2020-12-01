package javaICT4300;
import java.util.ArrayList;
import java.util.Scanner;

public class CommandReader {
public ArrayList<String> CommandInst(ArrayList<String> play){
    System.out.println("Hello, what can I do for you today?");
    System.out.println("Please enter create address, get, list, update, remove");
    Scanner t = new Scanner(System.in);
    String tempCase = t.nextLine();
    do {
        if(tempCase.equals("create address")) {
            CreateAddress createAddress = new CreateAddress();
            createAddress.Address(play);
        }
        else if (tempCase.equals("get")) {
            System.out.println("Please enter the street address");
            GetAddress getAddress = new GetAddress();
            getAddress.getAddress(play);
        }
        else if (tempCase.equals("list")){
            System.out.println("Here are the addresses listed");
            ListAddresses listAddress = new ListAddresses();
            listAddress.listAddress(play);
        }
        else if (tempCase.equals("update")){
            System.out.println("Enter in name, street, city, state, zip to update");
            UpdateAddress updateAddress = new UpdateAddress();
            updateAddress.updateAddress(play);
        }
        else if (tempCase.equals("remove")){
            System.out.println("Enter in the name, street, city, state, zip to remove");
            RemoveAddress removeAddress = new RemoveAddress();
            removeAddress.removeAddress(play);
        }
        else {
            System.out.println("I'm sorry I don't understand");

        }
        System.out.println("Hello, what can I do for you today?");
        tempCase = t.nextLine();
    } while (!tempCase.equals("goodbye"));  
    t.close();
    
    return play;
}
}