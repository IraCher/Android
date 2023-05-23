package ru.mirea.chernenkovais.looper;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import ru.mirea.chernenkovais.looper.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Handler mainThreadHandler	=	new	Handler(Looper.getMainLooper())	{
            @Override
            public	void	handleMessage(Message msg)	{
                Log.d(MainActivity.class.getSimpleName(),	"Task	execute.	This	is	result:	"	+	msg.getData().getString("result"));
            }
        };
        MyLooper	myLooper	=	new	MyLooper(mainThreadHandler);
        myLooper.start();
        binding.textViewCher.setText("Мой номер по списку №25");

        binding.buttonCher.setOnClickListener(new	View.OnClickListener()	{
            @Override
            public	void	onClick(View	v) {
                int ex = Integer.parseInt(String.valueOf(binding.editTextAgeCher.getText()));

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                    }
                }, ex);
                Log.d(MainActivity.class.getSimpleName(),	"Возраст: " + binding.editTextAgeCher.getText());
                Log.d(MainActivity.class.getSimpleName(),	"Работа: " + binding.editTextTextWorkCher.getText());
                Message	msg	=	Message.obtain();
                Bundle	bundle	=	new	Bundle();
                bundle.putString("KEY",	"mirea");
                msg.setData(bundle);
                myLooper.mHandler.sendMessage(msg);
            }
            });
    }
}