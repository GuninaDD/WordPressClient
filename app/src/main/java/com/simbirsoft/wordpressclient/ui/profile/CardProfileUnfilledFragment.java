package com.simbirsoft.wordpressclient.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.simbirsoft.wordpressclient.R;

public class CardProfileUnfilledFragment extends Fragment {

    private static final String TAG = CardProfileUnfilledFragment.class.getSimpleName();
    CardView mCardView;

    public static CardProfileUnfilledFragment newInstance()
    {
        CardProfileUnfilledFragment fragment = new CardProfileUnfilledFragment();
        fragment.setRetainInstance(true);
        return fragment;
    }


    public CardProfileUnfilledFragment()
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
        return inflater.inflate(R.layout.card_profile_unfilled,container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view,savedInstanceState);
        mCardView = (CardView) view.findViewById(R.id.unfilled_profile_card);
        ListView mListView = (ListView) view.findViewById(R.id.unfilled_list_profile);


        final String[] profile_headers = new String[] {
                "Имя", "Фамилия", "Отображаемое для всех имя", "Обо мне"
        };

// используем адаптер данных
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1, profile_headers);

        mListView.setAdapter(adapter);


    }

}
