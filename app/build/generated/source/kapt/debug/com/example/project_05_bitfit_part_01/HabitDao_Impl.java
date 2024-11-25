package com.example.project_05_bitfit_part_01;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HabitDao_Impl implements HabitDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<HabitEntity> __insertionAdapterOfHabitEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public HabitDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHabitEntity = new EntityInsertionAdapter<HabitEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `habit_table` (`id`,`habitName`,`habitValue`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HabitEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getHabitName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getHabitName());
        }
        if (value.getHabitValue() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getHabitValue());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM habit_table";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final List<HabitEntity> habits) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHabitEntity.insert(habits);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final HabitEntity habits) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHabitEntity.insert(habits);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public Flow<List<HabitEntity>> getAll() {
    final String _sql = "SELECT * FROM habit_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"habit_table"}, new Callable<List<HabitEntity>>() {
      @Override
      public List<HabitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfHabitName = CursorUtil.getColumnIndexOrThrow(_cursor, "habitName");
          final int _cursorIndexOfHabitValue = CursorUtil.getColumnIndexOrThrow(_cursor, "habitValue");
          final List<HabitEntity> _result = new ArrayList<HabitEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final HabitEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpHabitName;
            if (_cursor.isNull(_cursorIndexOfHabitName)) {
              _tmpHabitName = null;
            } else {
              _tmpHabitName = _cursor.getString(_cursorIndexOfHabitName);
            }
            final String _tmpHabitValue;
            if (_cursor.isNull(_cursorIndexOfHabitValue)) {
              _tmpHabitValue = null;
            } else {
              _tmpHabitValue = _cursor.getString(_cursorIndexOfHabitValue);
            }
            _item = new HabitEntity(_tmpId,_tmpHabitName,_tmpHabitValue);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
