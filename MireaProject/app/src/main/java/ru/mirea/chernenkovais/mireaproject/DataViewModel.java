package ru.mirea.chernenkovais.mireaproject;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DataViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DataViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Искусственный интеллект (ИИ) — технология, позволяющая системе, машине или компьютеру выполнять задачи, требующие разумного мышления, то есть имитировать поведение человека для постепенного обучения с использованием полученной информации и решения конкретных вопросов.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
