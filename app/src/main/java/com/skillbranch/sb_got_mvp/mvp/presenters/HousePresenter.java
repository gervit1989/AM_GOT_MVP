package com.skillbranch.sb_got_mvp.mvp.presenters;

import android.support.annotation.Nullable;

import com.skillbranch.sb_got_mvp.mvp.models.HouseModel;
import com.skillbranch.sb_got_mvp.mvp.views.IHouseView;

public class HousePresenter  implements IHousePresenter{

    /**
     * Паттерн синглтон
     */
    private static HousePresenter ourInstance = new HousePresenter();

    /**
     * Модель заполнения информации о списках пользователей
     */
    private HouseModel mHouseModel;

    /**
     * View  информации о списках пользователей
     */
    private IHouseView mHouseView;

    /**
     * Конструктор
     */
    public HousePresenter() {
        mHouseModel = new HouseModel();
    }

    /**
     * Возвращаем сами себя
     * @return
     */
    public static HousePresenter getInstance() {
        return ourInstance;
    }

    @Override
    public void takeView(IHouseView house_view) {
        mHouseView = house_view;
    }

    @Override
    public void dropView() {
        mHouseView = null;
    }

    @Override
    public void initView() {
        if (getView()!=null) {
        }
    }

    @Nullable
    @Override
    public IHouseView getView() {
        return mHouseView;
    }
}
