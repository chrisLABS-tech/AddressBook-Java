package javaICT4300;
import java.util.ArrayList;

public class AddressBookMain {
    public static void main(String[] args){

        AddressBook addressBook = new AddressBook();
        CommandReader addressBookReader = new CommandReader();

        ArrayList<String> play = new ArrayList<String>();
        play.add( "" + addressBookReader.CommandInst(addressBook.addressBook()));
    }   
}

