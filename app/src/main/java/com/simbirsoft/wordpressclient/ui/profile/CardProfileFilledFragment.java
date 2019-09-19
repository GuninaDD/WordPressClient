package com.simbirsoft.wordpressclient.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.simbirsoft.wordpressclient.R;
import com.simbirsoft.wordpressclient.ui.blogs.Blogs;
import com.simbirsoft.wordpressclient.ui.blogs.BlogsAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CardProfileFilledFragment extends Fragment {

    private static final String TAG = CardProfileUnfilledFragment.class.getSimpleName();
    CardView mCardView;

    public static CardProfileFilledFragment newInstance()
    {
        CardProfileFilledFragment fragment = new CardProfileFilledFragment();
        fragment.setRetainInstance(true);
        return fragment;
    }


    public CardProfileFilledFragment()
    {

    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.card_profile_filled,container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view,savedInstanceState);
        mCardView = (CardView) view.findViewById(R.id.filled_profile_card);
        ListView mListView = (ListView) view.findViewById(R.id.filed_list_profile);

        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        HashMap<String, String> map;


        map = new HashMap<>();
        map.put("header", "Имя");
        map.put("value", "Вася");
        arrayList.add(map);


        map = new HashMap<>();
        map.put("header", "Фамииля");
        map.put("value", "Иванов");
        arrayList.add(map);

        map = new HashMap<>();
        map.put("header", "Отображаемой для всех имя");
        map.put("value", "Кот Василий");
        arrayList.add(map);

        map = new HashMap<>();
        map.put("header", "Обо мне");
        map.put("value", "Рыжий и хитрый");
        arrayList.add(map);


        SimpleAdapter adapter = new SimpleAdapter(getActivity(), arrayList, R.layout.simple_list_item_2_profile,
                new String[]{"header", "value"},
                new int[]{R.id.profile_headers, R.id.profile_values});
        mListView.setAdapter(adapter);

    }

}
