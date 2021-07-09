package lesson11.biginterfaceexample;

public class Demo {
    public static void main(String[] args) {
        File file1 = new File("test1", "C:/user/home", "txt", 125);
        //File file2 = new File("test2", "C:/user/home", "txt", 125);
        File file3 = new File("test3", "C:/user/home", "txt", 125);
        File file4 = new File("myTest4", "C:/user/home", "txt", 1024);
        File file5 = new File("test5", "C:/user/home", "txt", 125);

        File[] files = {file1, null, file3, file4, file5};
        Storage storage = new Storage(files);

        SimpleReader simpleReader = new SimpleReader();
        FileReader fileReader = new FileReader();

        read(storage, simpleReader);
        read(storage, fileReader);
    }

    private static void read(Storage storage, Readable readable) {
        System.out.println("method is starting");
        readable.readFileFromStorage(storage);
    }

    /*private static void readSimpleReader(Storage storage, SimpleReader readable) {
        System.out.println("method is starting");
        readable.readFileFromStorage(storage);
    }

    private static void readFileReader(Storage storage, FileReader readable) {
        System.out.println("method is starting");
        readable.readFileFromStorage(storage);
    }*/
}
