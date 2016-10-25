package com.skillbranch.sb_got_mvp.data.storage.models;

import com.skillbranch.sb_got_mvp.data.network.res.HeroModelResponse;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

@Entity(active = true, nameInDb = "HEROES")
public class Hero {

    @Id
    private Long id;

    @NotNull
    @Unique
    private String remoteId;

    private String houseName;
    private String name;
    private String born;
    private String died;
    private String titles;
    private String aliases;
    private String father;
    private String mother;
    private String houseWords;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 1116008907)
    private transient HeroDao myDao;

    public Hero(HeroModelResponse swornMemberModelRes, String remoteId, String house_words) {
        this.remoteId = remoteId;
        this.name = swornMemberModelRes.getName();
        this.born = swornMemberModelRes.getBorn();
        this.died = swornMemberModelRes.getDied();
        titles = "";
        for (int i = 0; i < swornMemberModelRes.getTitles().size(); i++) {
            if(i!=swornMemberModelRes.getTitles().size()-1) {
                titles = titles + swornMemberModelRes.getTitles().get(i) + ",\n";
            }else {
                titles = titles + swornMemberModelRes.getTitles().get(i);
            }
        }
        aliases = "";
        for (int i = 0; i < swornMemberModelRes.getAliases().size(); i++) {
            if(i!=swornMemberModelRes.getAliases().size()-1) {
                aliases = aliases + swornMemberModelRes.getAliases().get(i) + ",\n";
            }else {
                aliases = aliases + swornMemberModelRes.getAliases().get(i);
            }
        }
        this.father = swornMemberModelRes.getFather();
        this.mother = swornMemberModelRes.getMother();
        this.houseWords = house_words;
    }

    @Generated(hash = 721449079)
    public Hero(Long id, @NotNull String remoteId, String houseName, String name, String born,
            String died, String titles, String aliases, String father, String mother,
            String houseWords) {
        this.id = id;
        this.remoteId = remoteId;
        this.houseName = houseName;
        this.name = name;
        this.born = born;
        this.died = died;
        this.titles = titles;
        this.aliases = aliases;
        this.father = father;
        this.mother = mother;
        this.houseWords = houseWords;
    }

    @Generated(hash = 2034257870)
    public Hero() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRemoteId() {
        return this.remoteId;
    }

    public void setRemoteId(String remoteId) {
        this.remoteId = remoteId;
    }

    public String getHouseName() {
        return this.houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBorn() {
        return this.born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getDied() {
        return this.died;
    }

    public void setDied(String died) {
        this.died = died;
    }

    public String getTitles() {
        return this.titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public String getAliases() {
        return this.aliases;
    }

    public void setAliases(String aliases) {
        this.aliases = aliases;
    }

    public String getFather() {
        return this.father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return this.mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getHouseWords() {
        return this.houseWords;
    }

    public void setHouseWords(String houseWords) {
        this.houseWords = houseWords;
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 570399849)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getHeroDao() : null;
    }
}
