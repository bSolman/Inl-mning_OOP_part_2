package Sprint1.bil;

import Sprint1.person.Bilägare;

public class Bil {
    private String regNr;
    private String model;
    private Bilägare bilägare;
    public Bil(String regNr, String model) {
        this.regNr = regNr;
        this.model = model;
    }

    public String getRegNr() {
        return regNr;
    }

    public String getModel() {
        return model;
    }

    public Bilägare getBilägare() {
        return bilägare;
    }

    public void setBilägare(Bilägare bilägare) {
        this.bilägare = bilägare;
    }

    public void buyCar(Bilägare bilägare){
        setBilägare(bilägare);
    }

    public void sellCar(Bilägare bilägare){
        setBilägare(bilägare);
    }
}
