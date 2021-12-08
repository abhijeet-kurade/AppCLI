package CommandsHandler;

import picocli.CommandLine;

@CommandLine.Command(name="ALLOT_WATER")
public class AllotWaterCommand implements Runnable{
    @CommandLine.Option(names = {"-apt"})
    int apt_type;
    @CommandLine.Option(names = {"-corp"})
    int corp_water_ratio;
    @CommandLine.Option(names = {"-borewell"})
    int borewell_water_ratio;

    @Override
    public void run() {
        System.out.println("ALLOT_WATER Command is running. " + apt_type +" "+corp_water_ratio);
    }
}
