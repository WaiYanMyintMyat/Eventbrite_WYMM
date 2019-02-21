package com.wymm.eventbrite_wymm.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wymm.eventbrite_wymm.R;
import com.wymm.eventbrite_wymm.views.holders.HomeListViewHolder;

/**
 * Created by Wai Yan Myint Myat on 2/22/19.
 */
public class HomeListRecyclerAdapter extends RecyclerView.Adapter<HomeListViewHolder> {
    @NonNull
    @Override
    public HomeListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_item_home, viewGroup, false);
        return new HomeListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeListViewHolder homeListViewHolder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }
}
