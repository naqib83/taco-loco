package com.tacoloco.tacoloco.models;

public class Quantity {

    private int vegTacoQuantity;
    private int chickenOrBeefTacoQuantity;
    private int chorizoTacoQuantity;

    public int getVegTacoQuantity() {
        return vegTacoQuantity;
    }

    public int getChickenOrBeefTacoQuantity() {
        return chickenOrBeefTacoQuantity;
    }

    public int getChorizoTacoQuantity() {
        return chorizoTacoQuantity;
    }

    public void setVegTacoQuantity(int vegTacoQuantity) {
        this.vegTacoQuantity = vegTacoQuantity;
    }

    public void setChickenOrBeefTacoQuantity(int chickenOrBeefTacoQuantity) {
        this.chickenOrBeefTacoQuantity = chickenOrBeefTacoQuantity;
    }

    public void setChorizoTacoQuantity(int chorizoTacoQuantity) {
        this.chorizoTacoQuantity = chorizoTacoQuantity;
    }
}
