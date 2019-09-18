package com.simbirsoft.wordpressclient.ui.categories;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.simbirsoft.wordpressclient.R;

import java.util.ArrayList;
import java.util.HashMap;

public class CategoriesFragment extends Fragment {

    private CategoriesViewModel categoriesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        categoriesViewModel =
                ViewModelProviders.of(this).get(CategoriesViewModel.class);
        View root = inflater.inflate(R.layout.screen_categories, container, false);
        /*final TextView textView = root.findViewById(R.id.text_gallery);
        categoriesViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/

        ListView listView = root.findViewById(R.id.list_categories);

        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        HashMap<String, String> map;

        //1
        map = new HashMap<>();
        map.put("categ", "Категория 1");
        map.put("descript", "Описание категории 1");
        arrayList.add(map);

        // 2
        map = new HashMap<>();
        map.put("categ", "Категория 2");
        map.put("descript", "Описание категории 2");
        arrayList.add(map);


        SimpleAdapter adapter = new SimpleAdapter(getActivity(), arrayList, android.R.layout.simple_list_item_2,
                new String[]{"categ", "descript"},
                new int[]{android.R.id.text1, android.R.id.text2});
        listView.setAdapter(adapter);


        return root;
    }
}