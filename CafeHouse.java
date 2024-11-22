import java.util.ArrayList;
import java.util.List;

public class CafeHouse {
  List<Cup>  cups = new ArrayList();   
    public static void main(String[] args) {
        Cup evesCup = new Cup("Eve");
        Cup remysCup = new Cup("Remy");

        evesCup.size = 200;
        remysCup.size = 100;

        evesCup.fill(50);
        evesCup.fill(100);

        remysCup.fill(50);
        remysCup.fill(60);

        CafeHouse javaNairobi = new CafeHouse();
        javaNairobi.register(remysCup);
        javaNairobi.register(evesCup);

        System.out.println(evesCup);
        System.out.println(remysCup);
        System.out.println(javaNairobi.countcups());
    }

    public void register(Cup cup) {
        cups.add(cup);
    }

    public int countcups() {
        return cups.size();
    }
    
}
