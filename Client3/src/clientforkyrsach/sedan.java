/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientforkyrsach;

public class sedan extends cars {
String TypeOfDrive;
    public String getTypeOfDrive() {
        return TypeOfDrive;
    }

    public void setTypeOfDrive(String TypeOfDrive) {
        this.TypeOfDrive = TypeOfDrive;
    }
    public sedan(String ID, String name, String model, Double price, String description, String TypeOfDrive) {
        super(ID, name, model, price, description);
        this.TypeOfDrive = TypeOfDrive;
      
    }
}

