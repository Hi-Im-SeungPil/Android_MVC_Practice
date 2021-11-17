package org.jeonfeel.mvc_practice.Database;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class infoDTO {
    @PrimaryKey(autoGenerate = true)
    public int num;
    @NonNull
    public String name;
    @NonNull
    public String phoneNum;

    public infoDTO(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
