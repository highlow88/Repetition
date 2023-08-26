package com.example.repetition;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.repetition.R;
import com.example.repetition.Rep;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Rep> {

    private LayoutInflater inflater;

    public CustomAdapter(Context context, List<Rep> objects) {
        super(context, 0, objects);
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.list_item_layout, parent, false);
        }

        Rep rep = getItem(position);

        TextView attribute1TextView = view.findViewById(R.id.textViewAttribute1);
        TextView attribute2TextView = view.findViewById(R.id.textViewAttribute2);
        TextView attribute3TextView = view.findViewById(R.id.textViewAttribute3);

        // Populate the TextViews with data from the Rep object
        attribute1TextView.setText("enSak 1: " + rep.getAttribute1());
        attribute2TextView.setText("tvåSaker 2: " + rep.getAttribute2());
        attribute3TextView.setText("treSaker 3: " + rep.getAttribute3());

        return view;
    }
}
