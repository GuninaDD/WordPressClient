package com.simbirsoft.wordpressclient.ui.posts;

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

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostsViewHolder> {

    private Context mCtx;
    private List<Posts> postsList;

    PostsAdapter(Context mCtx, List<Posts> postsList) {
        this.mCtx = mCtx;
        this.postsList = postsList;
    }

    @NonNull
    @Override
    public PostsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        @SuppressLint("InflateParams") View view = inflater.inflate(R.layout.item_post, null);
        return new PostsAdapter.PostsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostsViewHolder holder, int position) {
        Posts posts = postsList.get(position);
        holder.postAvatar.setImageDrawable(mCtx.getResources().getDrawable(posts.getAvatar()));
        holder.postImage.setImageDrawable(mCtx.getResources().getDrawable(posts.getAvatar()));
        holder.postLabel.setText(posts.getLabel());
        holder.postHeader.setText(posts.getHeader());
        holder.postUsername.setText(posts.getUsername());
        holder.publication.setText(posts.getPublication());
    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    class PostsViewHolder extends RecyclerView.ViewHolder {
        ImageView postAvatar, postImage;
        TextView postLabel, postHeader, postUsername, publication;

        PostsViewHolder(@NonNull View itemView) {
            super(itemView);

        }

    }

}



