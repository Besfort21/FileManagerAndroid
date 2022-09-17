package com.example.filemanager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.nio.file.Files;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder> {

    Context context;
    File[] filesAndFolders;

    public Adapter(Context context, File[] filesAndFolders){
        this.context = context;
        this.filesAndFolders = filesAndFolders;
    }


    @Override
    public Viewholder onCreateViewHolder( ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(Viewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class  Viewholder extends RecyclerView.ViewHolder{
        public  Viewholder(View itemView){
            super(itemView);
        }
    }
}
