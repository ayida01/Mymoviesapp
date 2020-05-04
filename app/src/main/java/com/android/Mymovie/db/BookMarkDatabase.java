package com.android.Mymovie.db;

import com.android.Mymovie.model.ShowSearchDetails;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {ShowSearchDetails.class}, version = 1, exportSchema = false)
public abstract class BookMarkDatabase extends RoomDatabase
{
    public abstract BookmarkDao getDao();
}
