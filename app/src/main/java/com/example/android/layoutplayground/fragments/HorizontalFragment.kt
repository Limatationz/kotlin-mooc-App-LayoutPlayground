package com.example.android.layoutplayground.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android.layoutplayground.databinding.HorizontalFragmentBinding
import com.example.android.layoutplayground.getRandomColor

class HorizontalFragment: Fragment() {

    private lateinit var binding: HorizontalFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?{
        super.onCreate(savedInstanceState)
        binding = HorizontalFragmentBinding.inflate(layoutInflater, container, false)


        binding.faerbenHorizontalButton.setOnClickListener {
            binding.farbflaecheHorizontalTextView.setBackgroundResource(getRandomColor())
        }

        binding.weiterHorizontalButton.setOnClickListener {
            //val i = Intent(this, VerticalFragment::class.java)
            //startActivity(i)
        }

        return binding.root
    }
}