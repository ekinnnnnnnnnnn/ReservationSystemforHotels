class Reservation {
    private Customer customer;
    private Room room;
    private double totalPrice;

    public Reservation(Customer customer, Room room) {
        this.customer = customer;
        this.room = room;
        this.totalPrice = room.calculatePrice();
    }
    
    public Reservation( String customerName, String customerPhone, Room room, double price) {
        this.customer = new Customer(customerName, customerPhone);
        this.room = room;
        this.totalPrice = price;
    }

    public Room getRoom() { return room; }

    @Override
    public String toString() {
               "Customer: " + customer.getName() + 
               "Room: " + room.getRoomNumber() + 
               "Price: " + totalPrice + " TL";
    }

    public String toCSV() {
        return customer.getName() + "," + customer.getPhone() + "," + 
               room.getRoomNumber() + "," + totalPrice;
    }
}