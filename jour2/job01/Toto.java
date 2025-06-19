class Toto{
    int toto = 0;
    Toto(){
        toto = toto + 1;

    }
    public static void main(String[] tutu){
        Toto t = new Toto();
        
        Toto t2 = new Toto();

        System.out.println("Toto:" + toto);
        
    }

}
//Toto.java:12: error: non-static variable toto cannot be referenced from a static context
//        System.out.println("Toto:" + toto);                                    ^
//1 error



class Toto {
    static int toto = 0;

    Toto() {
        toto = toto + 1;
    }

    public static void main(String[] tutu) {
        Toto t = new Toto();
        Toto t2 = new Toto();

        System.out.println("Total des objets Toto : " + toto); //  2
    }
}

