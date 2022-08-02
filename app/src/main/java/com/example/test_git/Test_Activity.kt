package com.example.test_git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test_git.databinding.ActivityTestBinding

class Test_Activity : AppCompatActivity() {

    private lateinit var binding: ActivityTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTestBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}