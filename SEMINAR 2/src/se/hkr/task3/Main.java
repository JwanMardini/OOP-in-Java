package se.hkr.task3;


import java.util.Scanner;

public class Main {
    public String encrypt(String plainText) {
        char[] letters = new char[plainText.length()];
        int letterI = 0;
        for (int i = plainText.length() - 1; i >= 0; i--) {
            letters[letterI] = plainText.charAt(i);
            letterI++;
        }
        String encryptedText = plainText;
        for(int i = 0; i < plainText.length(); i++) {
            encryptedText = encryptedText + letters[i];

        }

        return encryptedText;
    }

    public static void main(String[] args) {
        Main main = new Main();
        String[] plainText = new String[4];
        plainText[0] = "abc";
        plainText[1] = "Karl";
        plainText[2] = "Emma";
        plainText[3] = "sun";

        for (String text : plainText) {
            System.out.println(text + " - " + main.encrypt(text));
        }
        System.out.print("Enter plain text: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println(main.encrypt(text));



    }

}
