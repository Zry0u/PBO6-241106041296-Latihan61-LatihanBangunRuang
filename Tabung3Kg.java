class Tabung3Kg extends Bangunruang {
    private double r, t; 
    public Tabung3Kg(double r, double t){
        this.r = r;
        this.t = t;
    }

    @Override
    double hitungVolume() {
        return Math.PI * r * r * t;
    }
}
//Muhammad Fadil Al Zabar - 241106041296
//PBO RegulerC