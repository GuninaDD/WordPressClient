package com.simbirsoft.wordpressclient.ui.labels;

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

public class LabelsFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        List<Labels> labelsList = new ArrayList<>();
        View root = inflater.inflate(R.layout.screen_labels, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.rv_labels);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        labelsList.add(
                new Labels(R.mipmap.ic_red_label, "Метка 1"));
        labelsList.add(
                new Labels(R.mipmap.ic_green_label, "Метка 2"));

        LabelsAdapter labelsAdapter = new LabelsAdapter(getActivity(), labelsList);
        recyclerView.setAdapter(labelsAdapter);

        return root;
    }


}