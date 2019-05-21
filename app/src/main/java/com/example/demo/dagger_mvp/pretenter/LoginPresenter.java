package com.example.demo.dagger_mvp.pretenter;

import android.content.Context;
import android.widget.Toast;

import com.example.demo.dagger_mvp.model.ICommonView;
import com.example.demo.dagger_mvp.model.User;



import javax.inject.Inject;

/**
 * Created by bruse on 2019/5/21.
 */

public class LoginPresenter {

    ICommonView iView;

    @Inject
    public LoginPresenter(ICommonView iView){
        this.iView = iView;
    }

    public void login(User user){
        Context mContext = iView.getContext();
        Toast.makeText(mContext,"login .......",Toast.LENGTH_SHORT).show();
    }
}
