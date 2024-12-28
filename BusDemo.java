package Bus_Ticket_Reservation_system;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public static void main(String args[]){
       // Bus buses[] = new Bus[50]; //ArrayList - collections

        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, true, 2));
        buses.add(new Bus(3, false, 2));
        buses.add(new Bus(4, true, 2));

//        Bus bus1 = new Bus();
//        Bus bus2 = new Bus();
        int userOpt = 1;
        Scanner in = new Scanner(System.in);

        for(Bus b : buses){
            b.displayBusInfo();
        }
        while(userOpt==1) {

            System.out.println("Enter 1 to Book and 2 tp exit :");
            userOpt = in.nextInt();
            if(userOpt ==1){
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                }else{
                    System.out.println("Sorry, Bus is full. try another bus or date..");
                }
                System.out.println("Booking....");
            }else{
                System.out.println("Your expected date is not available Try another date to book");
            }
        }
    }
}
