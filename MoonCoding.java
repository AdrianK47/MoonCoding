public class MoonCoding{
    public static void main(String args[]){
        int distance = 380000;
        int speedPerSec = 10;
        double time;

        time = (distance/(((speedPerSec*60)*60) + 0.5));

        System.out.println("It would take " + time + " hours to reach the moon");


        int speedChangeH = 2000;
        int speedChangeV = 3000;
        double totalSpeedChange;

        totalSpeedChange = Math.sqrt(((speedChangeH * speedChangeH) + (speedChangeV * speedChangeV)));

        System.out.println("The total speed change needed is " + totalSpeedChange + " m/sec");

        // Complete #3 on the HW
    }
}