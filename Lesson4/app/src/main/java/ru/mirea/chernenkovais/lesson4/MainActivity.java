package ru.mirea.chernenkovais.lesson4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import ru.mirea.chernenkovais.lesson4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding	=	ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}