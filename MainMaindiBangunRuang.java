//Muhammad Fadil Al Zabar - 241106041296
//PBO RegulerC
public class MainMaindiBangunRuang  {
    public static void main(String[] args) {
        Bangunruang BobiBola = new BobiBola(67);
        Bangunruang Tabung3Kg = new Tabung3Kg(11, 12);
        Bangunruang TrafficCone = new TrafficCone(9, 11);

        System.out.println("\nVolume Bola = " + BobiBola.hitungVolume());
        System.out.println("Volume Tabung = " + Tabung3Kg.hitungVolume());
        System.out.println("Volume Traffic Cone = " + TrafficCone.hitungVolume());
        System.out.println("\n");
    }
}
