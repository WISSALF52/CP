import java.util.Date;

public class Operation {
    private Type type;
    private Date date;
    private double  montant;

    public Type getType() {
        return type;
    }

    public Operation(Type type, double montant) {
        this.type = type;
        this.montant = montant;
        this.date=new Date();
    }

    @Override
    public String toString() {
        return "Operation{" +
                "type=" + type +
                ", date=" + date +
                ", montant=" + montant +
                '}';
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
