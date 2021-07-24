package lesson11.hw;

public class Controller {

    API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {

        int index = 0;
        int resIndex = 0;

        Room[] resApiRooms = new Room[resIndex];

        BookingComAPI bookingComAPI = new BookingComAPI(resApiRooms);
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(resApiRooms);
        GoogleAPI googleAPI = new GoogleAPI(resApiRooms);

        for (API api : apis) {
            for (int i = 1; i < apis.length; i++) {
                API ap = apis[i];
                if (api.findRooms(price, persons, city, hotel) == ap.findRooms(price, persons, city, hotel)) {
                    bookingComAPI.rooms[index] = resApiRooms[resIndex];
                    tripAdvisorAPI.rooms[index] = resApiRooms[resIndex];
                    googleAPI.rooms[index] = resApiRooms[resIndex];
                }
                index++;
            }
            resIndex++;
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
