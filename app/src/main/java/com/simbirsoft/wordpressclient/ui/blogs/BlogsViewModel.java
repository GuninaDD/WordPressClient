package com.simbirsoft.wordpressclient.ui.blogs;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BlogsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BlogsViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}