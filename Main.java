
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PhonebookBST phonebook = new PhonebookBST();

        System.out.println("Welcome to phoneBookManagementSystem");

        while (true) {

            System.out.println("\n1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Update Contact");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    String name;

                    // Validate name
                    while (true) {

                        System.out.print("Enter contact name: ");
                        name = sc.nextLine().trim();

                        if (name.matches("[a-zA-Z ]+")) {
                            break;
                        }

                        System.out.println("Invalid name! Enter alphabets only.");
                    }

                    String phone;

                    // Validate phone number
                    while (true) {

                        System.out.print("Enter phone number: ");
                        phone = sc.nextLine().trim();

                        if (phone.matches("[0-9]{10}")) {
                            break;
                        }

                        System.out.println("Invalid phone number! Enter exactly 10 digits.");
                    }

                    Contact contact = new Contact(name, phone);

                    if (phonebook.insert(contact)) {
                        System.out.println("Contact added successfully!");
                    } else {
                        System.out.println("Contact name already exists!");
                    }

                    break;

                case 2:

                    sc.nextLine();

                    System.out.print("Enter contact name to search: ");
                    String searchName = sc.nextLine().trim();

                    Contact found = phonebook.search(searchName);

                    if (found != null) {

                        System.out.println("\nContact found!");
                        System.out.println("Name: " + found.name);
                        System.out.println("Phone Number: " + found.phoneNumber);

                    } else {

                        System.out.println("Contact not found!");

                    }

                    break;

                case 3:

                    sc.nextLine();

                    System.out.print("Enter contact name to delete: ");
                    String deleteName = sc.nextLine().trim();

                    Contact existing = phonebook.search(deleteName);

                    if (existing != null) {

                        phonebook.deleteContact(deleteName);

                        System.out.println("Contact deleted successfully!");

                    } else {

                        System.out.println("Contact not found!");

                    }

                    break;

                case 4:

                    phonebook.displayContacts();

                    break;

                case 5:

                    sc.nextLine();

                    String updateName;

                    // Validate name
                    while (true) {

                        System.out.print("Enter contact name to update: ");
                        updateName = sc.nextLine().trim();

                        if (updateName.matches("[a-zA-Z ]+")) {
                            break;
                        }

                        System.out.println("Invalid name! Enter alphabets only.");
                    }

                    // Check whether contact exists
                    Contact contactToUpdate = phonebook.search(updateName);

                    if (contactToUpdate == null) {

                        System.out.println("Contact not found!");

                    } else {

                        String newPhone;

                        // Validate new phone number
                        while (true) {

                            System.out.print("Enter new phone number: ");
                            newPhone = sc.nextLine().trim();

                            if (newPhone.matches("[0-9]{10}")) {
                                break;
                            }

                            System.out.println("Invalid phone number! Enter exactly 10 digits.");
                        }

                        if (phonebook.updateContact(updateName, newPhone)) {

                            System.out.println("Phone number updated successfully!");

                        } else {

                            System.out.println("Contact not found!");

                        }
                    }

                    break;

                case 6:

                    System.out.println("Exiting Phonebook...");
                    return;

                default:

                    System.out.println("Invalid choice! Please try again.");
            }

        }
    }
}
