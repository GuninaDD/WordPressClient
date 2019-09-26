package com.simbirsoft.wordpressclient.ui.posts;

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

    public PostsAdapter(Context mCtx, List<Posts> postsList) {
        this.mCtx = mCtx;
        this.postsList = postsList;
    }

    @NonNull
    @Override
    public PostsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.item_post, null);
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
        holder.post_date_time.setText(posts.getDate_time());
    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    class PostsViewHolder extends RecyclerView.ViewHolder {
        ImageView postAvatar, postImage;
        TextView postLabel, postHeader, postUsername, post_date_time;

        public PostsViewHolder(@NonNull View itemView) {
            super(itemView);

        }

    }

}



