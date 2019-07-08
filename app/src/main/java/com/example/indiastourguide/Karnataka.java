package com.example.indiastourguide;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class Karnataka extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_karnataka, container, false);

        ListView listView = v.findViewById(R.id.listView_karnataka);

        ArrayList<Data_For_Karnataka> dataForKarnatakaArrayList = new ArrayList<>();

        dataForKarnatakaArrayList.add(new Data_For_Karnataka("Jog Falls", "Banglore", R.drawable.jogfalls, getResources().getString(R.string.about_jogfalls)));
        dataForKarnatakaArrayList.add(new Data_For_Karnataka("Hampi", "Banglore", R.drawable.hampi, getResources().getString(R.string.about_hampi)));
        dataForKarnatakaArrayList.add(new Data_For_Karnataka("Manglore", "Manglore", R.drawable.mangalore, getResources().getString(R.string.about_manglore)));
        dataForKarnatakaArrayList.add(new Data_For_Karnataka("Banglore", "Banglore", R.drawable.banglore, getResources().getString(R.string.about_banglore)));
        dataForKarnatakaArrayList.add(new Data_For_Karnataka("Mysore", "Mysore", R.drawable.mysore, getResources().getString(R.string.about_mysore)));


        Adapter_For_Places_Karnataka adapter_for_places_karnataka = new Adapter_For_Places_Karnataka(getContext(), R.layout.place_item_preview, dataForKarnatakaArrayList);
        listView.setAdapter(adapter_for_places_karnataka);
        return v;
    }

}

