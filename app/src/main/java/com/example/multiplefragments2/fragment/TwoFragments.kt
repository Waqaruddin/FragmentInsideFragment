package com.example.multiplefragments2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.multiplefragments2.R
import kotlinx.android.synthetic.main.fragment_two_fragments.view.*

class TwoFragments : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_two_fragments, container, false)



        view.button_add.setOnClickListener{
            childFragmentManager.beginTransaction()
                .add(R.id.fragment_container2, Threefragment()).commit()
        }


        return view
    }



}