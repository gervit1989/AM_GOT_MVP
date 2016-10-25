package com.skillbranch.sb_got_mvp.mvp.views;

import com.skillbranch.sb_got_mvp.mvp.presenters.IMainPresenter;

public interface IMainView {
    /**
     * Показать сообщение
     * @param message сообщение
     */
    void showMessage(String message);

    /**
     * Показать ошибку
     * @param e - ошибка
     */
    void showError(Throwable e);

    /**
     * Заполнить итемы
     * @param items
     */
    //void setItems(List<HeroDTO> items);

    /**
     * Presenter
     * @return
     */
    IMainPresenter getPresenter();
}
