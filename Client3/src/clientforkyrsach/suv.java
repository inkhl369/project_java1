/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
