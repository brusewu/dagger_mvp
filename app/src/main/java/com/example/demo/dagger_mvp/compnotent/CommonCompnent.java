package com.example.demo.dagger_mvp.compnotent;

import com.example.demo.dagger_mvp.activity.LoginActivity;
import com.example.demo.dagger_mvp.module.CommonModule;
import com.example.demo.dagger_mvp.scope.ActivityScope;

import dagger.Component;

/**
 * Created by bruse on 2019/5/21.
 */

@ActivityScope
@Component(modules = CommonModule.class)
public interface CommonCompnent {
    void Inject(LoginActivity activity);
}
