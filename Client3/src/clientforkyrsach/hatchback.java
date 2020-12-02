/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientforkyrsach;

public class hatchback extends cars {
    String type;

    public hatchback(String ID, String name, String model, Double price, String type, String descriptionofequipment) {
        super(ID, name, model, price,descriptionofequipment);
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

