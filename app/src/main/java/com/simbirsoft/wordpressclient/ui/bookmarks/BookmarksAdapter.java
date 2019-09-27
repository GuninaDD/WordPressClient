package com.simbirsoft.wordpressclient.ui.bookmarks;

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

public class BookmarksAdapter extends RecyclerView.Adapter<BookmarksAdapter.BookmarksViewHolder> {
    private Context mCtx;
    private List<Bookmarks> bookmarksList;

    public BookmarksAdapter(Context mCtx, List<Bookmarks> bookmarksList) {
        this.mCtx = mCtx;
        this.bookmarksList = bookmarksList;
    }


    @NonNull
    @Override
    public BookmarksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.item_blogs, null);
        return new BookmarksAdapter.BookmarksViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull BookmarksViewHolder holder, int position) {
        Bookmarks bookmarks = bookmarksList.get(position);
        holder.blogHeader.setText(bookmarks.getHeader());
        holder.blogURL.setText(bookmarks.getURL());
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(bookmarks.getImage()));
    }

    @Override
    public int getItemCount() {
        return bookmarksList.size();
    }

    class BookmarksViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView blogHeader, blogURL;

        public BookmarksViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_blogimage);
            blogHeader = itemView.findViewById(R.id.tv_blogheader);
            blogURL = itemView.findViewById(R.id.tv_blogurl);
        }
    }
}
