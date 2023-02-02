package se.hkr.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public ArrayList<Competitor> letsRun(String path) {
        ArrayList<Competitor> competitors = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            Random rand = new Random();
            String line = br.readLine();
            while (line != null) {
                String[] words = line.split(",");
                Time time = new Time(rand.nextInt(1, 4), rand.nextInt(60), rand.nextInt(60));
                Competitor competitor = new Competitor(words[0], Integer.parseInt(words[1]), words[2], time);
                competitors.add(competitor);
                line = br.readLine();
            }
            br.close();
        } catch (IOException e){
            e.printStackTrace();

        }
        Collections.sort(competitors, new Comparator<Competitor>() {
            @Override
            public int compare(Competitor o1, Competitor o2) {
                return o1.compareTo(o2);
            }
        });
        return competitors;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Running Result:");
        for (Competitor c: main.letsRun("C:/participants.txt")){
            System.out.println(c.toString());
        }
    }

    public void writeToFile(ArrayList<Competitor> competitors, String fileName){
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(competitors);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
