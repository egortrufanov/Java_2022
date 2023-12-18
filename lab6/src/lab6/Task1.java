
package lab6;

import java.util.Scanner;

/**
 *
 * @author egortrufanov
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10, number, counter = 0;
        System.out.print("Введите число: ");
        number = scanner.nextInt();
        char[] binaryString = Integer.toBinaryString(a).toCharArray();
        for (int i = 0; i < binaryString.length; i++){
            if (binaryString[binaryString.length - i -1] == '1'){
                counter += number << i;
            }
        }
        System.out.printf("Итог: %s", counter);
    }
}
