package org.sddtu.engifest2017.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.sddtu.engifest2017.DataProviders.EventData;
import org.sddtu.engifest2017.R;

import java.util.ArrayList;

/**
 * Created by mohitkumar on 08/01/17.
 */

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.RecyclerViewHolder> {

    Context context;
    ArrayList<EventData> arrayList = new ArrayList<EventData>();

    public EventAdapter(Context context,ArrayList<EventData> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.event_card_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view,context,arrayList);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        EventData eventData = arrayList.get(position);
        holder.textView1.setText(eventData.getName());
        holder.imageView.setImageResource(eventData.getImage());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView textView1;
        ImageView imageView;
        Context context;
        ArrayList<EventData> arrayList = new ArrayList<EventData>();
        public RecyclerViewHolder(View itemView,Context context,ArrayList<EventData> arrayList) {
            super(itemView);
            this.context = context;
            this.arrayList = arrayList;
            textView1 = (TextView)itemView.findViewById(R.id.event_name);
            imageView = (ImageView)itemView.findViewById(R.id.image_event);

        }
    }
}
