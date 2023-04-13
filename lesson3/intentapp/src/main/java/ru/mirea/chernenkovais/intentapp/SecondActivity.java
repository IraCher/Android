package ru.mirea.chernenkovais.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            String value  = bundle.getString("time");
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText("Квадрат значения моего номера по списку составляет " + 25*25 + " а текущее время: "+ value);
        }
    }
}