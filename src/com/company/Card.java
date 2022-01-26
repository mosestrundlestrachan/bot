package com.company;

import java.util.HashMap;
import java.util.Map;

public class Card {
    String name;
    Map<Trait, Integer> traits = new HashMap<>();
    Types type;

    public Card(String name, Types type) {
        this.name = name;
        this.type = type;
    }

    public Card(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' + type +
                traits +
                '}';
    }

    public void addTrait(Trait t, int howMuch) {
        traits.put(t, howMuch);
    }

    public int getTrait(Trait t) {
        return traits.get(t);
    }
}
