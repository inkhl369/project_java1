package clientforkyrsach;

import java.io.Serializable;

public class user implements Serializable{
    String login,password,ID;
    String lastname;
    String name;
    String middlename;
    String adres;
    String nomercard;
    String validity1,validity2;
    String cvv2;

    public user() {
        login="";
        password="";
        ID="";
        lastname="1";
        name="1";
        middlename="1";
        adres="1";
        nomercard="1";
        validity1="1";
        validity2="2018";
        cvv2="123";
    }
    public user(String login, String password, String ID, String lastname, String name, String middlename, String adres, String nomercard, String validity1, String validity2, String cvv2) {
        this.login = login;
        this.password = password;
        this.ID = ID;
        this.lastname = lastname;
        this.name = name;
        this.middlename = middlename;
        this.adres = adres;
        this.nomercard = nomercard;
        this.validity1 = validity1;
        this.validity2 = validity2;
        this.cvv2 = cvv2;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getlastname() {
        return lastname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getmiddlename() {
        return middlename;
    }

    public void setmiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getNomercard() {
        return nomercard;
    }

    public void setNomercard(String nomercard) {
        this.nomercard = nomercard;
    }

    public String getvalidity1() {
        return validity1;
    }

    public void setvalidity1(String validity1) {
        this.validity1 = validity1;
    }

    public String getvalidity2() {
        return validity2;
    }

    public void setvalidity2(String validity2) {
        this.validity2 = validity2;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }
}
