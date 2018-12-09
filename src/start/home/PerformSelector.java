package start.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PerformSelector {
    private static  final ArrayList<String> performances = new ArrayList<>(Arrays.asList("1 perf","2 perf","3 perf ","4 perf"));

    public static String performanceSelect(){
        Random rand = new Random();
        return performances.get(rand.nextInt(performances.size()));
    }
}
