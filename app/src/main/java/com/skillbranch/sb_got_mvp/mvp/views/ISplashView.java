package com.skillbranch.sb_got_mvp.mvp.views;

import com.skillbranch.sb_got_mvp.mvp.presenters.ISplashPresenter;

public interface ISplashView {
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
     * Показать загрузку
     */
    void showLoad();

    /**
     * Скрыть загрузку
     */
    void hideLoad();

    /**
     * Отложенный запуск Activity
     */
    void runActivity();

    /**
     * Presenter
     * @return
     */
    ISplashPresenter getPresenter();

}
