package com.simbirsoft.wordpressclient.ui.favorites;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FavoritesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FavoritesViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}