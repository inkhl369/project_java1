package clientforkyrsach;

public class suv extends cars {
    String TypeSuspension;

    public suv(String ID, String name, String model, Double price, String description, String TypeSuspension) {
        super(ID, name, model, price, description);
        this.TypeSuspension = TypeSuspension;
    }

    public String getTypeSuspension() {
        return TypeSuspension;
    }

    public void setTypeSuspension(String TypeSuspension) {
        this.TypeSuspension = TypeSuspension;
    }
}
