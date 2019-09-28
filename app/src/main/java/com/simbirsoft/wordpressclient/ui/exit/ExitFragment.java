package com.simbirsoft.wordpressclient.ui.exit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import androidx.lifecycle.ViewModelProviders;

import com.simbirsoft.wordpressclient.R;

public class ExitFragment extends Fragment {

    ExitViewModel exitViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        exitViewModel =
                ViewModelProviders.of(this).get(ExitViewModel.class);

        return inflater.inflate(R.layout.screen_exit, container, false);
    }
}