package com.simbirsoft.wordpressclient.ui.blogs;

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

public class BlogsFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        List<Blogs> blogsList = new ArrayList<>();
        View root = inflater.inflate(R.layout.screen_blogs, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.rv_blogs);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        blogsList.add(
                new Blogs(R.drawable.ic_image, "Мой блог", "myblog.wordpress.com"));
        blogsList.add(
                new Blogs(R.drawable.ic_image, "Мой блог1", "myblog1.wordpress.com"));

        BlogsAdapter blogsAdapter = new BlogsAdapter(getActivity(), blogsList);
        recyclerView.setAdapter(blogsAdapter);

        return root;
    }


}