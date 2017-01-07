package org.sddtu.engifest2017;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohitkumar on 07/01/17.
 */

public class FlipAdapter extends ArrayAdapter {

    List list = new ArrayList();

    public FlipAdapter(Context context, int resource) {
        super(context, resource);
    }

    static class Data {
        TextView title;
        ImageView background;
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row;
        row = convertView;
        Data d;
        if(convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.custom_flip_layout,parent,false);
            d = new Data();
            d.title = (TextView) row.findViewById(R.id.flip_text);
            d.background = (ImageView)row.findViewById(R.id.background_work);
            row.setTag(d);
        }
        else {
            d = (Data) row.getTag();
        }

        FlipViewData flipViewData = (FlipViewData) this.getItem(position);
        d.title.setText(flipViewData.getPlace());
        d.background.setImageResource(flipViewData.getImagesrc());
        return row;
    }
}
