package com.skillbranch.sb_got_mvp.mvp.presenters;

import android.support.annotation.Nullable;

import com.skillbranch.sb_got_mvp.mvp.views.IHouseView;

/**
 * Created by Zver on 25.10.2016.
 */

public interface IHousePresenter {

    /**
     *  проинициализировать экземпляр View
     */
    void takeView(IHouseView house_view);

    /**
     *  отвязать  экземпляр View
     */
    void dropView();

    /**
     *  проинициализировать состояние View (onLoad)
     */
    void initView();

    @Nullable
    IHouseView getView();
}
