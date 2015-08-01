package com.rllayus.eaglesschool;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ricardo Laredo on 22-May-15.
 */
public class TemaMananger {
    private static String[] countryArray = {"Tema1", "Tema2", "Tema3", "Tema4", "Tema4", "Tema5"};
    private static String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut " +
            "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea " +
            "commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    private static TemaMananger mInstance;
    private List<Tema> countries;

    public static TemaMananger getInstance() {
        if (mInstance == null) {
            mInstance = new TemaMananger();
        }

        return mInstance;
    }

    public List<Tema> getCountries() {
        if (countries == null) {
            countries = new ArrayList<>();

            for (String countryName : countryArray) {
                Tema country = new Tema();
                country.nombre = countryName;
                country.descripcion = loremIpsum;
                country.url="https://drive.google.com/file/d/0B3yIsb4tV0QaSndHTlFPd0JZZjQ/view?usp=sharing";
//                country.imagenName = countryName.replaceAll("\\s+","").toLowerCase();
                country.imagenName="ic_launcher";
                countries.add(country);
            }
        }

        return  countries;
    }

}
