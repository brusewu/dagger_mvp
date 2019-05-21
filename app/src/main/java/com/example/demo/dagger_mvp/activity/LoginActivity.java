package com.example.demo.dagger_mvp.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.demo.dagger_mvp.R;
import com.example.demo.dagger_mvp.compnotent.DaggerCommonCompnent;
import com.example.demo.dagger_mvp.model.ICommonView;
import com.example.demo.dagger_mvp.model.User;
import com.example.demo.dagger_mvp.module.CommonModule;
import com.example.demo.dagger_mvp.pretenter.LoginPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by wuxiaolong on 2019/5/21.
 */

public class LoginActivity extends AppCompatActivity implements ICommonView{

    @BindView(R.id.btn_login)
    Button btn;
    @Inject
    LoginPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        DaggerCommonCompnent.builder().
                commonModule(new CommonModule(this)).
                build().Inject(this);


    }

    @OnClick(R.id.btn_login) void login(){
        presenter.login(new User());
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }

    @Override
    public Context getContext(){
        return this;
    }

}
