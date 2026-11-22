# PhoneBook Management System

A console-based PhoneBook Management System developed using **Java** and **Binary Search Tree (BST)** data structure.

## About the Project

The PhoneBook Management System is designed to manage contact information efficiently. It allows users to add, search, update, delete, and display contacts through a menu-driven console interface.

The project uses a Binary Search Tree to organize contacts alphabetically by name, making searching and managing contacts easier.

## Features

- **Add Contact:** Add a new contact with a name and phone number.
- **Search Contact:** Search for an existing contact by name.
- **Update Contact:** Update the phone number of an existing contact.
- **Delete Contact:** Remove a contact from the phonebook.
- **Display All Contacts:** Display all contacts in alphabetical order.
- **Input Validation:** Accept alphabetic names and exactly 10-digit phone numbers.
- **Duplicate Prevention:** Prevent adding contacts with duplicate names.

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Binary Search Tree (BST)
- Java Scanner Class

## Data Structure Used

The project uses a **Binary Search Tree (BST)** to store and organize contacts.

Each node contains a contact and references to its left and right child nodes.

Contacts are arranged according to their names:

- Left subtree contains names that come alphabetically before the current node.
- Right subtree contains names that come alphabetically after the current node.

The project uses in-order traversal to display contacts in alphabetical order.

## Project Structure

```text
PhoneBook-Management-System/
│
├── Main.java
├── Contact.java
├── Node.java
├── PhonebookBST.java
├── .gitignore
└── README.md
```

## How to Run the Project

### Prerequisites

- Java Development Kit (JDK) installed.
- Command Prompt or any Java-supported IDE.

### Step 1: Clone the Repository

```bash
git clone https://github.com/Umair-127/PhoneBook-Management-System.git
```

### Step 2: Open the Project Directory

```bash
cd PhoneBook-Management-System
```

### Step 3: Compile the Java Files

```bash
javac Main.java Contact.java Node.java PhonebookBST.java
```

### Step 4: Run the Application

```bash
java Main
```

## Application Menu

The application provides the following menu options:

1. Add Contact
2. Search Contact
3. Delete Contact
4. Display All Contacts
5. Update Contact
6. Exit

## Screenshots

Screenshots demonstrating the application will be added here.

## Limitations

- Contacts are stored in memory using a Binary Search Tree.
- Contact information is not permanently saved after the application is closed.

## Author

**Umair Alam Khan**

Java | Data Structures | Binary Search Tree
