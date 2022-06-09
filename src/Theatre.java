import java.util.*;
public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows -1);
        for (char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        for(Seat seat : seats) {
            if(seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        if(requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return requestedSeat.reserva();
    }

    public boolean cancelSeatReservation(String seatNumber) {
        Seat requestedSeat = null;
        for(Seat seat : seats) {
            if(seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        if(requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return requestedSeat.cancel();
    }

    public void getSeats() {
        for(Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    /*public void printSeats(){
        int counter = 0;
        for(Seat1 seat : seats){
            System.out.printf("%s ", seat.getSeatNumber());
            counter++;
            if(counter % this.seatsPerRow == 0)
                System.out.printf("%n");
        }
    }
    public void printReservedSeats(){
        System.out.print("Reserved seats: ");
        for(Seat1 seat : seats){
            if(seat.isReserved())
                System.out.printf("%s ", seat.getSeatNumber());
        }
        System.out.printf("%n");
    }*/

}
