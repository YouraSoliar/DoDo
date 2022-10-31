package com.example.dodo;

import androidx.lifecycle.MutableLiveData;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "notes")
public class Note {

    @PrimaryKey (autoGenerate = true)
    private long id;
    private String text;
    private int priority;
    private MutableLiveData<Category> categories = new MutableLiveData<>();

    public Note(long id, String text, int priority, MutableLiveData<Category> categories) {
        this.id = id;
        this.text = text;
        this.priority = priority;
        this.categories = categories;
    }

    @Ignore
    public Note(String text, int priority, MutableLiveData<Category> categories) {
        this(0, text, priority, categories);
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getPriority() {
        return priority;
    }

    public MutableLiveData<Category> getCategories() {
        return categories;
    }
}
