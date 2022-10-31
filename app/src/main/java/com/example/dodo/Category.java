package com.example.dodo;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "categories")
public class Category {

    @PrimaryKey (autoGenerate = true)
    private double id;
    private String text;

    public Category(double id, String text) {
        this.id = id;
        this.text = text;
    }

    @Ignore
    public Category(String text) {
        this(0, text);
    }

    public double getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
