package com.simbirsoft.wordpressclient.ui.blogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.simbirsoft.wordpressclient.R;

import java.util.ArrayList;
import java.util.List;

public class BlogsFragment extends Fragment {

    private BlogsViewModel blogsViewModel;

    RecyclerView recyclerView;
    BlogsAdapter blogsAdapter;
    List<Blogs> blogsList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        blogsList = new ArrayList<>();
        blogsViewModel =
                ViewModelProviders.of(this).get(BlogsViewModel.class);
        View root = inflater.inflate(R.layout.screen_blogs, container, false);

        recyclerView = root.findViewById(R.id.rv_blogs);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        blogsList.add(
                new Blogs(R.drawable.ic_image, "Мой блог", "myblog.wordpress.com"));
        blogsList.add(
                new Blogs(R.drawable.ic_image, "Мой блог1", "myblog1.wordpress.com"));

        blogsAdapter = new BlogsAdapter(getActivity(), blogsList);
        recyclerView.setAdapter(blogsAdapter);

        return root;
    }


}