package com.simbirsoft.wordpressclient.ui.blogs;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.simbirsoft.wordpressclient.R;
import com.simbirsoft.wordpressclient.ui.posts.PostsActivity;
import com.simbirsoft.wordpressclient.ui.posts.PostsAdapter;

import java.util.List;

public class BlogsAdapter extends RecyclerView.Adapter<BlogsAdapter.BlogsViewHolder> {


    private Context mCtx;
    private List<Blogs> blogsList;







    public BlogsAdapter(Context mCtx, List<Blogs> blogsList) {
        this.mCtx = mCtx;
        this.blogsList = blogsList;
    }

    @NonNull
    @Override
    public BlogsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_blogs, null);
        return new BlogsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BlogsViewHolder holder, int position) {

        Blogs blogs = blogsList.get(position);
        holder.blogHeader.setText(blogs.getHeader());
        holder.blogURL.setText(blogs.getURL());
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(blogs.getImage()));



    }

    @Override
    public int getItemCount() {
        return blogsList.size();

    }

    class BlogsViewHolder extends RecyclerView.ViewHolder{


        ImageView imageView;
        TextView blogHeader, blogURL;


        public BlogsViewHolder(@NonNull View itemView) {
            super(itemView);



            imageView = itemView.findViewById(R.id.imageView_blogImage);
            blogHeader = itemView.findViewById(R.id.textView_blogHeader);
            blogURL = itemView.findViewById(R.id.textView_blogURL);



        }




    }







}
