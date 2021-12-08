package CommandsHandler;

import picocli.CommandLine;

public class AddGuests implements Runnable{
    @CommandLine.Option(names={"-guests"})
    int guests;
    @Override
    public void run(){
        System.out.println("Guests" + guests);
    }
}
