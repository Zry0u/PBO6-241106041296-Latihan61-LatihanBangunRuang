class BobiBola extends Bangunruang {
    private double r;
    public BobiBola(double r) {
        this.r = r;
    }

    @Override
    double hitungVolume(){
        return (4.0/3.0) * Math.PI * r * r * r;
    }
}
//Muhammad Fadil Al Zabar - 241106041296
//PBO RegulerC