package com.simbirsoft.wordpressclient.ui.labels;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.simbirsoft.wordpressclient.R;

import java.util.List;

public class LabelsAdapter extends RecyclerView.Adapter<LabelsAdapter.LabelsViewHolder> {

    private Context mCtx;
    private List<Labels> labelsList;

    LabelsAdapter(Context mCtx, List<Labels> labelsList) {
        this.mCtx = mCtx;
        this.labelsList = labelsList;
    }


    @NonNull
    @Override
    public LabelsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        @SuppressLint("InflateParams") View view = inflater.inflate(R.layout.item_labels, null);
        return new LabelsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LabelsViewHolder holder, int position) {
        Labels labels = labelsList.get(position);
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(labels.getImage()));
        holder.labelHeader.setText(labels.getLabelHeader());

    }

    @Override
    public int getItemCount() {
        return labelsList.size();
    }

    class LabelsViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView labelHeader;

        LabelsViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.iv_labelcolor);
            labelHeader = itemView.findViewById(R.id.tv_labelheader);
        }
    }
}
