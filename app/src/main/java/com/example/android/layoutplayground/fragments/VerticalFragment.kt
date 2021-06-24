package com.example.android.layoutplayground.fragments

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.layoutplayground.databinding.VerticalFragmentBinding
import com.example.android.layoutplayground.getRandomColor

class VerticalFragment: AppCompatActivity() {

    private lateinit var binding: VerticalFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = VerticalFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.faerbenVerticalButton.setOnClickListener {
            binding.farbflaecheVerticalTextView.setBackgroundResource(getRandomColor())
        }

        binding.weiterVerticalButton.setOnClickListener {
            val i = Intent(this, ConstraintFragment::class.java)
            startActivity(i)
        }
    }
}