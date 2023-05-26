package org.dop.control_temperature.adapters;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.dop.control_temperature.R;
import org.dop.control_temperature.model.RecyclerItem;
import org.dop.control_temperature.viewHolder.RecViewHolder;

import java.util.List;

public class RecyclerAdapters extends RecyclerView.Adapter<RecViewHolder> {

    private List<RecyclerItem> items;

    public RecyclerAdapters(List<RecyclerItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);
        return new RecViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecViewHolder holder, int position) {
        RecyclerItem item = items.get(position);
        holder.deviceImg.setImageResource(item.getImageResId());
        holder.deviceName.setText(item.getTitle());
        holder.time.setText(item.getTime());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
