package ru.mirea.chernenkovais.dialog;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;

import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends ProgressDialog {

    public MyProgressDialogFragment(Context context, int theme) {
        super(context, theme);
        this.setMessage("Loading..");
        this.setProgressStyle(STYLE_HORIZONTAL);
        this.setMax(100);
    }
}
