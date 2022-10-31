package com.example.dodo;

import androidx.lifecycle.MutableLiveData;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "notes")
public class Note {

    @PrimaryKey (autoGenerate = true)
    private long id;
    private String title;
    private String description;
    private int priority;
    private MutableLiveData<Category> categories = new MutableLiveData<>();

    public Note(long id, String title, String description, int priority, MutableLiveData<Category> categories) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.categories = categories;
    }

    @Ignore
    public Note(String title, String description, int priority, MutableLiveData<Category> categories) {
        this(0, title, description, priority, categories);
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public MutableLiveData<Category> getCategories() {
        return categories;
    }
}
