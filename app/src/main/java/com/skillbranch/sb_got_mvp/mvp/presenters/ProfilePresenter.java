package com.skillbranch.sb_got_mvp.mvp.presenters;

import android.support.annotation.Nullable;

import com.skillbranch.sb_got_mvp.mvp.models.ProfileModel;
import com.skillbranch.sb_got_mvp.mvp.views.IProfileView;

public class ProfilePresenter implements IProfilePresenter {

    /**
     * Паттерн синглтон
     */
    private static ProfilePresenter ourInstance = new ProfilePresenter();

    /**
     * Модель заполнения информации о пользователе
     */
    private ProfileModel mHeroProfileModel;

    /**
     * View  информации о пользователе
     */
    private IProfileView mHeroProfileView;


    /**
     * Конструктор
     */
    public ProfilePresenter() {
        mHeroProfileModel = new ProfileModel();
    }

    /**
     * Возвращаем сами себя
     * @return
     */
    public static ProfilePresenter getInstance() {
        return ourInstance;
    }

    @Override
    public void takeView(IProfileView profileView) {
        mHeroProfileView = profileView;
    }

    @Override
    public void dropView() {
        mHeroProfileView = null;
    }

    @Override
    public void initView() {
        if (getView()!=null) {
        }
    }

    @Nullable
    @Override
    public IProfileView getView() {
        return mHeroProfileView;
    }

    @Override
    public void clickOnFather() {
        getView().showMessage("Click on Father");
    }

    @Override
    public void clickOnMother() {
        getView().showMessage("Click on Mother");

    }
}
