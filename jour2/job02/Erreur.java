class Erreur {
    public static void main(String[] args) {
        E1 x = new E1();
        E3 y = new E3();  // anciennement E2 — remplacé par E3 pour que y ait accès à c
        E3 z = new E3();  // on garde E3 pour que z ait accès à b
        E3 v = new E3();  // anciennement E4 — remplacé par E3 pour que v ait accès à c
        E5 w = new E5();

        System.out.println(x.a);  // OK
        System.out.println(y.c);  // OK — y est de type E3, donc c est accessible
        System.out.println(z.b);  // OK — z est de type E3, b est hérité de E2
        System.out.println(v.c);  // OK — v est de type E3
        System.out.println(w.a);  // OK — w est de type E5, a est hérité de E1
    }
}

class E1 {
    int a = 1;
}

class E2 extends E1 {
    int b = 2;
}

class E3 extends E2 {
    int c = 3;
}

class E4 extends E1 {
    int d = 4;
}

class E5 extends E4 {
    int e = 5;
}
