import java.util.Scanner;

public class calculateArea
{
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("is she for for keeps ..somebody telllllll is she for keeps ..somebody tell me is she ..somebody telllll is she for kees ooohhh yeee ooohh is se for keeps somebody tell ..oohh yeshhhhhhhh....life ..what is the : ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the width: ");
        int num2 = scanner.nextInt();
        
        // Calculate the area
        int area = num1 * num2;
        
        // Print the result
        System.out.println("The area of the rectangle with length " + num1 + " and width " + num2 + " is: " + area);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
