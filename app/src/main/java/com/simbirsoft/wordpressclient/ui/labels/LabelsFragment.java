package com.simbirsoft.wordpressclient.ui.labels;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.simbirsoft.wordpressclient.R;

public class LabelsFragment extends Fragment {

    private LabelsViewModel labelsViewModel;
    String[] labels = { "Метка 1", "Метка 2"};
    int[] labelsColors = {R.mipmap.ic_green_label, R.mipmap.ic_red_label};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        labelsViewModel =
                ViewModelProviders.of(this).get(LabelsViewModel.class);
        View root = inflater.inflate(R.layout.screen_labels, container, false);




            ListView listView = root.findViewById(R.id.labels_listview);



           /* listView.setAdapter(new ArrayAdapter<String>(getActivity(),
                    R.layout.list_labels, R.id.header_label_textView,   labels));*/



           CustomAdapter customAdapter = new CustomAdapter();
           listView.setAdapter(customAdapter);



        return root;
    }

    class CustomAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return labels.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getActivity().getLayoutInflater().inflate(R.layout.list_labels,null);
            ImageView imageView = view.findViewById(R.id.colorLabel_image);
            TextView textView = view.findViewById(R.id.header_label_textView);

            imageView.setImageResource(labelsColors[i]);
            textView.setText(labels[i]);


            return view;
        }
    }
}