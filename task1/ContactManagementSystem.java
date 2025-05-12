import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phoneNumber;
    String email;

   
    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

   
    public void displayContact() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}

public class ContactManagementSystem {

   
    static ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

  
    public static void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        contacts.add(new Contact(name, phoneNumber, email));
        System.out.println("Contact added successfully!");
    }

    
    public static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("\n--- Contacts ---");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println("\nContact " + (i + 1) + ":");
                contacts.get(i).displayContact();
            }
        }
    }


    public static void updateContact() {
        System.out.print("Enter the contact number to update: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); 

        if (index >= 0 && index < contacts.size()) {
            System.out.print("Enter new name: ");
            String name = scanner.nextLine();
            System.out.print("Enter new phone number: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Enter new email: ");
            String email = scanner.nextLine();

          
            contacts.get(index).name = name;
            contacts.get(index).phoneNumber = phoneNumber;
            contacts.get(index).email = email;
            System.out.println("Contact updated successfully!");
        } else {
            System.out.println("Invalid contact number.");
        }
    }


    public static void deleteContact() {
        System.out.print("Enter the contact number to delete: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); 

        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Invalid contact number.");
        }
    }

  
    public static void displayMenu() {
        while (true) {
            System.out.println("\n--- Contact Management System ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        displayMenu();
    }
}
