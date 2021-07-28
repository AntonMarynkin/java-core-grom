package lesson11.hw;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Room room1 = new Room(462152368, 800, 2, new Date(), "Parus", "Odesa");
        Room room2 = new Room(462152354, 850, 2, new Date(), "Dolphin", "Odesa");
        Room room3 = new Room(462152374, 1000, 3, new Date(), "More", "Zatoka");
        Room room4 = new Room(462152541, 900, 2, new Date(), "Karpaty", "Verhovyna");
        Room[] rooms = {room1, room2, room3, room4};

        BookingComAPI bookingComAPI = new BookingComAPI(rooms);
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms);
        GoogleAPI googleAPI = new GoogleAPI(rooms);
        API[] apis = {bookingComAPI, tripAdvisorAPI, googleAPI};

        Controller controller = new Controller(apis);

        System.out.println(Arrays.toString(controller.requestRooms(800, 3, "Parus", "Odesa")));
        System.out.println(Arrays.toString(bookingComAPI.findRooms(800, 3, "Parus", "Odesa")));
        System.out.println(Arrays.toString(tripAdvisorAPI.findRooms(800, 3, "Parus", "Kyiv")));
    }
}
