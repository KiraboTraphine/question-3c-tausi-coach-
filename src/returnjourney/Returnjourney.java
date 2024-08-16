package returnjourney;


public class Returnjourney {

       public static void main(String[] args) {
        int totalDistance = 10000; // in km
        int speed = 250; // in km/h
        int refuelStopDistance = 200; // in km
        int stopTimeMinutes = 5; // time per stop in minutes

        int refuelStops = totalDistance / refuelStopDistance;

        double travelTimeHours = (double) totalDistance / speed; // travel time in hours
        double stopTimeHours = (double) refuelStops * stopTimeMinutes / 60; // stop time in hours

        double totalTimeHours = travelTimeHours + stopTimeHours;

        System.out.println("The total time taken for the return journey from Kabale to Kampala is " + totalTimeHours + " hours.");
    }
}

        
    
    

