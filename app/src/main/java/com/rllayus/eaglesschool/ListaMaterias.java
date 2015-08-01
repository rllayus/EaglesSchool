package com.rllayus.eaglesschool;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;


public class ListaMaterias extends ActionBarActivity implements RecyclerView.OnItemTouchListener{
    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean b) {

    }

    PDFTools pdfTools;
    RecyclerView rv;
    TemaAdapter temaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_materias);
        rv=(RecyclerView)findViewById(R.id.rv);
        rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        rv.setItemAnimator(new DefaultItemAnimator());
        temaAdapter=new TemaAdapter(TemaMananger.getInstance().getCountries(),R.layout.item_card_view,this);
        rv.setAdapter(temaAdapter);
//        rv.addOnItemTouchListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lista_materias, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
//        PDFTools.downloadAndOpenPDF(this,);
//        PDFTools.showPDFUrl(this,"https://drive.google.com/file/d/0B3yIsb4tV0QaSndHTlFPd0JZZjQ/view?usp=sharing");

    }
}
