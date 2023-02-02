package Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<AddressBook> contactsList = new ArrayList<>();
        Main main = new Main();

        boolean i = true;
        while (i){
            System.out.println("Menu");
            System.out.print("1.Add new contact" + "\n"+
                    "2.Remove contacts"+ "\n" + "3.View contacts"+
                    "\n"+ "4.Search for contacts in the address book"+"\n"+
                    "5.Exit"+"\n");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    Object contact = main.addContacts();
                    contactsList.add((AddressBook) contact);
                    break;
                case 2:
                    contactsList = main.removeContacts(contactsList);
                    break;
                case 3:
                    main.viewContact(contactsList);
                    break;
                case 4:
                    main.searchContact(contactsList);
                    break;
                case 5:
                    i = false;
                    break;

            }

        }


    }

    public Object addContacts(){
        System.out.print("1.Private contact"+"\n"+"2.Work-related contact"+"\n");
        System.out.print("Enter your choice: ");
        Scanner input1 = new Scanner(System.in);
        int choice1 = input1.nextInt();
        input1.nextLine();
        System.out.print("\n");
        System.out.print("Enter first name: ");
        String firstName = input1.nextLine();
        System.out.print("\n");
        System.out.print("Enter last name: ");
        String lastname = input1.nextLine();
        System.out.print("\n");
        System.out.print("Enter a phone number: ");
        int phoneNumber = input1.nextInt();
        System.out.print("\n");
        if(choice1 == 1){
            System.out.print("Enter a nick name: ");
            String nickName = input1.nextLine();
            input1.nextLine();
            AddressBook privateContact = new PrivateContacts(firstName, lastname, phoneNumber, nickName);
            return privateContact;
        }else {
            System.out.println("Enter the name of your latest three employers: ");
            System.out.print("First one: ");
            String employee1 = input1.nextLine();
            input1.nextLine();
            System.out.print("Second one: ");
            String employee2 = input1.nextLine();
            System.out.print("Third one: ");
            String employee3 = input1.nextLine();

            String [] emps = new String[3];
            emps[0] = employee1;
            emps[1] = employee2;
            emps[2] = employee3;
            AddressBook workContact = new WorkContacts(firstName, lastname, phoneNumber, emps);
            return workContact;
        }
    }

    public void viewContact (ArrayList<AddressBook> contactList) {
        System.out.println("Menu");
        System.out.print("1.Viewing all contacts"+"\n"+"2.Viewing work-related contacts"+
                "\n"+"3.Viewing private contacts"+"\n");
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice2 = input2.nextInt();
        if (choice2 == 1){
            for (AddressBook i : contactList){
                System.out.println(i.getFirstName() +" " + i.getLastName());
                System.out.println(i.getMobileNumber());
                System.out.print("\n");
            }
        }else if (choice2 == 2){
            for(AddressBook c: contactList){
                if(c instanceof WorkContacts){
                    System.out.println(c.getFirstName() +" "+ c.getMobileNumber());
                    for(String emp: ((WorkContacts) c).getEmployerName()){
                        System.out.println(emp);

                    }
                }
            }
        } else if (choice2 == 3) {
            for (AddressBook contact: contactList){
                if(contact instanceof PrivateContacts){
                    System.out.println(contact.getFirstName() + contact.getLastName()+"/"+
                            ((PrivateContacts) contact).getNickName());
                }
            }
        }
    }

    public ArrayList<AddressBook> removeContacts(ArrayList<AddressBook> contactList) {
        System.out.print("Enter the first name of the contact you want to remove");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        for (AddressBook c: contactList){
            if (name.equals(c.firstName)){
                contactList.remove(c);
            }
        }
        return contactList;
    }

    public void searchContact(ArrayList<AddressBook> contactList){
        System.out.print("Enter the first name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        for (AddressBook c: contactList){
            if(name.equals(c.getFirstName())){
                System.out.println(c.getFirstName()+" "+ c.getLastName()+ ": " + c.getMobileNumber());
            }else {
                System.out.println("There are no contacts in that name");
            }
        }
    }

}