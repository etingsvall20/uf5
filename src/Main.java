public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Richards", 5, 10);
        //theatre.getSeats();
        if (theatre.reserveSeat("H11")) {
            System.out.println("Please pay.");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
