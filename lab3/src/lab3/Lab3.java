package lab3;

import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        float a1, a2, a3;
        System.out.println("Введите стороны треугольника:");
        Scanner cin = new Scanner(System.in);
        System.out.print("Введите сторону a1: ");
        while (!cin.hasNextFloat()){
            System.out.println ("Введите вещественное число");
            cin.next();
        }
        a1 = cin.nextFloat();
        System.out.print("Введите сторону a2: ");
        while (!cin.hasNextFloat()){
            System.out.println ("Введите вещественное число");
            cin.next();
        }
        a2 = cin.nextFloat();
        System.out.print("Введите сторону a3: ");
        while (!cin.hasNextFloat()){
            System.out.println ("Введите вещественное число");
            cin.next();
        }
        a3 = cin.nextFloat();
        float p = (a1+a2+a3)/2;
        double s = Math.sqrt(p*(p-a1)*(p-a2)*(p-a3));
        System.out.format("Для треуголника со cторонами %.1f, %.1f, %.1f " +
                "площадь равна %.1f\n", a1, a2, a3, s);
        System.out.println("\u0054\u0048\u0045\u0020\u0045\u004E\u0044");
    }
}
