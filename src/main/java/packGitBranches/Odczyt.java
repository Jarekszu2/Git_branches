package packGitBranches;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Odczyt {
    public int liczbaLinii() {
        int licznik = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))) {
            String linia;
            while ((linia = bufferedReader.readLine()) != null) {
                licznik++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return licznik;
    }
}
