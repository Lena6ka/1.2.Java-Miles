public class Main {
    public static void main(String[] args) {

        int ticketPrice = 1700;
        int miles = 20;

        int bonusMiles = ticketPrice / miles;
        System.out.println("Начислено " + bonusMiles + " миль");
    }
}
