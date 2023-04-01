package ru.mirea.chernenkovais.mulriactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multy);
    }

    public void browserButton(View view) {
        Uri address=Uri.parse("https://www.mirea.ru/");
        Intent openLinkIntent=new Intent(Intent.ACTION_VIEW,address);
        startActivity(openLinkIntent);
    }

    public void sendButton(View view) {
        Intent sendIntent=new Intent((Intent.ACTION_SEND));
        sendIntent.setType("text/plain");
        sendIntent.putExtra(Intent.EXTRA_SUBJECT,"MIREA");
        sendIntent.putExtra(Intent.EXTRA_TEXT,"ФАМИЛИЯ ИМЯ ОТЧЕСТВО");
        startActivity(Intent.createChooser(sendIntent,"ЧЕРНЕНЬКОВА ИРИНА СЕРГЕЕВНА"));
    }
}