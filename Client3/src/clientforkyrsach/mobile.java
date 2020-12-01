/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientforkyrsach;

public class mobile extends computertechnika {
    String supcomgen;

    public mobile(String ID, String name, String model, Double price, String description, String supcomgen) {
        super(ID, name, model, price, description);
        this.supcomgen = supcomgen;
    }

    public String getSupcomgen() {
        return supcomgen;
    }

    public void setSupcomgen(String supcomgen) {
        this.supcomgen = supcomgen;
    }
}
