package Bus_Ticket_Reservation_system;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
    String PassengerName;
    int Busno;
    Date Date;


    Booking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of passenger :");
        PassengerName = scanner.next();
        System.out.println("Enter bus no: ");
        Busno = scanner.nextInt();
        System.out.println("Enter date dd-mm-yyyy");
        String dateInput = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
               int capacity  =0;
               for(Bus bus : buses){
                   if(bus.getBusno() == Busno)
                       capacity = bus.getCapacity();
               }
               int booked =0;
               for(Booking b : bookings){
                   if(b.Busno == Busno && b.Date.equals(Date)){
                       booked++;
                   }
               }
               return booked<capacity?true:false;
    }
}
