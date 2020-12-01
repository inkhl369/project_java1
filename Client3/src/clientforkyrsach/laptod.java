/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientforkyrsach;

public class laptod extends computertechnika {
String sensorpanel;
    public String getSensorpanel() {
        return sensorpanel;
    }

    public void setSensorpanel(String sensorpanel) {
        this.sensorpanel = sensorpanel;
    }
    public laptod(String ID, String name, String model, Double price, String description, String sensorpanel) {
        super(ID, name, model, price, description);
        this.sensorpanel = sensorpanel;
      
    }
}

