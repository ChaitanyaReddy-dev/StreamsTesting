package com.example.model;

import java.util.List;

public class PoCharecteristics {
    List<PoCharecteristic> poCharecteristic;

    public List<PoCharecteristic> getPoCharecteristic() {
        return poCharecteristic;
    }

    public void setPoCharecteristic(List<PoCharecteristic> poCharecteristic) {
        this.poCharecteristic = poCharecteristic;
    }

    @Override
    public String toString() {
        return "PoCharecteristics{" +
                "poCharecteristic=" + poCharecteristic +
                '}';
    }
}
