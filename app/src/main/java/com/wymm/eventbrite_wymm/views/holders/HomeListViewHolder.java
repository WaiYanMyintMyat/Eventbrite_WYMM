package com.wymm.eventbrite_wymm.views.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.wymm.eventbrite_wymm.R;

/**
 * Created by Wai Yan Myint Myat on 2/22/19.
 */
public class HomeListViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivHero, ivList1, ivList2, ivList3;
    public HomeListViewHolder(@NonNull View itemView) {
        super(itemView);
        setUpFindViewById(itemView);

        RequestOptions requestOptions = new RequestOptions();
        requestOptions = requestOptions.transform(new CenterCrop(), new RoundedCorners(16));

        Glide.with(itemView.getContext())
                .load(itemView.getContext().getResources().getDrawable(R.drawable.alcohol))
                .apply(requestOptions)
                .into(ivHero);

        Glide.with(itemView.getContext())
                .load(itemView.getContext().getResources().getDrawable(R.drawable.chocolate_wine))
                .apply(requestOptions)
                .into(ivList1);

        Glide.with(itemView.getContext())
                .load(itemView.getContext().getResources().getDrawable(R.drawable.new_york_1))
                .apply(requestOptions)
                .into(ivList2);

        Glide.with(itemView.getContext())
                .load(itemView.getContext().getResources().getDrawable(R.drawable.alcohol))
                .apply(requestOptions)
                .into(ivList3);
    }

    private void setUpFindViewById(View itemView) {
        ivHero = itemView.findViewById(R.id.iv_hero);
        ivList1 = itemView.findViewById(R.id.iv_list_1);
        ivList2 = itemView.findViewById(R.id.iv_list_2);
        ivList3 = itemView.findViewById(R.id.iv_list_3);
    }
}
