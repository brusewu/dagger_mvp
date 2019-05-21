package com.example.demo.dagger_mvp.module;

import com.example.demo.dagger_mvp.model.ICommonView;
import com.example.demo.dagger_mvp.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by bruse on 2019/5/21.
 */

@Module
public class CommonModule {
    private ICommonView iView;

    public CommonModule(ICommonView iView){
        this.iView = iView;
    }

    @Provides
    @ActivityScope
    public ICommonView provideIcommonView(){
        return this.iView;
    }

}
