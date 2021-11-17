package org.jeonfeel.mvc_practice.Database;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface infoDAO {

    @Query("SELECT * FROM infoDTO")
    List<infoDTO> getAll();

    @Query("SELECT * FROM infoDTO ORDER BY num DESC LIMIT 1")
    infoDTO getLast();

    @Query("INSERT INTO infoDTO values(null,:name,:phoneNum)")
    void insert(String name, String phoneNum);



}