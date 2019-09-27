package com.simbirsoft.wordpressclient.ui.categories;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.simbirsoft.wordpressclient.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CategoriesFragment extends Fragment {

    private CategoriesViewModel categoriesViewModel;

    RecyclerView recyclerView;
    CategoriesAdapter categoriesAdapter;
    List<Categories> categoriesList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        categoriesList = new ArrayList<>();
        categoriesViewModel =
                ViewModelProviders.of(this).get(CategoriesViewModel.class);
        View root = inflater.inflate(R.layout.screen_categories, container, false);

        recyclerView = root.findViewById(R.id.rv_categories);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        categoriesList.add(
                new Categories("Категория 1", "Описание категории 1"));
        categoriesList.add(
                new Categories("Категория 2", "Описание категории 2"));

        categoriesAdapter = new CategoriesAdapter(getActivity(), categoriesList);
        recyclerView.setAdapter(categoriesAdapter);

        return root;
    }
}