package com.simbirsoft.wordpressclient.ui.bookmarks;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.simbirsoft.wordpressclient.R;

import java.util.ArrayList;
import java.util.List;

public class BookmarksFragment extends Fragment {

    RecyclerView recyclerView;
    BookmarksAdapter bookmarksAdapter;
    List<Bookmarks> bookmarksList;

    private BookmarksViewModel bookmarksViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bookmarksList= new ArrayList<>();
        bookmarksViewModel =
                ViewModelProviders.of(this).get(BookmarksViewModel.class);
        View root = inflater.inflate(R.layout.screen_bookmarks, container, false);

        recyclerView = root.findViewById(R.id.rv_bookmarks);
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


        bookmarksAdapter = new BookmarksAdapter(getActivity(), bookmarksList);
        recyclerView.setAdapter(bookmarksAdapter);

        return root;
    }
}