import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Please enter the element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        int[] newArr = new int[array.length - 1];
        System.out.println("Enter the number you want to remove: ");
        int numR = input.nextInt();
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (numR == array[i]) {
                System.out.println("Index of element: " + i);
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                for (int j = 0; j < newArr.length; j++) {
                    newArr[j] = array[j];
                }
                check = true;
                break;
            }
                check = false;
        }
        if (check) {
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + "\t");
            }
        }else {
            System.out.println(numR + " not found.");
        }
    }
}
