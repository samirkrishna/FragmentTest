package com.example.chsamirkrishna.fragmenttest

import android.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fManager=fragmentManager
        var tx=fManager.beginTransaction()
        tx.add(R.id.frag1,Home())
        tx.commit()
    }

    fun load(v:View)
    { var fManager=fragmentManager
        var tx=fManager.beginTransaction()
        if (v.id ==R.id.home) {
            tx.replace(R.id.frag1, Home())
        } else if (v.id == R.id.courses)
        {
            tx.replace(R.id.frag1,Course())
        }
        else if (v.id == R.id.material)
        {
            tx.replace(R.id.frag1,Material())
        }
        tx.addToBackStack("true")
        tx.commit()
    }
}
