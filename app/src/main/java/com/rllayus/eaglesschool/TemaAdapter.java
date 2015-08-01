package com.rllayus.eaglesschool;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Ricardo Laredo on 22-May-15.
 */
public class TemaAdapter extends RecyclerView.Adapter<TemaAdapter.ViewHolder>{

    private List<Tema> countries;
    private int rowLayout;
    private Context mContext;

    public TemaAdapter(List<Tema> countries, int rowLayout, Context context) {
        this.countries = countries;
        this.rowLayout = rowLayout;
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Tema country = countries.get(i);
        viewHolder.countryName.setText(country.nombre);
        viewHolder.countryImage.setImageResource(R.mipmap.ic_launcher);
        viewHolder.itemView.setTag(country);

    }

    @Override
    public int getItemCount() {
        return countries == null ? 0 : countries.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements AdapterView.OnClickListener {


        public TextView countryName;
        public ImageView countryImage;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            countryName = (TextView) itemView.findViewById(R.id.countryName);
            countryImage = (ImageView)itemView.findViewById(R.id.countryImage);
        }
        /**
         * Called when a view has been clicked.
         *
         * @param v The view that was clicked.
         */
        @Override
        public void onClick(View v) {

            Uri pdfUri = Uri.parse ("file: //sdcard/sdcard0/test.pdf");
            PDFTools.openPDF(v.getContext(), pdfUri);
        }

    }
}