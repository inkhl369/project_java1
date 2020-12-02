package clientforkyrsach;

abstract public class cars {
    protected String ID;
    protected String name;
    protected String model;
    protected Double price;
    protected String descriptionofequipment;

    public cars(String ID, String name, String model, Double price,String descriptionofequipment) {
        this.ID = ID;
        this.name = name;
        this.model = model;
        this.price = price;
        this.descriptionofequipment=descriptionofequipment;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
   public Double getvolumeTrunk() {
        return 1.0;
    }
   
public String getTypeOfDrive() {
        return "";
    }
public String getTypeSuspension() {
        return "";
    }
public String getType() {
        return "";
    }
 public String getDescription() {
        return descriptionofequipment;
    }

    public void setDescription(String description) {
        this.descriptionofequipment = description;
    }
}

