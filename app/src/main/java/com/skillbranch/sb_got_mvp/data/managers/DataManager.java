package com.skillbranch.sb_got_mvp.data.managers;

import android.content.Context;

import com.skillbranch.sb_got_mvp.data.network.PicassoCache;
import com.skillbranch.sb_got_mvp.data.network.RestService;
import com.skillbranch.sb_got_mvp.data.network.ServiceGenerator;
import com.skillbranch.sb_got_mvp.data.network.res.HeroModelResponse;
import com.skillbranch.sb_got_mvp.data.network.res.HouseModelResponse;
import com.skillbranch.sb_got_mvp.data.storage.models.DaoSession;
import com.skillbranch.sb_got_mvp.data.storage.models.Hero;
import com.skillbranch.sb_got_mvp.data.storage.models.HeroDao;
import com.skillbranch.sb_got_mvp.utils.ConstantManager;
import com.skillbranch.sb_got_mvp.utils.SkillBranchGOTApplication;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

public class DataManager {

    /**
     * Отслеживание
     */
    private static final String TAG = ConstantManager.TAG_PREFIX + "DataManager";

    /**
     * Графика
     */
    private Picasso mPicasso;

    /**
     * Экземпляр класса
     */
    private static DataManager INSTANCE = null;

    /**
     * Доступ к пользовательским значениям
     */
    private PreferencesManager mPreferencesManager;

    /**
     * Контекст приложения
     */
    private Context mContext;
    /**
     * Сессия Dao
     */
    private DaoSession mDaoSession;

    /**
     * Соединение с сетью
     */
    private RestService mRestService;

    /**
     * Конструктор
     */
    public DataManager() {
        //- Сохранение настроек приложения
        this.mPreferencesManager = new PreferencesManager();

        //- Контекст приложения
        this.mContext = SkillBranchGOTApplication.getContext();

        //- Шаблоны передачи данных
        this.mRestService = ServiceGenerator.createService(RestService.class);

        //- Сессия Dao
        this.mDaoSession = SkillBranchGOTApplication.getDaoSession();

        //- Настройка Picasso для локального хранения
        this.mPicasso = new PicassoCache(this.mContext).getPicassoInstance();
    }


    /**
     * Получение единственного экземпляра
     * @return Менеджер
     */
    public static DataManager getINSTANCE(){
        if (INSTANCE==null){
            INSTANCE = new DataManager();
        }
        return  INSTANCE;
    }

    /**
     * Доступ к пользовательским значениям
     * @return Менеджер пользовательских значений
     */
    public PreferencesManager getPreferencesManager() {
        return mPreferencesManager;
    }

    /**
     * Доступ к Picasso
     * @return возвращает Picasso
     */
    public Picasso getPicasso() {
        return mPicasso;
    }


    //region ========================= Network =========================
    /**
     * Получить список пользователей
     * @return список пользователей
     */
    ///*
    public Call<HeroModelResponse> getHeroFromNetwork(String s) {

        return mRestService.getHero(s);
    }

    /**
     * Получить список пользователей
     * @return список пользователей
     */
    ///*
    public Call<HouseModelResponse> getHouseFromNetwork(String s) {

        return mRestService.getHouse(s);
    }
    //endregion
    //*/



    //region ========================= Data Base =========================
    /**
     * Получить список героев из БД
     * @param sHouseName
     * @return список героев из БД
     */
    ///*
    public List<Hero> getHeroListFromDb(String sHouseName) {
        List<Hero> heroList = new ArrayList<>();
        try{
            heroList = mDaoSession.queryBuilder(Hero.class)
                    .where(HeroDao.Properties.HouseName.like(sHouseName))
                    .build()
                    .list();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return heroList;
    }

    /**
     * Получаем информацию о герое с ID из нужного дома
     * @param sHouseName имя дома
     * @param sID - ID героя в базе
     * @return информацию о герое
     */
    ///*
    public Hero getHeroFromDbByID(  String sHouseName, String sID ){
        List<Hero> heroList = new ArrayList<>();
        try{
            heroList = mDaoSession.queryBuilder(Hero.class)
                    .where(HeroDao.Properties.HouseName.like(sHouseName), HeroDao.Properties.RemoteId.like(sID))
                    .build()
                    .list();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return heroList.get(0);
    }

    /**
     * Получаем информацию о герое с ID из нужного дома
     * @param sID - ID героя в базе
     * @return информацию о герое
     */
    ///*
    public Hero getHeroFromDbByID(  String sID ){
        List<Hero> heroList = new ArrayList<>();
        try{
            heroList = mDaoSession.queryBuilder(Hero.class)
                    .where(HeroDao.Properties.RemoteId.like(sID))
                    .build()
                    .list();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return heroList.get(0);
    }

    /**
     * Сессия Dao
     */
    ///*
    public DaoSession getDaoSession() {
        return mDaoSession;
    }
    //endregion
    //*/
}
