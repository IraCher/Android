package ru.mirea.chernenkovais.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {
    public EditText Editmy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        Editmy = findViewById(R.id.editTextTextPersonName);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView ageView = findViewById(R.id.textView2);
            String university = extras.getString(MainActivity.KEY);
            ageView.setText(String.format("Мой любимая книга: %s", university));
        }
    }

    public void click(View view) {
        String text = String.valueOf(Editmy.getText());
        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE, text);
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}