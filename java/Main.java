import java.util.ArrayList;

public class Main{
    public static void main(String [] args){
        
        ArrayList<ParkingTicket> lot = new ArrayList<>();
        
        lot.add(new ParkingTicket("T123", "ABC-1234", "10:00 AM"));
        lot.add(new ParkingTicket("T124", "XYZ-5678", "11:30 AM"));
        lot.add(new ParkingTicket("T125", "LMN-9012", "12:45 PM"));
        
         for(ParkingTicket t: lot){
            String summary = t.getSummary();
            System.out.println(summary);
        }   



        System.out.println("Finding ticket T124:");
        findTicket(lot, "T124");

        }


    }
}