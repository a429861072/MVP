package com.lanou.xyfgift.mvpdemo1.model;

import com.lanou.xyfgift.mvpdemo1.presenter.ThePresenter;

/**
 * Created by xuxiaoshuai on 2017/2/16.
 */


//  这是模型类
//  处理业务逻辑,  获取数据 网络请求 逻辑判断啊!
public class TheModel {
    //  P是调度者, 来到model调度数据的返回;
    private ThePresenter P;

    public TheModel(ThePresenter p) {
        this.P = p;
    }


    //  model 处理数据;

    public void createString() {
        String resultStr = "经过复杂处理生成的一句话";
        //  将数据传回给P;

        P.setResultStr(resultStr);
    }

    //  activity 要显示的内容
    //  M和P协作产生的  会将处理部分放在m中;

//    MVP的最终目的 :
    //  就是让activity轻量化 ;
    //  保证最终肯会在有东西到达activity 显示;
//  注 : 在企业中这些招人烦的操作就是为了便于维护和修改;
}
