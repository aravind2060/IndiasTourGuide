package com.example.indiastourguide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter_For_Places_Andhra extends ArrayAdapter<Data_For_Andhra> {

    Context contextt;

    public Adapter_For_Places_Andhra(Context context, int resource, List<Data_For_Andhra> objects) {

        super(context, resource, objects);
        contextt = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Data_For_Andhra dataForAndhra = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.place_item_preview, parent, false);
        }
        ImageView imageView = convertView.findViewById(R.id.preview_of_image_before_enlarging);
        TextView spotname = convertView.findViewById(R.id.preview_of_name_of_spot);
        TextView place = convertView.findViewById(R.id.preview_of_place_of_spot);

        CardView cardView = convertView.findViewById(R.id.card_preview);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Common_class_for_enlarging.class);
                intent.putExtra("Image", dataForAndhra.getImageId());
                intent.putExtra("Text", dataForAndhra.getTexte());
                contextt.startActivity(intent);
            }
        });

        imageView.setImageResource(dataForAndhra.getImageId());
        spotname.setText(dataForAndhra.getSpotName());
        place.setText(dataForAndhra.getAddress());

        return convertView;
    }
}
