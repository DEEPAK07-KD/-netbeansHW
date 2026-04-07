
package transportmanagement;
 abstract class Transport {
     int id;
     String name;
     String fcity = "Chennai";
    String tcity;
    double dis;
    double fare;
    abstract void calculateFare();
    
    void displayTicket() {
        System.out.println("\n----- TICKET DETAILS -----");
        System.out.println("Passenger ID   : " + id);
        System.out.println("Passenger Name : " + name);
        System.out.println("Route          : " + fcity + " -> " + tcity);
        System.out.println("Distance       : " + dis + " km");
        System.out.println("Total Fare     : ₹" + fare);
    }
}
