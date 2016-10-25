package com.skillbranch.sb_got_mvp.mvp.views;

public interface IProfileView {
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
     * Presenter
     * @return
     */
    com.skillbranch.sb_got_mvp.mvp.presenters.IProfilePresenter getPresenter();

    /**
     * Показать Кнопку ОТЕЦ
     */
    void showFatherBtn();

    /**
     * Скрыть Кнопку ОТЕЦ
     */
    void hideFatherBtn();

    /**
     * Показать Кнопку МАТЬ
     */
    void showMotherBtn();

    /**
     * Скрыть Кнопку МАТЬ
     */
    void hideMotherBtn();

    /**
     * Установка тулбара
     */
    void setupToolBar();

    /**
     * Новая панель авторизации
     * @return
     */
    /*@Nullable
    AuthPanel getAuthPanel();*/

}
