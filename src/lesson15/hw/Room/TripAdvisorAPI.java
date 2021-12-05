package lesson15.hw.Room;

public class TripAdvisorAPI implements API {

    Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int indexRoom = 0;
        for (Room room : rooms) {
            if (price == room.getPrice() && persons == room.getPersons() && city == room.getCityName() && hotel == room.getHotelName())
                return new Room[indexRoom];
            if (persons == room.getPersons() + 1 || persons == room.getPersons() - 1)
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
