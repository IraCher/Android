package ru.mirea.chernenkovais.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editTextTextPersonName);
    }

    public void toastClick(View view) {
        String num=editText.getText().toString();
        Toast toast = Toast.makeText(getApplicationContext(),
                "«СТУДЕНТ №25 ГРУППА БСБО-06-21 Количество символов - "+num+"!",
                Toast.LENGTH_SHORT);
        toast.show();
    }
}