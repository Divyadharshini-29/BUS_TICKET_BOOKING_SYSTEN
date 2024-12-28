package Bus_Ticket_Reservation_system;

public class Bus {

          private int busNo;
          private boolean ac;
          private int capacity;
          Bus( int no, boolean ac, int cap){
               this.busNo = no;
               this.ac = ac;
               this.capacity = cap;

          }

          public int getCapacity () {
               return capacity;
          }
          public void setCapacity ( int cap){
               capacity = cap;
          }
          public boolean Ac () {
               return ac;
          }
          public void setAc ( int ac){
               ac = ac;
          }
          public int getBusno () {
               return busNo;
          }

          public void displayBusInfo () {
               System.out.println("Bus No :" + busNo + "Ac : " + ac + "Total Capacity: " + capacity);
          }

}
