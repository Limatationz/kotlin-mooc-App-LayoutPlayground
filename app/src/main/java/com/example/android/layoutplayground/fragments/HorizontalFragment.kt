package com.example.android.layoutplayground.fragments

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.layoutplayground.databinding.HorizontalFragmentBinding
import com.example.android.layoutplayground.getRandomColor

class HorizontalFragment: AppCompatActivity() {

    private lateinit var binding: HorizontalFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HorizontalFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.faerbenHorizontalButton.setOnClickListener {
            binding.farbflaecheHorizontalTextView.setBackgroundResource(getRandomColor())
        }

        binding.weiterHorizontalButton.setOnClickListener {
            val i = Intent(this, VerticalFragment::class.java)
            startActivity(i)
        }
    }
}