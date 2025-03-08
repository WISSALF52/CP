import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import static java.util.Collections.sort;

public class Agence  {
    private int code;
    private String nom;
    private LinkedList<Client> listeclients;
    public void ajouterClient(Client c){
        listeclients.add(c);
    }

    public Agence(String nom) {
        this.nom = nom;
        this.listeclients=new LinkedList<>();
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LinkedList<Client> getListeclients() {
        return listeclients;
    }

    public void setListeclients(LinkedList<Client> listeclients) {
        this.listeclients = listeclients;
    }

    @Override
    public String toString() {
        return "Agence{" +
                "code=" + code +
                ", nom='" + nom + '\'' +

                '}';
    }

   public void printclientsselonOrdrecroissantdessoldesdecompte(){
       Collections.sort(listeclients, new Comparator<Client>() {
           @Override
           public int compare(Client o1, Client o2) {
               int somme=0;
                for (Compte c:o1.getComptes()) {
                     somme+=c.getSolde();
                }
                int somme2=0;
                for (Compte c:o2.getComptes()) {
                    somme2 += c.getSolde();
                }
                if(somme>somme2){
                    return 1;
                }
                else if(somme<somme2){
                    return -1;
                }
                else{
                    return 0;
                }

           }
       });
       System.out.println(listeclients);

   }
   public void afficherselonordresoldescomptesclientlambda(){
        Collections.sort(listeclients,(o1,o2)->{
            int somme=0;
            for (Compte c:o1.getComptes()) {
                somme+=c.getSolde();
            }
            int somme2=0;
            for (Compte c:o2.getComptes()) {
                somme2 += c.getSolde();
            }
            if(somme>somme2){
                return 1;
            }
            else if(somme<somme2){
                return -1;
            }
            else{
                return 0;
            }
        });
        System.out.println(listeclients);
   }

}
