import CommandsHandler.AllotWaterCommand;
import picocli.CommandLine;

public class GeekTrust {
    public static void main(String[] args) {
        CommandLine allotWater = new CommandLine(new AllotWaterCommand());
        allotWater.execute(new String[]{"-apt=4", "-corp=9"});
        allotWater.execute(new String[]{"-apt=41", "-corp=15"});
        allotWater.execute(new String[]{"-apt=42", "-corp=56"});
    }
}
