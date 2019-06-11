package packGitBranches;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Zapis {
    public  void zapisz() {
        System.out.println();

        try(PrintWriter printWriter= new PrintWriter(new FileWriter("data.txt", true))) {
            printWriter.println("Hallo World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
