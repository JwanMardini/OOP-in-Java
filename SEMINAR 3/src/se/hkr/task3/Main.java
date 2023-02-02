package se.hkr.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Item> itemList = new MyArrayList<>();
        Scanner input = new Scanner(System.in);
        int control = 0;
        while(control == 0){
            System.out.println("1] Add items");
            System.out.println("2] View items");
            System.out.println("3] Quit");
            System.out.print("> ");
            int choice = input.nextInt();
            if(choice == 1){
                System.out.print("Name: ");
                String name = input.next();
                int quan = 0;
                boolean validQuan = false;
                while(!validQuan) {
                    System.out.print("Quantity: ");
                    try {
                        quan = input.nextInt();
                        validQuan = true;
                    }catch (InputMismatchException e){
                        System.out.println("Quantity needs to be integer value");
                        input.nextLine();
                    }
                }
                Item item = new Item(name, quan);
                itemList.add(item);
            } else if (choice == 2) {
                for(int i = 0; i < itemList.size(); i++){
                    System.out.println(itemList.get(i).toString());
                }
            }else{
                control = 3;
            }

            }
    }
}
