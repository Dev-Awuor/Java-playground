public class ParkingTicket {
    private String ticketId;
    private String licensePlate;
    private String entryTime; 
    private String exitTime;

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
        if(exitTime != null && !exitTime.isEmpty()){ 
           return ticketId + " | " + licensePlate + " | " + entryTime + " | " + exitTime; 
        } else {
                return ticketId + " | " + licensePlate + " | " + entryTime + " | No exit time"; 
            }
        } 

    public String setExitTime(String time){
        this.exitTime = time;
        return exitTime;
    }

    public String getExitTime(){
        return exitTime;
    }

    public int getEntryHour(){
        try {
            return Integer.parseInt(entryTime.split(":")[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid entry time format.");
            return -1;
        }
    }

    public double toDecimalHours(String time){
        //seperate AM and PM
        if(time != null){

        double totalHours;
        String clock = time.split(" ")[0];
        double hours = Integer.parseInt(clock.split(":")[0]);
        double minutes = Integer.parseInt(clock.split(":")[1]);

        if (time.split(" ")[1].equals("AM") && hours != 12) {
            totalHours = hours + (minutes / 60);
            return totalHours;
        }else if(time.split(" ")[1].equals("PM") && hours != 12){
            totalHours = hours + 12 + (minutes / 60);
            return totalHours;
        }
        
        }else{
            return 1;
        }     
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