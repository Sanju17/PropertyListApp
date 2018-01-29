package com.csangharsha.propertylist.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.csangharsha.propertylist.R;
import com.csangharsha.propertylist.model.dto.Property;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by csangharsha on 1/29/18.
 */

public class PropertyListAdapter extends RecyclerView.Adapter<PropertyListAdapter.MyViewHolder>{

    private Context mContext;
    private List<Property> propertyList;

    public PropertyListAdapter(Context context, List<Property> propertyList) {
        this.mContext = context;
        this.propertyList = propertyList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.property_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Property property = propertyList.get(position);
        holder.title.setText(property.getTitle().getRendered());
        if(android.os.Build.VERSION.SDK_INT >= 24) {
            holder.description.setText(Html.fromHtml(property.getContent().getRendered(), Html.FROM_HTML_MODE_COMPACT));
        }else {
            holder.description.setText(Html.fromHtml(property.getContent().getRendered()));
        }
    }

    @Override
    public int getItemCount() {
        return propertyList.size();
    }

    public void notifyDataSetChanged(List<Property> propertyList) {
        this.propertyList = propertyList;
        notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.title)
        public TextView title;

        @BindView(R.id.description)
        public TextView description;

        public MyViewHolder(View view) {
            super(view);

            ButterKnife.bind(this, view);
        }
    }

}
