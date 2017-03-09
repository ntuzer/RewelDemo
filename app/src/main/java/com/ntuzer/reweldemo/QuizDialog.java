package com.ntuzer.reweldemo;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.RadioGroup;

import com.ntuzer.reweldemo.dialog.CustomDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ntuzer on 3/8/2017.
 */

public class QuizDialog extends Dialog {


    public static int checkedID;
    private final int DIALOG = 12345;


    @BindView(R.id.quiz_rdg2)
    RadioGroup radioGroup;
    @OnClick(R.id.quiz_ok2)
    public void okClick(){
        switch (checkedID){
            case R.id.quiz2_rb1:
                optionButton2();
                break;
            case R.id.quiz2_rb2:
                optionButton3();
                break;
            default:
        }
    }

    private void optionButton2() {
    }

    private void optionButton3() {
        
    }


//    @OnClick(R.id.quiz_cancel2)
//    public void cancelClick(){
//        listener.onClickListener();
//    }


    private ICustomDialogEventListener listener;


    public interface ICustomDialogEventListener{
        public void onClickListener();
    }


    public QuizDialog(Context context, ICustomDialogEventListener listener) {
        super(context, R.style.dialog);
        this.listener = listener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_dialog);
        ButterKnife.bind(this);
    }

}

