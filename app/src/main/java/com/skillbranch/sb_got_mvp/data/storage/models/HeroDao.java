package com.skillbranch.sb_got_mvp.data.storage.models;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "HEROES".
*/
public class HeroDao extends AbstractDao<Hero, Long> {

    public static final String TABLENAME = "HEROES";

    /**
     * Properties of entity Hero.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property RemoteId = new Property(1, String.class, "remoteId", false, "REMOTE_ID");
        public final static Property HouseName = new Property(2, String.class, "houseName", false, "HOUSE_NAME");
        public final static Property Name = new Property(3, String.class, "name", false, "NAME");
        public final static Property Born = new Property(4, String.class, "born", false, "BORN");
        public final static Property Died = new Property(5, String.class, "died", false, "DIED");
        public final static Property Titles = new Property(6, String.class, "titles", false, "TITLES");
        public final static Property Aliases = new Property(7, String.class, "aliases", false, "ALIASES");
        public final static Property Father = new Property(8, String.class, "father", false, "FATHER");
        public final static Property Mother = new Property(9, String.class, "mother", false, "MOTHER");
        public final static Property HouseWords = new Property(10, String.class, "houseWords", false, "HOUSE_WORDS");
    }

    private DaoSession daoSession;


    public HeroDao(DaoConfig config) {
        super(config);
    }
    
    public HeroDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"HEROES\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"REMOTE_ID\" TEXT NOT NULL UNIQUE ," + // 1: remoteId
                "\"HOUSE_NAME\" TEXT," + // 2: houseName
                "\"NAME\" TEXT," + // 3: name
                "\"BORN\" TEXT," + // 4: born
                "\"DIED\" TEXT," + // 5: died
                "\"TITLES\" TEXT," + // 6: titles
                "\"ALIASES\" TEXT," + // 7: aliases
                "\"FATHER\" TEXT," + // 8: father
                "\"MOTHER\" TEXT," + // 9: mother
                "\"HOUSE_WORDS\" TEXT);"); // 10: houseWords
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"HEROES\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Hero entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getRemoteId());
 
        String houseName = entity.getHouseName();
        if (houseName != null) {
            stmt.bindString(3, houseName);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
 
        String born = entity.getBorn();
        if (born != null) {
            stmt.bindString(5, born);
        }
 
        String died = entity.getDied();
        if (died != null) {
            stmt.bindString(6, died);
        }
 
        String titles = entity.getTitles();
        if (titles != null) {
            stmt.bindString(7, titles);
        }
 
        String aliases = entity.getAliases();
        if (aliases != null) {
            stmt.bindString(8, aliases);
        }
 
        String father = entity.getFather();
        if (father != null) {
            stmt.bindString(9, father);
        }
 
        String mother = entity.getMother();
        if (mother != null) {
            stmt.bindString(10, mother);
        }
 
        String houseWords = entity.getHouseWords();
        if (houseWords != null) {
            stmt.bindString(11, houseWords);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Hero entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getRemoteId());
 
        String houseName = entity.getHouseName();
        if (houseName != null) {
            stmt.bindString(3, houseName);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
 
        String born = entity.getBorn();
        if (born != null) {
            stmt.bindString(5, born);
        }
 
        String died = entity.getDied();
        if (died != null) {
            stmt.bindString(6, died);
        }
 
        String titles = entity.getTitles();
        if (titles != null) {
            stmt.bindString(7, titles);
        }
 
        String aliases = entity.getAliases();
        if (aliases != null) {
            stmt.bindString(8, aliases);
        }
 
        String father = entity.getFather();
        if (father != null) {
            stmt.bindString(9, father);
        }
 
        String mother = entity.getMother();
        if (mother != null) {
            stmt.bindString(10, mother);
        }
 
        String houseWords = entity.getHouseWords();
        if (houseWords != null) {
            stmt.bindString(11, houseWords);
        }
    }

    @Override
    protected final void attachEntity(Hero entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Hero readEntity(Cursor cursor, int offset) {
        Hero entity = new Hero( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // remoteId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // houseName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // name
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // born
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // died
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // titles
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // aliases
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // father
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // mother
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10) // houseWords
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Hero entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setRemoteId(cursor.getString(offset + 1));
        entity.setHouseName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setBorn(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDied(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setTitles(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setAliases(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setFather(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setMother(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setHouseWords(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Hero entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Hero entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Hero entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
