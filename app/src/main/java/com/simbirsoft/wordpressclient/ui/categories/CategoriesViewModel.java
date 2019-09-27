package com.simbirsoft.wordpressclient.ui.categories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CategoriesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CategoriesViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}