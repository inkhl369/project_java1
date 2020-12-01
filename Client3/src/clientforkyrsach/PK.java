/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientforkyrsach;

public class PK extends computertechnika {
Double computpower;

    public PK(String ID, String name, String model, Double price, String description, Double computpower) {
        super(ID, name, model, price, description);
        this.computpower = computpower;
    }

    public Double getComputpower() {
        return computpower;
    }

    public void setComputpower(Double computpower) {
        this.computpower = computpower;
    }
}
