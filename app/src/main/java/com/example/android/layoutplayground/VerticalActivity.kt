package com.example.android.layoutplayground

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.layoutplayground.databinding.VerticalActivityBinding

class VerticalActivity: AppCompatActivity() {

    private lateinit var binding: VerticalActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = VerticalActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.faerbenVerticalButton.setOnClickListener {
            binding.farbflaecheVerticalTextView.setBackgroundResource(getRandomColor())
        }

        binding.weiterVerticalButton.setOnClickListener {
            val i = Intent(this, ConstraintActivity::class.java)
            startActivity(i)
        }
    }
}