package lesson15.hw.Room;

public class Controller {

    API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {

        Room[] resApiRooms;

        for (API api1 : apis) {
            resApiRooms = api1.findRooms(price, persons, city, hotel);
            return resApiRooms;
        }

        for (API api2 : apis) {
            resApiRooms = api2.findRooms(price, persons, city, hotel);
            return resApiRooms;
        }

        for (API api3 : apis) {
            resApiRooms = api3.findRooms(price, persons, city, hotel);
            return resApiRooms;
        }
        return null;
    }


    public Room[] check(API api1, API api2) {

        if (api1 == null)
            return null;
        if (api2 == null)
            return null;

        Room[] resApiRooms = new Room[api1.getAll().length];
        int index = 0;

        for (Room room1 : api1.getAll()) {
            for (int i = 1; i < api2.getAll().length; i++) {
                Room room2 = api2.getAll()[i];
                room1.equals(room2);
                room1.hashCode();
                room2.hashCode();
                resApiRooms[index] = room1;
            }
            index++;
        }
        return resApiRooms;
    }

    public Room cheapestRoom() {
        for (API api1 : apis) {
            api1.getAll();
            Room room = api1.getAll()[0];
            for (int i = 1; i < api1.getAll().length; i++) {
                Room room1 = api1.getAll()[i];
                if (room1 != null && room1.getPrice() < room.getPrice())
                    room = room1;
            }
            return room;
        }
        return null;
    }
}

