package se.hkr.task1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public  ChocolatePiece[] storeChocolateObjects() {
        ChocolatePiece[] chocolatePiece = new ChocolatePiece[24];
        Random r = new Random();
        for (int i = 0; i < 24; i++ ) {
            ChocolatePiece star = new ChocolatePiece("star",7);
            ChocolatePiece santa = new ChocolatePiece("Santa", 8);
            ChocolatePiece bell = new ChocolatePiece("tree", 6);
            ChocolatePiece[] chocolatesObjects = new ChocolatePiece[3];
            chocolatesObjects[0] = star;
            chocolatesObjects[1] = santa;
            chocolatesObjects[2] = bell;
            int rand = r.nextInt(3);
            chocolatePiece[i] = chocolatesObjects[rand];
        }
        return chocolatePiece;
    }


    public void openCalendar(ChocolatePiece[] chocolatePiece) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < chocolatePiece.length) {
            System.out.print("Choose window: ");
            int choice = input.nextInt();
            choice -= 1;
            if (choice >= chocolatePiece.length) {
                System.out.println("Window is out of range");
            }else if(choice < 0) {
                System.out.println("Window is out of range");
            } else if (chocolatePiece[choice].isEaten()) {
                System.out.println("Chocolate piece is eaten");
            } else {
                System.out.printf(chocolatePiece[choice].getShape() + ", " + chocolatePiece[choice].getWeight()+ "\n");
                chocolatePiece[choice].setEaten(true);
                i++;
            }

        }

    }
    public static void main(String[] args) {
        Main main = new Main();
        ChocolatePiece [] ChocolatePieceArray = main.storeChocolateObjects();
        main.openCalendar(ChocolatePieceArray);

    }


}
