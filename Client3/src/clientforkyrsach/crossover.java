package clientforkyrsach;

public class crossover extends cars {
    Double volumeTrunk;

    public crossover(String ID, String name, String model, Double price, String description, Double volumeTrunk) {
        super(ID, name, model, price, description);
        this.volumeTrunk = volumeTrunk;
    }

    public Double getvolumeTrunk() {
        return volumeTrunk;
    }

    public void setvolumeTrunk(Double volumeTrunk) {
        this.volumeTrunk = volumeTrunk;
    }
}
