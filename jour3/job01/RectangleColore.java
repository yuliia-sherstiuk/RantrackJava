class RectangleColore extends Rectangle {
    private String couleur;

    public RectangleColore(double largeur, double hauteur, String couleur) {
        super(largeur, hauteur);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncouleur = " + couleur;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof RectangleColore)) return false;
        RectangleColore rc = (RectangleColore) obj;
        return this.couleur != null && this.couleur.equals(rc.couleur);
    }
}
