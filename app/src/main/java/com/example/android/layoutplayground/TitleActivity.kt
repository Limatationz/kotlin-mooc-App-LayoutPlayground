package com.example.android.layoutplayground

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.layoutplayground.databinding.TitleActivityBinding

class TitleActivity: AppCompatActivity() {

    private lateinit var binding: TitleActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = TitleActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.playButton.setOnClickListener {
            val i = Intent(this, MainAcitivity::class.java)
            startActivity(i)
        }
    }
}