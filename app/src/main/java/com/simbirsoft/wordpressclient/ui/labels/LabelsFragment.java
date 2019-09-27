package com.simbirsoft.wordpressclient.ui.labels;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.simbirsoft.wordpressclient.R;

import java.util.ArrayList;
import java.util.List;

public class LabelsFragment extends Fragment {

    private LabelsViewModel labelsViewModel;

    RecyclerView recyclerView;
    LabelsAdapter labelsAdapter;
    List<Labels> labelsList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        labelsList = new ArrayList<>();
        labelsViewModel =
                ViewModelProviders.of(this).get(LabelsViewModel.class);
        View root = inflater.inflate(R.layout.screen_labels, container, false);

        recyclerView = root.findViewById(R.id.rv_labels);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        labelsList.add(
                new Labels(R.mipmap.ic_red_label, "Метка 1"));
        labelsList.add(
                new Labels(R.mipmap.ic_green_label, "Метка 2"));


        labelsAdapter = new LabelsAdapter(getActivity(), labelsList);
        recyclerView.setAdapter(labelsAdapter);


        return root;
    }


}