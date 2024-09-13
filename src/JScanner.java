public class JScanner {
    public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    // Reading the user's name using nextLine()
        System.out.println("Enter your name:");
    String name = scanner.nextLine();

    // Reading the user's age using nextInt()
        System.out.println("Enter your age:");
    int age = scanner.nextInt();

    // Consume the remaining newline
        scanner.nextLine();

    // Reading the user's gender using nextLine() (assuming gender is entered as a word)
        System.out.println("Enter your gender:");
    String gender = scanner.nextLine();

    // Reading the user's contact number using nextLine() (to handle various formats)
        System.out.println("Enter your contact number:");
    String contactNumber = scanner.nextLine();

    // Print the collected information
        System.out.println("\nCollected Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Contact Number: " + contactNumber);

    // Close the scanner
        scanner.close();
}

}