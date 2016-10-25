package com.skillbranch.sb_got_mvp.mvp.presenters;

import android.support.annotation.Nullable;

import com.skillbranch.sb_got_mvp.mvp.views.IMainView;

public interface IMainPresenter {

    /**
     *  проинициализировать экземпляр View
     */
    void takeView(IMainView hero_list_view);

    /**
     *  отвязать  экземпляр View
     */
    void dropView();

    /**
     *  проинициализировать состояние View (onLoad)
     */
    void initView();

    @Nullable
    IMainView getView();

    /**
     * обработка щелчка на элемент списка
     */
    void clickOnItem();
}
