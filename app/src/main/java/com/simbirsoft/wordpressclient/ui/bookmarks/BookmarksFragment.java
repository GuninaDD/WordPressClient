package com.simbirsoft.wordpressclient.ui.bookmarks;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.simbirsoft.wordpressclient.R;

import java.util.ArrayList;
import java.util.List;

public class BookmarksFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        List<Bookmarks> bookmarksList = new ArrayList<>();
        View root = inflater.inflate(R.layout.screen_bookmarks, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.rv_bookmarks);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        bookmarksList.add(
                new Bookmarks(R.drawable.ic_image, "Интересный блог 1", "intrestingblog1.wordpress.com"));
        bookmarksList.add(
                new Bookmarks(R.drawable.ic_image, "Интересный блог 2", "intrestingblog2.wordpress.com"));
        bookmarksList.add(
                new Bookmarks(R.drawable.ic_image, "Интересный блог 3", "intrestingblog3.wordpress.com"));
        bookmarksList.add(
                new Bookmarks(R.drawable.ic_image, "Интересный блог 4", "intrestingblog4.wordpress.com"));
        bookmarksList.add(
                new Bookmarks(R.drawable.ic_image, "Интересный блог 5", "intrestingblog5.wordpress.com"));


        BookmarksAdapter bookmarksAdapter = new BookmarksAdapter(getActivity(), bookmarksList);
        recyclerView.setAdapter(bookmarksAdapter);

        return root;
    }
}