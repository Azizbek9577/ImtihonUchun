import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Handler  {
    FileWriter file =new FileWriter("File.txt");

    public Handler() throws IOException {
    }
    LocalDate date = LocalDate.now();

    public static void main(String[] args) {

    }

}
