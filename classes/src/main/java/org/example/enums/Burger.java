package org.example.enums;

import java.util.List;
import java.util.Objects;

public class Burger {

    List<Toppings> toppingsList;
    Bun bun;

    public Burger() {
    }

    public List<Toppings> getToppingsList() {
        return toppingsList;
    }

    public void setToppingsList(List<Toppings> toppingsList) {
        this.toppingsList = toppingsList;
    }

    public Bun getBun() {
        return bun;
    }

    public void setBun(Bun bun) {
        this.bun = bun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Burger burger)) return false;

        if (!Objects.equals(toppingsList, burger.toppingsList)) return false;
        return bun == burger.bun;
    }

    @Override
    public int hashCode() {
        int result = toppingsList != null ? toppingsList.hashCode() : 0;
        result = 31 * result + (bun != null ? bun.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Burger{" + "toppingsList=" + toppingsList + ", bun=" + bun + '}';
    }
}
