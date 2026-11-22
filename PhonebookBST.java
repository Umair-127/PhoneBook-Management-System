
class PhonebookBST {

    Node root;

    boolean insert(Contact contact) {

        Node newNode = new Node(contact);

        if (root == null) {
            root = newNode;
            return true;
        }

        Node current = root;

        while (true) {

            int result = contact.name.compareToIgnoreCase(current.contact.name);

            if (result == 0) {
                return false;
            }

            else if (result < 0) {

                if (current.left == null) {
                    current.left = newNode;
                    return true;
                }

                current = current.left;
            }

            else {

                if (current.right == null) {
                    current.right = newNode;
                    return true;
                }

                current = current.right;
            }
        }
    }

    Contact search(String name) {

        Node current = root;

        while (current != null) {

            int result = name.compareToIgnoreCase(current.contact.name);

            if (result == 0) {
                return current.contact;
            }

            else if (result < 0) {
                current = current.left;
            }

            else {
                current = current.right;
            }
        }

        return null;
    }

    // Update contact phone number
    boolean updateContact(String name, String newPhoneNumber) {

        Contact existing = search(name);

        if (existing == null) {
            return false;
        }

        existing.phoneNumber = newPhoneNumber;

        return true;
    }

    void deleteContact(String name) {

        root = deleteNode(root, name);

    }

    Node deleteNode(Node root, String name) {

        if (root == null) {
            System.out.println("Contact not found!");
            return null;
        }

        int result = name.compareToIgnoreCase(root.contact.name);

        if (result < 0) {
            root.left = deleteNode(root.left, name);
        }

        else if (result > 0) {
            root.right = deleteNode(root.right, name);
        }

        else {

            // Case 1: No children
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: Only right child exists
            if (root.left == null) {
                return root.right;
            }

            // Case 2: Only left child exists
            if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            Node successor = findMin(root.right);

            root.contact = successor.contact;

            root.right = deleteNode(root.right, successor.contact.name);

        }

        return root;
    }

    Node findMin(Node root) {

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    void displayContacts() {

        if (root == null) {
            System.out.println("Phonebook is empty!");
            return;
        }

        System.out.println("---- All Contacts ----");

        displayInOrder(root);
    }

    void displayInOrder(Node root) {

        if (root == null) {
            return;
        }

        displayInOrder(root.left);

        System.out.println(root.contact.name + " : " + root.contact.phoneNumber);

        displayInOrder(root.right);
    }

}
