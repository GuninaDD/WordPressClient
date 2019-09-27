package com.simbirsoft.wordpressclient.ui.bookmarks;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BookmarksViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BookmarksViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}