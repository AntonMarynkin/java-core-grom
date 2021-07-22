package lesson11.hw;

public class Controller {

    API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        int indexApi = 0;
        for (API api : apis) {
            for (int i = 1; i < apis.length; i++) {
                API ap = apis[i];
                if (api.findRooms(price, persons, city, hotel) == ap.findRooms(price, persons, city, hotel))
                    return new Room[indexApi];
                indexApi++;
            }
        }
        return null;
    }

    public Room[] check(API api1, API api2) {
        return null;
    }

    public Room cheapestRoom() {
        return null;
    }
}

