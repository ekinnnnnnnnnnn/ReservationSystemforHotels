abstract class Room implements Reservable {
    protected int roomNumber;
    protected boolean isAvailable;
    protected double basePrice;

    public Room(int roomNumber, double basePrice) {
        this.roomNumber = roomNumber;
        this.basePrice = basePrice;
        this.isAvailable = true;
    }

    public abstract double calculatePrice();

    public int getRoomNumber() { return roomNumber; }
    public boolean isAvailable() { return isAvailable; }
    
    @Override
    public void reserve() {
        this.isAvailable = false;
    }

    @Override
    public void cancel() {
        this.isAvailable = true;
    }
    
    public abstract String toCSV();
}
class StandardRoom extends Room {
    public StandardRoom(int roomNumber, double basePrice) {
        super(roomNumber, basePrice);
    }

    @Override
    public double calculatePrice() {
        return basePrice; 
    }

    @Override
    public String toCSV() {
        return "STANDARD," + roomNumber + "," + basePrice + "," + isAvailable;
    }
}

class DeluxeRoom extends Room {
    public DeluxeRoom(int roomNumber, double basePrice) {
        super(roomNumber, basePrice);
    }

    @Override
    public double calculatePrice() {
        return (basePrice * 2);
    }

    @Override
    public String toCSV() {
        return "DELUXE," + roomNumber + "," + basePrice + "," + isAvailable;
    }
}