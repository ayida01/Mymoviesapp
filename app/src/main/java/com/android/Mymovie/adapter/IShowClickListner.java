package com.android.Mymovie.adapter;

import com.android.Mymovie.model.ShowSearchDetails;

public interface IShowClickListner
{
    void onShowClick(ShowSearchDetails showDetails);
    void onSaveBookMark(ShowSearchDetails showDetails);
    void onDeleteBookMark(ShowSearchDetails showDetails);
}
