package com.skillbranch.sb_got_mvp.mvp.presenters;

import android.support.annotation.Nullable;

import com.skillbranch.sb_got_mvp.mvp.views.IProfileView;

public interface IProfilePresenter {

    /**
     *  проинициализировать экземпляр View
     */
    void takeView(IProfileView profileView);

    /**
     *  отвязать  экземпляр View
     */
    void dropView();

    /**
     *  проинициализировать состояние View (onLoad)
     */
    void initView();

    @Nullable
    IProfileView getView();

    /**
     * обработка щелчка на кнопку "Отец"
     */
    void clickOnFather();

    /**
     * обработка щелчка на кнопку "Мать"
     */
    void clickOnMother();
}
