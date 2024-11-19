public class Cafe {
    public static void main(String[] args) {
        Cup evescCup = new Cup("Eve");
        Cup remysCup = new Cup("Remy");

        evescCup.size = 200;
        remysCup.size = 100;

        evescCup.fill(50);
        evescCup.fill(100);

        remysCup.fill(50);
        remysCup.fill(60);

        System.out.println(evescCup);
        System.out.println(remysCup);
    }
    
}
