package org.sddtu.engifest2017.Adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.sddtu.engifest2017.DataProviders.PlaceCardData;
import org.sddtu.engifest2017.R;

import java.util.ArrayList;

/**
 * Created by mohitkumar on 07/01/17.
 */

public class PlaceCard extends RecyclerView.Adapter<PlaceCard.RecyclerViewHolder> {

    Context context;
    ArrayList<PlaceCardData> arrayList = new ArrayList<PlaceCardData>();

    public PlaceCard(Context context,ArrayList<PlaceCardData> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.place_card_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view,context,arrayList);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        PlaceCardData placeCardData = arrayList.get(position);
        Typeface tf = Typeface.createFromAsset(context.getAssets(),"fonts/OpenSans-Regular.ttf");

        holder.textView1.setTypeface(tf);
        holder.textView2.setTypeface(tf);

        holder.textView1.setText(placeCardData.getPlace());
        holder.textView2.setText(placeCardData.getInfo());
        holder.imageView.setImageResource(placeCardData.getSrc());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView textView1,textView2;
        ImageView imageView;
        Context context;
        ArrayList<PlaceCardData> arrayList = new ArrayList<PlaceCardData>();
        public RecyclerViewHolder(View itemView,Context context,ArrayList<PlaceCardData> arrayList) {
            super(itemView);
            this.context = context;
            this.arrayList = arrayList;
            textView2 = (TextView)itemView.findViewById(R.id.place_info);
            textView1 = (TextView)itemView.findViewById(R.id.place_name);
            imageView = (ImageView)itemView.findViewById(R.id.place_image);
        }
    }
}
