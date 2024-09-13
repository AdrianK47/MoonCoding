public class MoonCoding{
    public static void main(String args[]){
        int distance = 380000;
        int speedPerSec = 10;
        double time;

        time = (distance/(((speedPerSec*60)*60) + 0.5));

        System.out.println("It would take " + time + " hours to reach the moon"); //#1


        int speedChangeH = 2000;
        int speedChangeV = 3000;
        double totalSpeedChange;

        totalSpeedChange = Math.sqrt(((speedChangeH * speedChangeH) + (speedChangeV * speedChangeV)));

        System.out.println("The total speed change needed is " + totalSpeedChange + " m/sec"); //#2

        // Complete #3 on the HW

        int radiusKM = 1731;
        double radiusM = radiusKM * 1000;
        double pi = 3.14;
        double surfaceV = (4*pi*(Math.pow(radiusM,2.0)))*0.001;

        System.out.println("The surface volume of the moon that is 1 millimeter thick is " + surfaceV + " mm."); //3a

        int density = 3000;
        int metricTons = (int)((surfaceV * density) / 1000);

        System.out.println("There is " + metricTons + " metric tons of regolith");

        double litersWater = metricTons * 0.25;

        System.out.println(litersWater + " liters of water could be recovered from the 1 millimeter thick surface layer.");
    }
}