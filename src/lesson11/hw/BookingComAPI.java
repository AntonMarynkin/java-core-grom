package lesson11.hw;

public class BookingComAPI implements API {

    Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int indexRoom = 0;
        for (Room room : rooms) {
            if (price == room.getPrice() && persons == room.getPersons() && city == room.getCityName() && hotel == room.getHotelName())
                return new Room[indexRoom];
            if (price <= room.getPrice() + 100 || price >= room.getPrice() - 100)
                return new Room[indexRoom];
            indexRoom++;
        }
        return null;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
