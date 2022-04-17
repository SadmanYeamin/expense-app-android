package com.techparksystems.expenseapp.adapters;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.techparksystems.expenseapp.models.Person;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Person> courseRVModalArrayList;
    private Context context;
    private PersonClickInterface personClickInterface;
    private int lastPos = -1;


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public interface  PersonClickInterface{
        void onCourseClick(int position);
    }
}
