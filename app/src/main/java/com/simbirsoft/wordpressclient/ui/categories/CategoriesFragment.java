package com.simbirsoft.wordpressclient.ui.categories;

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

public class CategoriesFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        List<Categories> categoriesList = new ArrayList<>();
        View root = inflater.inflate(R.layout.screen_categories, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.rv_categories);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        categoriesList.add(
                new Categories("Категория 1", "Описание категории 1"));
        categoriesList.add(
                new Categories("Категория 2", "Описание категории 2"));

        CategoriesAdapter categoriesAdapter = new CategoriesAdapter(getActivity(), categoriesList);
        recyclerView.setAdapter(categoriesAdapter);

        return root;
    }
}