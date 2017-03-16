package com.lanou.xyfgift.mvpdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lanou.xyfgift.mvpdemo1.presenter.ThePresenter;

public class MainActivity extends AppCompatActivity {
    private ThePresenter P;
    private TextView textView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        P = new ThePresenter(MainActivity.this);

        textView = (TextView) findViewById(R.id.text1);
        button = (Button) findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  通过MVP完成 ;

//                 向P发出请求
                //  要求索取数据 ;

                P.start();
 
            }
        });

    }

    public void setResultStr(String str) {
        textView.setText(str);

    }
}
