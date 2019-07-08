package com.example.indiastourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Andhra extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_andhra, container, false);

        ListView listView = view.findViewById(R.id.listView_andhra);

        ArrayList<Data_For_Andhra> data_for_karnatakaArrayList = new ArrayList<>();

        data_for_karnatakaArrayList.add(new Data_For_Andhra("Lepakshi", "Anantapuram", R.drawable.lepakshi, getResources().getString(R.string.about_lepakshi)));
        data_for_karnatakaArrayList.add(new Data_For_Andhra("Amaravathi", "Guntur", R.drawable.amravathi, getResources().getString(R.string.about_amaravathi)));
        data_for_karnatakaArrayList.add(new Data_For_Andhra("SriSailiam", "Kurnool", R.drawable.srisailam, getResources().getString(R.string.about_srisailam)));
        data_for_karnatakaArrayList.add(new Data_For_Andhra("Tirupati", "Chittoor", R.drawable.tirupati, getResources().getString(R.string.about_tirupati)));

        Adapter_For_Places_Andhra adapter_for_places = new Adapter_For_Places_Andhra(getContext(), R.layout.place_item_preview, data_for_karnatakaArrayList);

        listView.setAdapter(adapter_for_places);

        return view;
    }

}
