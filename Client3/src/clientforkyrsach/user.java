/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientforkyrsach;

import java.io.Serializable;

/**
 *
 * @author ilya
 */
public class user implements Serializable{
    String login,password,ID;
    String familia;
    String name;
    String otchestvo;
    String adres;
    String nomercard;
    String srok1,srok2;
    String cvv2;

    public user() {
        login="";
        password="";
        ID="";
        familia="1";
        name="1";
        otchestvo="1";
        adres="1";
        nomercard="1";
        srok1="1";
        srok2="2018";
        cvv2="123";
    }
    public user(String login, String password, String ID, String familia, String name, String otchestvo, String adres, String nomercard, String srok1, String srok2, String cvv2) {
        this.login = login;
        this.password = password;
        this.ID = ID;
        this.familia = familia;
        this.name = name;
        this.otchestvo = otchestvo;
        this.adres = adres;
        this.nomercard = nomercard;
        this.srok1 = srok1;
        this.srok2 = srok2;
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

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
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

    public String getSrok1() {
        return srok1;
    }

    public void setSrok1(String srok1) {
        this.srok1 = srok1;
    }

    public String getSrok2() {
        return srok2;
    }

    public void setSrok2(String srok2) {
        this.srok2 = srok2;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }
}
