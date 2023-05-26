package org.dop.control_temperature.viewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.dop.control_temperature.R;

public class RecViewHolder extends RecyclerView.ViewHolder {

    public ImageView deviceImg;
    public TextView deviceName;
    public TextView time;


    public RecViewHolder(@NonNull View itemView) {
        super(itemView);

        deviceImg = itemView.findViewById(R.id.imageView);
        deviceName = itemView.findViewById(R.id.titleTV);
        time = itemView.findViewById(R.id.timeTV);
    }
}
