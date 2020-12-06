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

