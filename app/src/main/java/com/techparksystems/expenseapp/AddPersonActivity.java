package com.techparksystems.expenseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.techparksystems.expenseapp.databinding.ActivityAddPersonBinding;

public class AddPersonActivity extends AppCompatActivity {

    ActivityAddPersonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =  ActivityAddPersonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}