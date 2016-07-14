package com.cailutong.app.zlot;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.cailutong.app.zlot.RegularSettleInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "REGULAR_SETTLE_INFO".
*/
public class RegularSettleInfoDao extends AbstractDao<RegularSettleInfo, Void> {

    public static final String TABLENAME = "REGULAR_SETTLE_INFO";

    /**
     * Properties of entity RegularSettleInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Periods = new Property(0, Integer.class, "periods", false, "PERIODS");
        public final static Property CcpId = new Property(1, String.class, "ccpId", false, "CCP_ID");
        public final static Property CcpName = new Property(2, String.class, "ccpName", false, "CCP_NAME");
        public final static Property SubTime = new Property(3, String.class, "subTime", false, "SUB_TIME");
        public final static Property YearYieldRate = new Property(4, Double.class, "yearYieldRate", false, "YEAR_YIELD_RATE");
        public final static Property YieldRate = new Property(5, Double.class, "yieldRate", false, "YIELD_RATE");
        public final static Property Amount = new Property(6, Double.class, "amount", false, "AMOUNT");
        public final static Property TotalInterest = new Property(7, Double.class, "totalInterest", false, "TOTAL_INTEREST");
        public final static Property LastReturnTime = new Property(8, String.class, "lastReturnTime", false, "LAST_RETURN_TIME");
        public final static Property Type = new Property(9, Integer.class, "type", false, "TYPE");
    };


    public RegularSettleInfoDao(DaoConfig config) {
        super(config);
    }
    
    public RegularSettleInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"REGULAR_SETTLE_INFO\" (" + //
                "\"PERIODS\" INTEGER," + // 0: periods
                "\"CCP_ID\" TEXT," + // 1: ccpId
                "\"CCP_NAME\" TEXT," + // 2: ccpName
                "\"SUB_TIME\" TEXT," + // 3: subTime
                "\"YEAR_YIELD_RATE\" REAL," + // 4: yearYieldRate
                "\"YIELD_RATE\" REAL," + // 5: yieldRate
                "\"AMOUNT\" REAL," + // 6: amount
                "\"TOTAL_INTEREST\" REAL," + // 7: totalInterest
                "\"LAST_RETURN_TIME\" TEXT," + // 8: lastReturnTime
                "\"TYPE\" INTEGER);"); // 9: type
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"REGULAR_SETTLE_INFO\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, RegularSettleInfo entity) {
        stmt.clearBindings();
 
        Integer periods = entity.getPeriods();
        if (periods != null) {
            stmt.bindLong(1, periods);
        }
 
        String ccpId = entity.getCcpId();
        if (ccpId != null) {
            stmt.bindString(2, ccpId);
        }
 
        String ccpName = entity.getCcpName();
        if (ccpName != null) {
            stmt.bindString(3, ccpName);
        }
 
        String subTime = entity.getSubTime();
        if (subTime != null) {
            stmt.bindString(4, subTime);
        }
 
        Double yearYieldRate = entity.getYearYieldRate();
        if (yearYieldRate != null) {
            stmt.bindDouble(5, yearYieldRate);
        }
 
        Double yieldRate = entity.getYieldRate();
        if (yieldRate != null) {
            stmt.bindDouble(6, yieldRate);
        }
 
        Double amount = entity.getAmount();
        if (amount != null) {
            stmt.bindDouble(7, amount);
        }
 
        Double totalInterest = entity.getTotalInterest();
        if (totalInterest != null) {
            stmt.bindDouble(8, totalInterest);
        }
 
        String lastReturnTime = entity.getLastReturnTime();
        if (lastReturnTime != null) {
            stmt.bindString(9, lastReturnTime);
        }
 
        Integer type = entity.getType();
        if (type != null) {
            stmt.bindLong(10, type);
        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    /** @inheritdoc */
    @Override
    public RegularSettleInfo readEntity(Cursor cursor, int offset) {
        RegularSettleInfo entity = new RegularSettleInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // periods
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // ccpId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // ccpName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // subTime
            cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4), // yearYieldRate
            cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5), // yieldRate
            cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6), // amount
            cursor.isNull(offset + 7) ? null : cursor.getDouble(offset + 7), // totalInterest
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // lastReturnTime
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9) // type
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, RegularSettleInfo entity, int offset) {
        entity.setPeriods(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setCcpId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCcpName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSubTime(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setYearYieldRate(cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4));
        entity.setYieldRate(cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5));
        entity.setAmount(cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6));
        entity.setTotalInterest(cursor.isNull(offset + 7) ? null : cursor.getDouble(offset + 7));
        entity.setLastReturnTime(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setType(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(RegularSettleInfo entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    /** @inheritdoc */
    @Override
    public Void getKey(RegularSettleInfo entity) {
        return null;
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
