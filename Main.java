public class Main {

    public static void main(String[] args) {
Agence A=new Agence("Tunis");

            Client cl=new Client("Ahmed",125478);
        Compte cp= new Compte(5000);
        cp.retirer(500);
        cp.deposer(1000);
        cl.ajouterCompte(cp);
        Compte cp2= new Compte(10000);
        cp2.retirer(500);
        cp2.deposer(456);
        cl.ajouterCompte(cp2);
                cl.printCompte();
            A.ajouterClient(cl);
            Client cl2=new Client("Ali",125478);
            A.ajouterClient(cl2);
            cl2.ajouterCompte(new Compte(2000));
            cl2.ajouterCompte(new Compte(3000));
            A.afficherselonordresoldescomptesclientlambda();


    }
}