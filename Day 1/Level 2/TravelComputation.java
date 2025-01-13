import java.util.Scanner;

// Create TravelComputation Class to compute the Distance and Travel Time
class TravelComputation {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
      // Create a variable name to indicate the person traveling
      String name = sc.nextLine();
      // Create a variable fromCity, viaCity and toCity to indicate the city
      // from city, via city and to city the person is travelling
      String fromCity = sc.nextLine(), viaCity = sc.nextLine(), toCity = sc.nextLine();
      // Create a variable distanceFromToVia to indicate the distance 
      // between the fromCity to viaCity
      double distanceFromToVia = sc.nextDouble();
      // Create a variable distanceViaToFinalCity to indicate the distance 
      // between the viaCity to toCity
      double distanceViaToFinalCity = sc.nextDouble();
      int hoursFromToVia = sc.nextInt();
      int minFromToVia = sc.nextInt();
      int timeFromToVia = hoursFromToVia*60+minFromToVia;
      int hoursViaToFinalCity = sc.nextInt();
      int minuteViaToFinalCity = sc.nextInt();
      int timeViaToFinalCity = hoursViaToFinalCity*60+minuteViaToFinalCity;//Total time in minutes
      // Create a variable totalDistance to indicate the total distance
      // between the fromCity to toCity
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;
      // Create a variable totalTime to indicate the total time taken to
      // travel from fromCity to toCity in minutes
      int totalTime = timeFromToVia + timeViaToFinalCity;
      System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +" is " + totalDistance + " km and " +"the Total Time taken is " + totalTime + " minutes");
   }
}