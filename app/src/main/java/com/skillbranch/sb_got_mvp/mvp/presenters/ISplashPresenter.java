package com.skillbranch.sb_got_mvp.mvp.presenters;

import android.support.annotation.Nullable;

import com.skillbranch.sb_got_mvp.mvp.views.ISplashView;

public interface ISplashPresenter {

    /**
     *  проинициализировать экземпляр View
     */
    void takeView(ISplashView splashView);

    /**
     *  отвязать  экземпляр View
     */
    void dropView();

    /**
     *  проинициализировать состояние View (onLoad)
     */
    void initView();

    @Nullable
    ISplashView getView();
}
