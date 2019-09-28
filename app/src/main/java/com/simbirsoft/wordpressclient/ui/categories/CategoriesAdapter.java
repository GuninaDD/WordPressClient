package com.simbirsoft.wordpressclient.ui.categories;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.simbirsoft.wordpressclient.R;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CategoriesViewHolder> {

    private Context mCtx;
    private List<Categories> categoriesList;

    CategoriesAdapter(Context mCtx, List<Categories> categoriesList) {
        this.mCtx = mCtx;
        this.categoriesList = categoriesList;
    }

    @NonNull
    @Override
    public CategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        @SuppressLint("InflateParams") View view = inflater.inflate(R.layout.item_categories, null);
        return new CategoriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesViewHolder holder, int position) {
        Categories categories = categoriesList.get(position);
        holder.header.setText(categories.getCategorie());
        holder.description.setText(categories.getCategorieDescription());
    }

    @Override
    public int getItemCount() {
        return categoriesList.size();
    }

    class CategoriesViewHolder extends RecyclerView.ViewHolder {
        TextView header, description;

        CategoriesViewHolder(@NonNull View itemView) {
            super(itemView);

            header = itemView.findViewById(R.id.tv_categorieheader);
            description = itemView.findViewById(R.id.tv_categoriedescription);
        }
    }
}
