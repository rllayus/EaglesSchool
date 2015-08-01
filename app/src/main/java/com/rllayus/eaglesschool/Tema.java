package com.rllayus.eaglesschool;

import android.content.Context;

/**
 * Created by Ricardo Laredo on 22-May-15.
 */
public class Tema {
    public  int id;
    public String nombre;
    public  String imagenName;
    public String descripcion;
    public String url;
    public int getImageResourceId(Context context)
    {
        try {
            return context.getResources().getIdentifier(this.imagenName, "drawable", context.getPackageName());

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
