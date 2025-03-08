import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Client  {
    private String nom;
    private int cin;
    private Vector<Compte> listeComptes;

    public Client(String nom, int cin) {
        this.nom = nom;
        this.cin = cin;
        this.listeComptes=new Vector<>();
    }
public void ajouterCompte(Compte cp){
        listeComptes.add(cp);
}
public  void printCompte(){
        for(int i=0;i<listeComptes.size();i++){
           System.out.println( listeComptes.get(i).toString());
            System.out.println(listeComptes.get(i).printRelevet());
            }


        }



    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", cin=" + cin +
                ", listeComptes=" + listeComptes +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public Vector<Compte> getComptes() {
        return listeComptes;
    }

    public void setComptes(Vector<Compte> listeComptes) {
        this.listeComptes = listeComptes;
    }


}
