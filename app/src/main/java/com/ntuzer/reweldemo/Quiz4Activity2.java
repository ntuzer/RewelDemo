package com.ntuzer.reweldemo;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.ntuzer.reweldemo.dialog.CustomDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Quiz4Activity2 extends BaseActivity {

    public static int checkedID;
    private final int DIALOG = 12345;

    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case DIALOG:
                    Bundle bundle = msg.getData();
                    String s = bundle.getString("msg");
                    toastShort("Dialog message: " + s);
                    //toastShort("");
                    break;
                default:
            }


            super.handleMessage(msg);
        }
    };

    @BindView(R.id.quiz_rdg)
    RadioGroup radioGroup;
    @OnClick(R.id.quiz_ok)
    public void okClick(){
        switch (checkedID){
            case R.id.quiz_rb1:
                optionButton2();
                //toActivity(DialogActivity.class);
                break;
            case R.id.quiz_rb2:
                optionButton3();
                //toActivity(ListViewActivity.class);
                break;
            default:
        }
    }

    private CustomDialog.ICustomDialogEventListener listener;

    @OnClick(R.id.quiz_cancel)
    public void cancelClick(){
        //open viewpageractivity
        //toActivity(ViewPagerActivity.class);

        final CustomDialog  dialog = new CustomDialog(this, new CustomDialog.ICustomDialogEventListener() {
            @Override
            public void onClickListener() {
                Intent intent = new Intent();
                intent.putExtra("message","ViewPager");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

    private void optionButton3() {

        final CustomDialog  dialog = new CustomDialog(this, new CustomDialog.ICustomDialogEventListener() {
            @Override
            public void onClickListener() {
                Intent intent = new Intent();
                intent.putExtra("message","ViewPager");
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }

    private void optionButton2() {

        final CustomDialog  dialog = new CustomDialog(this, new CustomDialog.ICustomDialogEventListener() {
            @Override
            public void onClickListener() {
                Intent intent = new Intent();
                intent.putExtra("message","ViewPager");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);

        ButterKnife.bind(this);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {
                DialogActivity.checkedID = checkedID;
                toastShort("You checked the RadioButton"+checkedID);
            }
        });
    }
}
