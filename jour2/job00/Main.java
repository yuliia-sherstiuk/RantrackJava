public class Main {
    public static void main(String[] args) {
        //crréation d'un objet Personne
        Personne p = new Personne(
            "SHEVSHENKO", 
            "Maria", 
            "17/11/2000", 
            "Aix en Provence", 
            "17 Vallon des Sources", 
            "+33 76 001 01 01 "
        );

        //public fields are accessible
        System.out.println("Nom: " + p.nom);
        System.out.println("Prénom: " + p.prenom);

        //protected fields are accessible
        System.out.println("Adresse: " + p.getAdresse());
        System.out.println("Téléphone: " + p.getTelephone());
    }
}
