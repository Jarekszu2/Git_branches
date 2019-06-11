package packGitBranches;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainGitBranches {
    public static void main(String[] args) {
        new Zapis().zapisz();
        int liczba = new Odczyt().liczbaLinii();
    }
}
