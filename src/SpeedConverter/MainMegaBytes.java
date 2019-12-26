package SpeedConverter;

public class MainMegaBytes {
    public static void main (String[]Args){
        long miles = SpeedConverter.toMilesPerHour(34);
        System.out.println("Miles: " + miles);
        SpeedConverter.printConversion(34);
    }
}
