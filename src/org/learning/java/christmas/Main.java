package org.learning.java.christmas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        List<String> gifts = new ArrayList<>();
        System.out.println("Benvenuto! Crea la tua lista di regali. Inserisci il primo regalo.");
        String userGift = scanner.nextLine();
        gifts.add(userGift);
        while (!stop) {
            String giftsMessage = gifts.size() == 1 ? "hai un regalo" : "hai " + gifts.size() + " regali";
            System.out.println("" +
                    "Al momento " + giftsMessage + " in lista. Vuoi continuare? S/N");
            stop = scanner.nextLine().equalsIgnoreCase("n");
            if (stop) {
                stop = true;
                Collections.sort(gifts);
                System.out.println(gifts);
            } else {
            System.out.println("Inserisci il prossimo regalo");
            userGift = scanner.nextLine();
            gifts.add(userGift);
            }
        }
        scanner.close();

        File file = new File("./gifts.txt");
        try {
        FileWriter myWriter = new FileWriter(file);
            for (int i = 0; i < gifts.size(); i++) {
                myWriter.write(gifts.get(i) + "\n");
            }
            myWriter.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
