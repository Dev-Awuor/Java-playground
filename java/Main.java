import java.util.ArrayList;

public class Main{
    public static void main(String [] args){
        
        ArrayList<ParkingTicket> lot = new ArrayList<>();
        
        lot.add(new ParkingTicket("T123", "ABC-1234", "10:00 AM"));
        lot.get(0).setExitTime("2:00 PM");
        lot.add(new ParkingTicket("T124", "XYZ-5678", "11:30 AM"));
        lot.add(new ParkingTicket("T125", "LMN-9012", "12:45 PM"));
        
         for(ParkingTicket t: lot){
            if(t.getExitTime() != null && !t.getExitTime().isEmpty()){
                System.out.println(t.getSummary());
            }
        } 

        ParkingTicket found = findTicket(lot, "T124");
        if(found != null) {
            System.out.println("Found ticket:");
            System.out.println(found.getSummary());
        }

        ParkingTicket badTicket = new ParkingTicket("T999", "BAD-111", "Not a time");
        if (badTicket != null) {
            System.out.println("Entry Hour: " + badTicket.getEntryHour());
        }

    }

    public static ParkingTicket findTicket(ArrayList<ParkingTicket> lot, String ticketId) {
        for(ParkingTicket t : lot) {
            if(t.getTicketId().equals(ticketId)) {
                return t;
            }
        }
        return null;
    }
}