package lesson11.hw;

public class Controller {

    API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {

        int index = 0;

        Room[] resApiRooms = new Room[index];

        BookingComAPI bookingComAPI = new BookingComAPI(resApiRooms);
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(resApiRooms);
        GoogleAPI googleAPI = new GoogleAPI(resApiRooms);

        for (API api : apis) {
            api.findRooms(price, persons, city, hotel);
            bookingComAPI.rooms[index] = resApiRooms[index];
            index++;
            tripAdvisorAPI.rooms[index] = resApiRooms[index];
            index++;
            googleAPI.rooms[index] = resApiRooms[index];
            index++;
        }
        return resApiRooms;
    }

    public Room[] check(API api1, API api2) {
        return null;
    }

    public Room cheapestRoom() {
        return null;
    }
}

