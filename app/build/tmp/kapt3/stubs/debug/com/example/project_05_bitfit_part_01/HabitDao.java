package com.example.project_05_bitfit_part_01;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\'J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/project_05_bitfit_part_01/HabitDao;", "", "deleteAll", "", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/project_05_bitfit_part_01/HabitEntity;", "insert", "habits", "insertAll", "app_debug"})
public abstract interface HabitDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM habit_table")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.project_05_bitfit_part_01.HabitEntity>> getAll();
    
    @androidx.room.Insert
    public abstract void insertAll(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.project_05_bitfit_part_01.HabitEntity> habits);
    
    @androidx.room.Insert
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.example.project_05_bitfit_part_01.HabitEntity habits);
    
    @androidx.room.Query(value = "DELETE FROM habit_table")
    public abstract void deleteAll();
}