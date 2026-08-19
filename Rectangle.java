import java.util.Scanner;

class Rect {
    int a, c;

    Rect(int l, int b) {
        a = l;
        c = b;
    }
    public void display() {
        System.out.println("Area of rectangle: " + (a * c));
    }
}

public class Rectangle{
    public static void main(String[] args) {
        int l, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rectangles:");
        int n = sc.nextInt();
        Rect[] r = new Rect[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter length of rectangle " + (i + 1) + ":");
            l = sc.nextInt();

            System.out.println("Enter breadth of rectangle " + (i + 1) + ":");
            b = sc.nextInt();

            r[i] = new Rect(l, b);
        }

        System.out.println("\nLets see areas of all rectangles:");
        for (int i = 0; i < n; i++) {
            System.out.println("Rectangle " + (i + 1) + ":");
            r[i].display();
        }

        sc.close();
    }
}