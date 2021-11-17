package org.jeonfeel.mvc_practice.Database;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import kotlin.jvm.Synchronized;

@Database(entities = {infoDTO.class},version = 1)
public abstract class DB extends RoomDatabase {

    public abstract infoDAO infoDAO();

    private static DB instance;

    private static final Object sLock = new Object();

    @Synchronized
    public static DB getInstance(Context context){
        synchronized (sLock){
            if (instance == null){
                instance = Room.databaseBuilder(context.getApplicationContext(),
                        DB.class,
                        "DB")
                        .fallbackToDestructiveMigration()
                        .allowMainThreadQueries()
                        .build();
            }
            return instance;
        }
    }

}
