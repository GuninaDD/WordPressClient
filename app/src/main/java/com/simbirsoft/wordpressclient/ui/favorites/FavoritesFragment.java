package com.simbirsoft.wordpressclient.ui.favorites;

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

public class FavoritesFragment extends Fragment {

    RecyclerView recyclerView;
    FavoritesAdapter favoritesAdapter;
    List<Favorites> favoritesList;

    private FavoritesViewModel favoritesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        favoritesList = new ArrayList<>();
        favoritesViewModel =
                ViewModelProviders.of(this).get(FavoritesViewModel.class);
        View root = inflater.inflate(R.layout.screen_favorites, container, false);

        recyclerView = root.findViewById(R.id.rv_favorites);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        favoritesList.add(
                new Favorites(R.drawable.ic_image, "Мой любимый блог 1", "myloveblog1.wordpress.com"));
        favoritesList.add(
                new Favorites(R.drawable.ic_image, "Мой любимый блог 2", "myloveblog2.wordpress.com"));
        favoritesList.add(
                new Favorites(R.drawable.ic_image, "Мой любимый блог 3", "myloveblog3.wordpress.com"));
        favoritesList.add(
                new Favorites(R.drawable.ic_image, "Мой любимый блог 4", "myloveblog4.wordpress.com"));
        favoritesList.add(
                new Favorites(R.drawable.ic_image, "Мой любимый блог 5", "myloveblog5.wordpress.com"));


        favoritesAdapter = new FavoritesAdapter(getActivity(), favoritesList);
        recyclerView.setAdapter(favoritesAdapter);

        return root;
    }
}