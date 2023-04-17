public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public Reservation (int count, int capacity, boolean open){
        guestCount = count;
        isRestaurantOpen = open;
        restaurantCapacity = capacity;
        if(count <1 || count >8){
            System.out.println("reserva invalida");
        }
    }

    public void confirmReservation(){
        if(restaurantCapacity >= guestCount && isRestaurantOpen == true){
            System.out.println("Reservation confirmed");
        } else {
            System.out.println("Not confirmed");
        }
    }

    public void informUser(){
        if(!isConfirmed){
            System.out.println("Incapaz de fazer uma reserva");
        } else{
            System.out.println("Aproveite sua refeição");
        }
        System.out.println("Aproveite sua refeição");
    }

    public static void main(String[] args) {
        Reservation partyOfThree = new Reservation(3, 12, true);
        Reservation partyOfFour = new Reservation(4, 12, true);
        partyOfThree.confirmReservation();
        partyOfThree.informUser();
        partyOfFour.confirmReservation();
        partyOfFour.informUser();
    }
}