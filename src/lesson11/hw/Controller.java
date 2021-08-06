package lesson11.hw;

public class Controller {

    API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {

        Room[] resApiRooms;

        for (API api : apis) {
            resApiRooms = api.findRooms(price, persons, city, hotel);
            return resApiRooms;
        }

        for (API api1 : apis) {
            resApiRooms = api1.findRooms(price, persons, city, hotel);
            return resApiRooms;
        }

        for (API api2 : apis) {
            resApiRooms = api2.findRooms(price, persons, city, hotel);
            return resApiRooms;
        }
        return null;
    }


    public Room[] check(API api1, API api2) {

        Room[] resApiRooms;

        for (Room room1 : api1.getAll()) {
            for (int i = 1; i < api2.getAll().length; i++) {
                Room room2 = api2.getAll()[i];
                if (room1.getPrice() == room2.getPrice() && room1.getPersons() == room2.getPersons() && room1.getCityName() == room2.getCityName() && room1.getHotelName() == room2.getHotelName()) {
                    resApiRooms = api1.findRooms(room1.getPrice(), room1.getPersons(), room1.getCityName(), room1.getHotelName());
                    return resApiRooms;
                }
            }
        }
        return null;
    }

    public Room cheapestRoom() {
        return null;
    }
}

