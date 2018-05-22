package com.example.chsamirkrishna.fragmenttest

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class Home : Fragment(){

    var bt1:Button?=null
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        var v=inflater?.inflate(R.layout.homefrag,container,false)
        bt1=v?.findViewById(R.id.b1)
       bt1?.setOnClickListener(object : View.OnClickListener {
           override fun onClick(v: View?) {

               var fManager=fragmentManager
               var tx=fManager.beginTransaction()
               tx.replace(R.id.frag1,Course())
               tx.addToBackStack("true")
               tx.commit()
               Toast.makeText(getActivity(),"Don't click me",Toast.LENGTH_SHORT).show()
           }
       })
        return v!!
    }
}