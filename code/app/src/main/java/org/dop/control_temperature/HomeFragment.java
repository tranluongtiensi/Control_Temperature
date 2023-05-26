package org.dop.control_temperature;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.dop.control_temperature.adapters.RecyclerAdapters;
import org.dop.control_temperature.model.RecyclerItem;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerAdapters recyclerAdapters;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        List<RecyclerItem> items = new ArrayList<>();
        items.add(new RecyclerItem(R.drawable.wemos_d1, "Wemos D1", "14:30 30-04-2023"));
        items.add(new RecyclerItem(R.drawable.respberry, "Raspberry Pi", "14:00 30-04-2023"));
        items.add(new RecyclerItem(R.drawable.wemos_d1, "Wemos D1", "14:30 30-04-2023"));

        recyclerAdapters = new RecyclerAdapters(items);
        recyclerView.setAdapter(recyclerAdapters);
        return view;
    }
}