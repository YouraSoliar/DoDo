package com.example.dodo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class AddNoteActivity extends AppCompatActivity {

    private TextView editTextTitle;
    private TextView editTextDescription;
    private RadioButton radioButtonLow;
    private RadioButton radioButtonMedium;
    private RadioButton radioButtonHigh;
    private TextView textViewCategory;
    private TextView textViewRepeat;
    private TextView textViewSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        initView();
        initAction();
    }

    private void initView() {
        this.editTextTitle = findViewById(R.id.editTextTitle);
        this.editTextDescription = findViewById(R.id.editTextDescription);
        this.radioButtonLow = findViewById(R.id.radioButtonLow);
        this.radioButtonMedium = findViewById(R.id.radioButtonMedium);
        this.radioButtonHigh = findViewById(R.id.radioButtonHigh);
        this.textViewCategory = findViewById(R.id.textViewCategory);
        this.textViewRepeat = findViewById(R.id.textViewRepeat);
        this.textViewSave = findViewById(R.id.textViewSave);
    }

    private void initAction() {
        textViewSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNote();
            }
        });
    }

    private void saveNote() {
        String title = editTextTitle.getText().toString().trim();
        String description = editTextDescription.getText().toString().trim();
        int priority = 2;
        if (radioButtonLow.isChecked()) {
            priority = 0;
        }
        if (radioButtonMedium.isChecked()) {
            priority = 1;
        }
        if (!title.equals("")) {


        } else {
            Toast.makeText(this, "fill the title", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static Intent newIntent(Context context) {
        return new Intent(context, AddNoteActivity.class);
    }
}