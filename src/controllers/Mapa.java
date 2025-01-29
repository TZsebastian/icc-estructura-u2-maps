package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Mapa {
    public Mapa() {
        hashMap();
        treeMapa();
        linkedHashMapa();
    }

    public void hashMap() {
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno ", 5);
        mapa.put("Mango", 6);

        System.out.println(mapa);

        // containsKey
        System.out.println("Hay pera " + mapa.containsKey("Pera"));
        System.out.println("Hay kiwi " + mapa.containsKey("Kiwi"));

        // Obtener valor
        System.out.println("Valor de pera " + mapa.get("Pera"));

        // Eliminar item
        mapa.remove("Pera");

        System.out.println(mapa);

    }

    public void linkedHashMapa(){
        LinkedHashMap<String, Integer> miLinkedhashmapa = new LinkedHashMap<>();

        miLinkedhashmapa.put("Manzana", 10);
        miLinkedhashmapa.put("Pera", 11);
        miLinkedhashmapa.put("Durazno", 5);
        miLinkedhashmapa.put("Mango", 6);

        // containsKey
        System.out.println("Hay pera " + miLinkedhashmapa.containsKey("Pera"));
        System.out.println("Hay kiwi " + miLinkedhashmapa.containsKey("Kiwi"));

        // Obtener valor
        System.out.println("Valor de pera " + miLinkedhashmapa.get("Pera"));

        // Eliminar item
        miLinkedhashmapa.remove("Pera");

        System.out.println(miLinkedhashmapa);

    }

    public void treeMapa() {
        TreeMap<String, Integer> mapa = new TreeMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        // containsKey
        System.out.println("Hay pera " + mapa.containsKey("Pera"));
        System.out.println("Hay kiwi " + mapa.containsKey("Kiwi"));

        // Obtener valor
        System.out.println("Valor de pera " + mapa.get("Pera"));

        // Eliminar item
        mapa.remove("Pera");

        System.out.println(mapa);

    }

}
