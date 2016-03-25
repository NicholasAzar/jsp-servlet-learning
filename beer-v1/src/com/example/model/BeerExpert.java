package com.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nick on 25/03/16.
 */
public class BeerExpert {
    public List getBrands (String color) {
        List<String> brands = new ArrayList<String>();

        if (color != null && color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }

        return brands;
    }
}
