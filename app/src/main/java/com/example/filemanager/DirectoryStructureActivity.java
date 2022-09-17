package com.example.filemanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.File;

public class DirectoryStructureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory_structure);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        TextView noFilesText = findViewById(R.id.noFilesTextView);

        String path = getIntent().getStringExtra("path");

        File root = new File(path);
        File[] directoryStructure = root.listFiles();

        if(directoryStructure == null || directoryStructure.length == 0){
            noFilesText.setVisibility(View.VISIBLE);
            return;
        }

        noFilesText.setVisibility(View.INVISIBLE);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(getApplicationContext(),directoryStructure));
    }
}