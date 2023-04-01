package ru.mirea.chernenkovais.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String TAGsec=SecondActivity.class.getSimpleName();
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            String value=bundle.getString("secondActivity");
            Log.i(TAGsec,"value: "+value);
            text=findViewById(R.id.textView2);
            text.setText(value);
        }
    }
}