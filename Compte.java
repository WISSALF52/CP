import java.util.ArrayList;
import java.util.Iterator;

public class Compte {
    private int code;
    private double solde;
    private ArrayList<Operation> listeOperation;

    public Compte(double solde) {
        this.solde = solde;
        this.listeOperation=new ArrayList<>();
    }
    public void addOperation(double mt, Type type){
        Operation op=new Operation(type, mt);
        listeOperation.add(op);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    public void retirer(double mt){
        if(solde>=mt){
        solde=solde-mt;
        addOperation(mt,Type.Retrait);}
        else System.out.println("chosir un montant");
    }
    public void deposer(double mt){
        solde=solde+mt;
        addOperation(mt,Type.Depot);

    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +

                '}';
    }
    boolean printRelevet(){
        Iterator<Operation> iter=listeOperation.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        return true;
    }
}
