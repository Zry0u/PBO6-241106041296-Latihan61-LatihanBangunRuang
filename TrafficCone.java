class TrafficCone extends Bangunruang {
    private double r, t;
    public TrafficCone(double r, double t){
        this.r = r;
        this.t = t;
    }

    @Override
    double hitungVolume() {
        return (1.0/3.0) * Math.PI * r * r * t;
    }
}
//Muhammad Fadil Al Zabar - 241106041296
//PBO RegulerC