package com.example.kenny.traveltracker;

import android.content.Context;
import android.database.Cursor;

/**
 * Created by Kenny on 2015-07-22.
 */
public class MemoriesLoader extends DbCursorLoader {

    MemoriesDataSource mDataSource;

    public MemoriesLoader(Context context, MemoriesDataSource memoriesDataSource){
        super(context);
        mDataSource = memoriesDataSource;
    }

    @Override
    protected Cursor loadCursor() {
        return mDataSource.allMemoriesCursor();
    }
}
