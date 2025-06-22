class AbstractFinal {
    public static void main(String[] args) {
        A[] tab = new A[3];
        // tab[0] = new A(); // Erreur : on ne peut pas instancier une classe abstraite
        tab[0] = new B(); // Solution : utiliser une classe concrète

        tab[1] = new B();
        tab[2] = new C();

        ((B)tab[1]).b = 2; // On doit faire un cast explicite pour accéder à b

        // ((C)tab[2]).b = 3; // Erreur : la classe C ne possède pas l'attribut 'b'
        // Solution : supprimer cette ligne ou ajouter l'attribut b dans C si nécessaire
    }
}

// Classe abstraite, ne peut pas être instanciée directement
abstract class A {
    int a;
}

// Classe concrète avec un champ b
class B extends A {
    int b;
}

// Classe C avec un champ final c
class C extends A {
    final double c = 1;
}

// Classe abstraite D avec une erreur de syntaxe et de méthode
abstract class D extends A {
    double d;

    int operation(int a) {
        return (a * 2); // Correction : parenthèse fermante correcte
    }

    abstract int calcul(int b); // Méthode abstraite sans corps
}
