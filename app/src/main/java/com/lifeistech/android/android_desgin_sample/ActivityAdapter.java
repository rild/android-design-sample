package com.lifeistech.android.android_desgin_sample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ActivityAdapter extends ArrayAdapter<Item>{
    private List<Item> items;
    private LayoutInflater layoutInflater = null;
    public ActivityAdapter(@NonNull Context context, int resource, @NonNull List<Item> objects) {
        super(context, resource, objects);
        items = objects;
        this.layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item,parent,false);
        }

        Item item = items.get(position);
        TextView textView = ((TextView)convertView.findViewById(R.id.activity_item));
        textView.setText(item.getActivityName());

        return convertView;
    }
}
