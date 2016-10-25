package com.skillbranch.sb_got_mvp.mvp.presenters;

import android.support.annotation.Nullable;

import com.skillbranch.sb_got_mvp.mvp.models.SplashModel;
import com.skillbranch.sb_got_mvp.mvp.views.ISplashView;


public class SplashPresenter implements ISplashPresenter{

    /**
     * Паттерн синглтон
     */
    private static SplashPresenter ourInstance = new SplashPresenter();

    /**
     * Модель заполнения информации о списках пользователей
     */
    private SplashModel mSplashModel;

    /**
     * View  информации о списках пользователей
     */
    private ISplashView mSplashView;

    /**
     * Конструктор
     */
    public SplashPresenter() {
        mSplashModel = new SplashModel();
    }

    /**
     * Возвращаем сами себя
     * @return
     */
    public static SplashPresenter getInstance() {
        return ourInstance;
    }

    @Override
    public void takeView(ISplashView splashView) {
        mSplashView = splashView;
    }

    @Override
    public void dropView() {
        mSplashView = null;
    }

    @Override
    public void initView() {
        if (getView()!=null) {
        }
    }

    @Nullable
    @Override
    public ISplashView getView() {
        return mSplashView;
    }
}
