import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class Town {
    private int id;
    private int index;
    private String title;

    public Town (int id, int index, String title){
    this.id = id;
    this.index = index;
    this.title = title;
    }

    public int getId() {
        return id;
    }

    public int getIndex() {
        return index;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) throws IOException {
    Town town1 = new Town(1, 143900, "Балашиха");
    Town town2 = new Town(2, 142900, "Кашира");
    Town town3 = new Town(3, 119146, "Москва");

    String data1 = town1.getId() + "," + town1.getIndex() + "," + town1.getTitle() + "\n" +
            town2.getId() + "," + town2.getIndex() + "," + town2.getTitle() + "\n" +
            town3.getId() + "," + town3.getIndex() + "," + town3.getTitle();

    File file1 = Path.of("Town","Town.txt").toFile();
       try (FileOutputStream outputStream = new FileOutputStream(file1)) {
       outputStream.write(data1.getBytes());
        }
    }
}
