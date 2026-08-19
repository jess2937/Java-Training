class Common {
    static String PM = "XXX";
}

class Tamilnadu {
    static String CM = "YYY";

    String State_name;
    String District_name;
    int Population;

    public void display(String a, String b, int c) {
        State_name = a;
        District_name = b;
        Population = c;
    }

    public void display() {
        System.out.println("Prime Minister: " + Common.PM);
        System.out.println("Chief Minister: " + CM);
        System.out.println("State name: " + State_name);
        System.out.println("District name: " + District_name);
        System.out.println("Population: " + Population);
    }
}

class AndhraPradesh {
    static String CM = "ZZZ";

    String State_name;
    String District_name;
    int Population;

    public void display(String a, String b, int c) {
        State_name = a;
        District_name = b;
        Population = c;
    }

    public void display() {
        System.out.println("Prime Minister: " + Common.PM);
        System.out.println("Chief Minister: " + CM);
        System.out.println("State name: " + State_name);
        System.out.println("District name: " + District_name);
        System.out.println("Population: " + Population);
    }
}

public class Main {
    public static void main(String[] args) {

        Tamilnadu a = new Tamilnadu();
        AndhraPradesh b = new AndhraPradesh();

        a.display("Tamil Nadu", "Chennai", 78000000);
        b.display("Andhra Pradesh", "Vijayawada", 53000000);

        a.display();
        System.out.println("-------------------------");
        b.display();
    }
}