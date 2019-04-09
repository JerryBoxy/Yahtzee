package com.game;

public class Die {

    private Integer number;
    private Integer value;

    public Die(Integer number, Integer value) {
        this.number = number;
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
