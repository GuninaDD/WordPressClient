package com.simbirsoft.wordpressclient.ui.favorites;

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

public class FavoritesAdapter extends RecyclerView.Adapter<FavoritesAdapter.FavoritesViewHolder>{

    private Context mCtx;
    private List<Favorites> favoritesList;

    FavoritesAdapter(Context mCtx, List<Favorites> favoritesList) {
        this.mCtx = mCtx;
        this.favoritesList = favoritesList;
    }




    @NonNull
    @Override
    public FavoritesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        @SuppressLint("InflateParams") View view = inflater.inflate(R.layout.item_blogs, null);
        return new FavoritesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoritesViewHolder holder, int position) {
        Favorites favorites = favoritesList.get(position);
        holder.blogHeader.setText(favorites.getHeader());
        holder.blogURL.setText(favorites.getURL());
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(favorites.getImage()));
    }

    @Override
    public int getItemCount() {
        return favoritesList.size();
    }

    class FavoritesViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView blogHeader, blogURL;

        FavoritesViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.iv_blogimage);
            blogHeader = itemView.findViewById(R.id.tv_blogheader);
            blogURL = itemView.findViewById(R.id.tv_blogurl);
        }
    }
}
