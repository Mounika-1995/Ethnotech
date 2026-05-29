class Chocolate {
    void taste() {
        System.out.println("Chocolate is sweet");
    }
}
class DairyMilk extends Chocolate {
    void brand() {
        System.out.println("DairyMilk chocolate");
    }
}
public class Main {
    public static void main(String[] args) {
        DairyMilk d = new DairyMilk();
        d.taste();
        d.brand();
    }
}