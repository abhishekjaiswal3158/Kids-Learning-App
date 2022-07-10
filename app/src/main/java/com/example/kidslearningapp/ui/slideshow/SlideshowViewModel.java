package com.example.kidslearningapp.ui.slideshow;

import android.graphics.Color;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.kidslearningapp.R;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("SOME VIDEO LINKS");

    }

    public LiveData<String> getText() {
        return mText;
    }
}