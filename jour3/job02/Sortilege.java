public class Sortilege extends Carte {
    private String nom;
    private String explication;

    public Sortilege(String nom, String explication, int cout) {
        super(cout);
        this.nom = nom;
        this.explication = explication;
    }

    @Override
    public void afficher() {
        System.out.println("Type : Sortilège");
        System.out.println("Coût : " + cout);
        System.out.println("Nom : " + nom);
        System.out.println("Effet : " + explication);
    }
}