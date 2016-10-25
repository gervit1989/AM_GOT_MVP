package com.skillbranch.sb_got_mvp.data.managers;

/**
 * Created by Zver on 25.10.2016.
 */

import android.content.SharedPreferences;

import com.skillbranch.sb_got_mvp.utils.ConstantManager;
import com.skillbranch.sb_got_mvp.utils.SkillBranchGOTApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, отвечающий за сохранение/загрузку пользовательских данных
 */
public class PreferencesManager {

    /**
     * доступ к значениям
     */
    private SharedPreferences mSharedPreferences;

    /**
     * Заголовки вкладок
     */
    private static final String[] USER_TAB_TITLES = {ConstantManager.USER_TAB_TITLE_ONE,
            ConstantManager.USER_TAB_TITLE_TWO,
            ConstantManager.USER_TAB_TITLE_THREE,
            ConstantManager.USER_TAB_TITLE_FOUR,
            ConstantManager.USER_TAB_TITLE_FIVE};
    /**
     * Рисунки вкладок
     */
    private static final String[] USER_TAB_LOGO = {ConstantManager.USER_TAB_LOGO_ONE,
            ConstantManager.USER_TAB_LOGO_TWO,
            ConstantManager.USER_TAB_LOGO_THREE,
            ConstantManager.USER_TAB_LOGO_FOUR,
            ConstantManager.USER_TAB_LOGO_FIVE};

    /**
     * Иконки вкладок
     */
    private static final String[] USER_TAB_ICONS = {ConstantManager.USER_TAB_ICON_ONE,
            ConstantManager.USER_TAB_ICON_TWO,
            ConstantManager.USER_TAB_ICON_THREE,
            ConstantManager.USER_TAB_ICON_FOUR,
            ConstantManager.USER_TAB_ICON_FIVE};

    /**
     * Конструктор
     */
    public PreferencesManager() {
        this.mSharedPreferences = SkillBranchGOTApplication.getSharedPreferences();
    }


    /**
     * Сохранение пользовательских даных - заголовки вкладок
     *
     * @param tabTitles
     */
    public void saveHouseNames(List<String> tabTitles) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();

        for (int i = 0; i < tabTitles.size(); i++) {
            if (i < USER_TAB_TITLES.length) {
                editor.putString(USER_TAB_TITLES[i], tabTitles.get(i));
            }
        }
        editor.apply();
    }

    /**
     * Загрузка пользовательских данных
     *
     * @return
     */
    public ArrayList<String> loadHouseNames() {
        ArrayList<String> userFields = new ArrayList<>();
        String s = mSharedPreferences.getString(ConstantManager.USER_TAB_TITLE_ONE, "null");
        if (!s.equals("null"))
            userFields.add(s);
        s = mSharedPreferences.getString(ConstantManager.USER_TAB_TITLE_TWO, "null");
        if (!s.equals("null"))
            userFields.add(s);
        s = mSharedPreferences.getString(ConstantManager.USER_TAB_TITLE_THREE, "null");
        if (!s.equals("null"))
            userFields.add(s);
        s = mSharedPreferences.getString(ConstantManager.USER_TAB_TITLE_FOUR, "null");
        if (!s.equals("null"))
            userFields.add(s);
        s = mSharedPreferences.getString(ConstantManager.USER_TAB_TITLE_FIVE, "null");
        if (!s.equals("null"))
            userFields.add(s);
        return userFields;
    }

    public void saveUserPicData(int[] imageArray) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();

        for (int i = 0; i < imageArray.length; i++) {
            if (i < USER_TAB_LOGO.length) {
                editor.putInt(USER_TAB_LOGO[i], imageArray[i]);
            }
        }
        editor.apply();
    }

    public int[] loadUserPicData() {
        ArrayList<Integer> userFields = new ArrayList<>();
        int iVal = mSharedPreferences.getInt(ConstantManager.USER_TAB_LOGO_ONE, -1);
        if (iVal >= 0)
            userFields.add(iVal);
        iVal = mSharedPreferences.getInt(ConstantManager.USER_TAB_LOGO_TWO, -1);
        if (iVal >= 0)
            userFields.add(iVal);
        iVal = mSharedPreferences.getInt(ConstantManager.USER_TAB_LOGO_THREE, -1);
        if (iVal >= 0)
            userFields.add(iVal);
        iVal = mSharedPreferences.getInt(ConstantManager.USER_TAB_LOGO_FOUR, -1);
        if (iVal >= 0)
            userFields.add(iVal);
        iVal = mSharedPreferences.getInt(ConstantManager.USER_TAB_LOGO_FIVE, -1);
        if (iVal >= 0)
            userFields.add(iVal);
        int[] userList = new int[userFields.size()];
        for (int i = 0; i < userFields.size(); i++) {
            userList[i] = userFields.get(i);
        }
        return userList;
    }

    public void saveUserIconData(int[] imageArray) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();

        for (int i = 0; i < imageArray.length; i++) {
            if (i < USER_TAB_ICONS.length) {
                editor.putInt(USER_TAB_ICONS[i], imageArray[i]);
            }
        }
        editor.apply();
    }

    public int[] loadUserIconData() {
        ArrayList<Integer> userFields = new ArrayList<>();
        int iVal = mSharedPreferences.getInt(ConstantManager.USER_TAB_ICON_ONE, -1);
        if (iVal >= 0)
            userFields.add(iVal);
        iVal = mSharedPreferences.getInt(ConstantManager.USER_TAB_ICON_TWO, -1);
        if (iVal >= 0)
            userFields.add(iVal);
        iVal = mSharedPreferences.getInt(ConstantManager.USER_TAB_ICON_THREE, -1);
        if (iVal >= 0)
            userFields.add(iVal);
        iVal = mSharedPreferences.getInt(ConstantManager.USER_TAB_ICON_FOUR, -1);
        if (iVal >= 0)
            userFields.add(iVal);
        iVal = mSharedPreferences.getInt(ConstantManager.USER_TAB_ICON_FIVE, -1);
        if (iVal >= 0)
            userFields.add(iVal);
        int[] userList = new int[userFields.size()];
        for (int i = 0; i < userFields.size(); i++) {
            userList[i] = userFields.get(i);
        }
        return userList;
    }
}
