public class ParkingTicket {
    private String ticketId;
    private String licensePlate;
    private String entryTime; 

    public ParkingTicket(String ticketId, String licensePlate, String entryTime){
    this.ticketId = ticketId;
    this.licensePlate = licensePlate;
    this.entryTime = entryTime;
    }

    public String getTicketId(){
        return ticketId;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public String getEntryTime(){
        return entryTime;
    }

    public String getSummary(){ 
        return ticketId + " | " + licensePlate + " | " + entryTime;
    }

    public int getEntryHour(){
        return Integer.parseInt(entryTime.split(":")[0]);
    }

    public void printDetails(){
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Entry Time: " + entryTime);
        return;
    }

    



    public static void main(String[] args) {
        ParkingTicket ticket = new ParkingTicket("T123", "ABC-1234", "10:00 AM");
        int entryHour = ticket.getEntryHour();
        System.out.println("Entry Hour: " + entryHour);

        System.out.println(ticket.getEntryTime());
}
}