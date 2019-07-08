package com.example.indiastourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Punjab extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_punjab, container, false);

        ListView listView = view.findViewById(R.id.listView_punjab);

        ArrayList<Data_For_Punjab> dataForPunjabArrayList = new ArrayList<>();
        dataForPunjabArrayList.add(new Data_For_Punjab("Amritsar", "Amritsar", R.drawable.amritsar, getResources().getString(R.string.about_amritsar)));
        dataForPunjabArrayList.add(new Data_For_Punjab("Wagah Border", "Amritsar", R.drawable.wagahborder, getResources().getString(R.string.about_wagahborder)));
        dataForPunjabArrayList.add(new Data_For_Punjab("Kartarpur", "Jalandhar", R.drawable.kartarpur, getResources().getString(R.string.about_kartarpur)));
        dataForPunjabArrayList.add(new Data_For_Punjab("Brahma Sarovar", "Harayana", R.drawable.brahma, getResources().getString(R.string.about_brahma_sarovar)));
        Adapter_For_Places_Punjab adapter_for_places_punjab = new Adapter_For_Places_Punjab(getContext(), R.layout.place_item_preview, dataForPunjabArrayList);
        listView.setAdapter(adapter_for_places_punjab);


        return view;
    }

}
