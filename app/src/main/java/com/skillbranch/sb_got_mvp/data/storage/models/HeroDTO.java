package com.skillbranch.sb_got_mvp.data.storage.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.skillbranch.sb_got_mvp.R;

/**
 * Класс для сохранения данных героев
 */
public class HeroDTO implements Parcelable {

    /**
     * Имя
     */
    private String name;

    /**
     * Родился
     */
    private String born;

    /**
     * Умер
     */
    private String died;

    /**
     * Звания
     */
    private String titles;

    /**
     * Прозвища
     */
    private String aliases;

    /**
     * Имя дома
     */
    private String houseName;

    /**
     * Имя отца
     */
    private String father;

    /**
     * Имя матери
     */
    private String mother;

    /**
     * Девиз дома
     */
    private String houseWords;

    /**
     * Конструктор
     * @param heroData преобразуем из героев СТАРК
     */
    public HeroDTO(Hero heroData) {
        if (heroData.getHouseName().equals(R.string.other_house_name)){
            mother = null;
            father = null;
        }
        else {
            mother = heroData.getMother();
            father = heroData.getFather();
        }
        name = heroData.getName();
        houseName = heroData.getHouseName();
        houseWords = heroData.getHouseWords();
        aliases = heroData.getAliases();
        born = heroData.getBorn();
        died = heroData.getDied();
        titles = heroData.getTitles();
    }

    /**
     * Конструктор из сохраненного
     * @param in - сохраненное состояние
     */
    protected HeroDTO(Parcel in) {
        name = in.readString();
        houseName = in.readString();
        houseWords = in.readString();
        aliases = in.readString();
        born = in.readString();
        died = in.readString();
        titles = in.readString();
        father = in.readString();
        mother = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(houseName);
        dest.writeString(houseWords);
        dest.writeString(born);
        dest.writeString(died);
        dest.writeString(aliases);
        dest.writeString(titles);
        dest.writeString(father);
        dest.writeString(mother);
    }

    public static final Parcelable.Creator<HeroDTO> CREATOR = new Parcelable.Creator<HeroDTO>() {
        @Override
        public HeroDTO createFromParcel(Parcel in) {
            return new HeroDTO(in);
        }

        @Override
        public HeroDTO[] newArray(int size) {
            return new HeroDTO[size];
        }
    };


    public String getName() {
        return name;
    }

    public String getBorn() {
        return born;
    }

    public String getDied() {
        return died;
    }

    public String getTitles() {
        return titles;
    }

    public String getAliases() {
        return aliases;
    }

    public String getHouseName() {
        return houseName;
    }

    public String getFather() {
        return father;
    }

    public String getMother() {
        return mother;
    }

    public String getHouseWords() {
        return houseWords;
    }
}

