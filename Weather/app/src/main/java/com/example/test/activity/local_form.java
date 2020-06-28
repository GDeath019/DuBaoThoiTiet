package com.example.test.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.test.R;
import com.example.test.adapter.DBhelper;
import com.example.test.adapter.ShopLocal;
import com.example.test.models.City;
import com.example.test.models.Recycle_City;
import com.example.test.models.Weather_SevenDay;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class local_form extends AppCompatActivity {
    RecyclerView recyclerView;
    Button btn;
    DBhelper dbh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_form);
        btn = (Button) findViewById(R.id.btnChiTiet);
        dbh = new DBhelper(local_form.this);
        recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        recyclerView.hasFixedSize();
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager
                (local_form.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        
        ShowLocal();
    }

    private void ShowLocal() {
        ArrayList<City> cities = dbh.getAllWords();
//        ArrayList<Recycle_City> recycleCities =new ArrayList<>();
//        recycleCities.add(new Recycle_City("1","1","1","1",
//                "1","1","1","1","1","1","1"));
//        recycleCities.add(new Recycle_City("12","12","12","12",
//                "12","12","12","12","12","12","12"));
//        recycleCities.add(new Recycle_City("15","15","15","15",
//                "15","15","15","15","15","15","15"));
//        recycleCities.add(new Recycle_City("19","19","19","19",
//                "19","19","19","19","19","19","19"));
//        ShopLocal slc =new ShopLocal(recycleCities,local_form.this);
//        recyclerView.setAdapter(slc);
        int i=0;
        final String tvCountry, tvCity, tvNhietDo, tvMinMax, tvLineStatus, tvDoAm, tvMay, tvGio, tvHours, tvSunOn, tvSunOff;
        while (i < cities.size()){

        }
    }

    protected void onStart(){
        super.onStart();
        dbh.openDB();
    }
    protected void onStop(){
        super.onStop();
        dbh.closeDB();
    }
}
