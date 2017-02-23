package com.ntuzer.reweldemo.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import com.ntuzer.reweldemo.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ntuzer on 2/15/2017.
 */

public class CustomDialog extends Dialog {
    @OnClick(R.id.dialog_ok)
    public void okClick(){
        listener.onClickListener();
    }

    private ICustomDialogEventListener listener;

    public interface ICustomDialogEventListener{
        public void onClickListener();
    }


    public CustomDialog(Context context, ICustomDialogEventListener listener) {
        super(context, R.style.dialog);
        this.listener = listener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_dialog);
        ButterKnife.bind(this);
    }

}
