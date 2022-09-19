package com.demo.lesson3.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    private Map<String, String> mapExample = new HashMap<>();

    public MapExample() {
        this.mapExample.put("jedi","General Kenobi");
        this.mapExample.put("sith", "Senate");
        //this.mapExample.put("jedi", "Plo Koon");
    }

    public void printMapExample() {
        for(String key: mapExample.keySet()) {
            System.out.println(mapExample.get(key));
        }

        for (String value: mapExample.values()) {
            System.out.println(value);
        }
    }
}
