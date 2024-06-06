import java.util.*;

class Person {
    String name;
    String address;
    String telephone;
    String mobile;
    String headOfFamily;
    String uniqueId;

    public Person(String name, String address, String telephone, String mobile, String headOfFamily, String uniqueId) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.mobile = mobile;
        this.headOfFamily = headOfFamily;
        this.uniqueId = uniqueId;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nTelephone: " + telephone +
                "\nMobile: " + mobile + "\nHead of Family: " + headOfFamily + "\nUnique ID: " + uniqueId;
    }
}

public class Directory {
    private static Map<String, Person> directory = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nDirectory Menu:");
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Search by keyword");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createEntry(scanner);
                    break;
                case 2:
                    editEntry(scanner);
                    break;
                case 3:
                    searchByKeyword(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createEntry(Scanner scanner) {
        System.out.print("Enter Unique ID: ");
        String uniqueId = scanner.nextLine();
        if (directory.containsKey(uniqueId)) {
            System.out.println("This Unique ID already exists. Please use a different Unique ID.");
            return;
        }

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Telephone: ");
        String telephone = scanner.nextLine();
        System.out.print("Enter Mobile: ");
        String mobile = scanner.nextLine();
        System.out.print("Enter Head of Family: ");
        String headOfFamily = scanner.nextLine();

        Person person = new Person(name, address, telephone, mobile, headOfFamily, uniqueId);
        directory.put(uniqueId, person);
        System.out.println("Entry created successfully.");
    }