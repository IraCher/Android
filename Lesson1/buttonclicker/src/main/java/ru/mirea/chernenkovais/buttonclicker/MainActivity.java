package ru.mirea.chernenkovais.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private Button who;
    private Button notme;
    private CheckBox check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.tvOut);
        who=findViewById((R.id.btnWhoAmI));
        notme=findViewById(R.id.btnItIsNotMe);
        check=findViewById((R.id.checkBox));
        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Мой номер по списку №25");
                check.setChecked(true);
            }
        };
        who.setOnClickListener(oclBtnWhoAmI);
    }

    public void notMe(View view) {
        text.setText("Это не я");
        check.setChecked(false);
    }
}