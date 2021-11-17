package org.jeonfeel.mvc_practice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.jeonfeel.mvc_practice.Database.DB;

public class Activity_insert extends AppCompatActivity {

    EditText et_name;
    EditText et_phoneNum;
    Button btn_save;
    DB db;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //VIEW
        setContentView(R.layout.activity_insert);

        db = DB.getInstance(Activity_insert.this);
        FindViewById();

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //control
                String name = et_name.getText().toString();
                String phoneNum = et_phoneNum.getText().toString();
                db.infoDAO().insert(name,phoneNum);
                ((MainActivity)MainActivity.main_context).updateList();

                finish();
            }
        });
    }

    private void FindViewById(){
        et_name = findViewById(R.id.et_name);
        et_phoneNum = findViewById(R.id.et_phoneNum);
        btn_save = findViewById(R.id.btn_save);
    }
}
