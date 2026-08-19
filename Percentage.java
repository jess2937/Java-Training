import java.util.Scanner;

class Mark { 
    String name;
    int a, b, c;

    Mark(String studentName, int x, int y, int z) {
        name = studentName;
        a = x;
        b = y;
        c = z;
    }

    public void display() {
        double percentage = (a + b + c) / 3.0;
        System.out.println("Name: " + name);
        System.out.printf("Percentage: %.2f%%\n", percentage);
    }
}

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Mark[] r = new Mark[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter mark in subject 1: ");
            int x = sc.nextInt();
            System.out.print("Enter mark in subject 2: ");
            int y = sc.nextInt();
            System.out.print("Enter mark in subject 3: ");
            int z = sc.nextInt();
            sc.nextLine();

            r[i] = new Mark(name, x, y, z);
        }

        System.out.println("All Student Percentages:");
        for (int i = 0; i < n; i++) {
            r[i].display();
        }

        sc.close();
    }
}
