package com.example.dodo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;

@Dao
public interface CategoryDao {

    @Query("SELECT * FROM categories")
    Single<List<Note>> getNotes();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Completable add(Category category);

    @Query("DELETE FROM categories WHERE id = :id")
    Completable remove(int id);

    @Query("UPDATE categories SET text = :text WHERE id = :id")
    Completable updateCategory(long id, String text);
}
