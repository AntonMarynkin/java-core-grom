package lesson11.biginterfaceexample;

public class FileReader implements Readable {

    @Override
    public void readFileFromStorage(Storage storage) {
        //найти файл макс размера
        //вывести всю инфу о нем

        printFile(findMaxSizeFile(storage.getFiles()));
    }

    private File findMaxSizeFile(File[] files) {
        File maxSizeFile = files[0];
        for (File file : files)
            if (file != null && file.getSize() > maxSizeFile.getSize())
                maxSizeFile = file;
        return maxSizeFile;
    }

    private void printFile(File file) {
        System.out.println();
        System.out.println("max file will be printed now...");
        System.out.println(file.getName());
        System.out.println(file.getExtension());
        System.out.println(file.getPath());
        System.out.println(file.getSize());
    }
}
