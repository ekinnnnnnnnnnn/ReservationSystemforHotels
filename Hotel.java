import java.util.*;

class Hotel {
    private List<Room> rooms;
    private List<Reservation> reservations;
    private final String ROOM_FILE = "rooms.csv";
    private final String RES_FILE = "reservations.csv";

    public Hotel() {
        rooms = new ArrayList<>();
        reservations = new ArrayList<>();
    }
    private void loadData() {
    
    }
    public void saveData() {

    }
    public void searchAvailableRooms() {

    }
    public void bookRoom() {

    }
    public void cancelReservation() {

    }
    public void listReservations() {

    }
    private void initializeDefaultRooms() {
        rooms.add(new StandardRoom(101, 500));
        rooms.add(new StandardRoom(102, 500));
        rooms.add(new StandardRoom(103, 500));
        rooms.add(new DeluxeRoom(201, 1000));
        rooms.add(new DeluxeRoom(202, 1000));
        System.out.println("ℹ️ Default rooms initialized.");
    }




}