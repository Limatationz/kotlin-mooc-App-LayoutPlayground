package com.example.android.layoutplayground.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android.layoutplayground.databinding.VerticalFragmentBinding
import com.example.android.layoutplayground.getRandomColor

class VerticalFragment: Fragment() {

    private lateinit var binding: VerticalFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?{
        super.onCreate(savedInstanceState)
        binding = VerticalFragmentBinding.inflate(layoutInflater, container, false)

        binding.faerbenVerticalButton.setOnClickListener {
            binding.farbflaecheVerticalTextView.setBackgroundResource(getRandomColor())
        }

        binding.weiterVerticalButton.setOnClickListener {
            //val i = Intent(this, ConstraintFragment::class.java)
            //startActivity(i)
        }

        return binding.root
    }
}