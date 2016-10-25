package com.skillbranch.sb_got_mvp.mvp.presenters;

import android.support.annotation.Nullable;

import com.skillbranch.sb_got_mvp.mvp.models.MainModel;
import com.skillbranch.sb_got_mvp.mvp.views.IMainView;

public class MainPresenter implements IMainPresenter{

    /**
     * Паттерн синглтон
     */
    private static MainPresenter ourInstance = new MainPresenter();

    /**
     * Модель заполнения информации о списках пользователей
     */
    private com.skillbranch.sb_got_mvp.mvp.models.MainModel mMainModel;

    /**
     * View  информации о списках пользователей
     */
    private IMainView mHeroListView;

    /**
     * Конструктор
     */
    public MainPresenter() {
        mMainModel = new MainModel();
    }

    /**
     * Возвращаем сами себя
     * @return
     */
    public static MainPresenter getInstance() {
        return ourInstance;
    }

    @Override
    public void takeView(IMainView hero_list_view) {
        mHeroListView = hero_list_view;
    }

    @Override
    public void dropView() {
        mHeroListView = null;
    }

    @Override
    public void initView() {
        if (getView()!=null) {
        }
    }

    @Nullable
    @Override
    public IMainView getView() {
        return mHeroListView;
    }

    @Override
    public void clickOnItem() {

    }
}
