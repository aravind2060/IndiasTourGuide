package com.example.indiastourguide;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter_For_Places_Karnataka extends ArrayAdapter<Data_For_Karnataka> {
    Context contextt;

    public Adapter_For_Places_Karnataka(Context context, int resource, List<Data_For_Karnataka> objects) {
        super(context, resource, objects);
        contextt = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Data_For_Karnataka dataForKarnataka = getItem(position);
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
                intent.putExtra("Image", dataForKarnataka.getImageId());
                intent.putExtra("Text", dataForKarnataka.getTexte());
                contextt.startActivity(intent);
            }
        });

        imageView.setImageResource(dataForKarnataka.getImageId());
        spotname.setText(dataForKarnataka.getSpotName());
        place.setText(dataForKarnataka.getAddress());

        return convertView;
    }
}
