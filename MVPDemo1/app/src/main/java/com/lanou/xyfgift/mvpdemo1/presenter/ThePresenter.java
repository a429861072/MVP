package com.lanou.xyfgift.mvpdemo1.presenter;

import com.lanou.xyfgift.mvpdemo1.MainActivity;
import com.lanou.xyfgift.mvpdemo1.model.TheModel;

import java.lang.reflect.Modifier;

/**
 * Created by xuxiaoshuai on 2017/2/16.
 */

public class ThePresenter {

    private MainActivity view;
    private TheModel model;

    public ThePresenter(MainActivity view) {
        this.view = view;
        model = new TheModel(ThePresenter.this);
    }


    //  定义方法 接受model传来的数据 ;

    public void setResultStr(String str) {

        //  将数据返回给view;
        //  将view的对象定义在p的类里;
        //  去view的类中定义接受方法;
//        注 :  view 就是activity;

        view.setResultStr(str);

    }

    public void start() {
        // p接到了view的请求 ; 说 : view弟弟 你放心  哥这就给你办;
//        在P的类中 定义model对象  并实例化
        //  调用model类中的处理方法  开始处理

        model.createString();
    }


}
