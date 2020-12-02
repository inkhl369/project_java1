/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
