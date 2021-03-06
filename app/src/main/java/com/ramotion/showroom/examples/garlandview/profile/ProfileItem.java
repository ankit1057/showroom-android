package com.ramotion.showroom.examples.garlandview.profile;


import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ramotion.showroom.R;
import com.ramotion.showroom.examples.garlandview.details.DetailsData;


public class ProfileItem extends RecyclerView.ViewHolder {

    public ProfileItem(View itemView) {
        super(itemView);
    }

    void setContent(DetailsData data) {
        ((TextView) itemView.findViewById(R.id.tv_title)).setText(data.title);
        ((TextView) itemView.findViewById(R.id.tv_text)).setText(data.text);
    }

}
