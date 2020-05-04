package com.android.Mymovie.view.detail;

import com.android.Mymovie.model.ShowDetails;
import com.android.Mymovie.repo.ShowRepository;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class ShowDetailViewModel extends AndroidViewModel
{
    private final ShowRepository mShowRepository;

    public ShowDetailViewModel(@NonNull Application application)
    {
        super(application);
        mShowRepository = ShowRepository.getInstance(application);
    }

    public LiveData<ShowDetails> getShowDetails(String imdbid){
        return  mShowRepository.getShowDetails(imdbid);
    }

}
