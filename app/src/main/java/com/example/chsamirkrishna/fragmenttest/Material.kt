package com.example.chsamirkrishna.fragmenttest

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Material : Fragment(){
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        var v=inflater?.inflate(R.layout.materialfrag,container,false)

        return v!!
    }
}