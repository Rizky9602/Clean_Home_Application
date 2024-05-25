package com.muriz.clean_home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.MuRiz.clean_home.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomDialog : BottomSheetDialogFragment() {

    fun bottomDialog(){
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val getView = inflater.inflate(R.layout.bottom_dialog_layout,container,false)

        val procced = getView.findViewById<Button>(R.id.bottom_dialog_procced)
        val add = getView.findViewById<Button>(R.id.bottom_dialog_add)

        procced.setOnClickListener{

        }
        add.setOnClickListener{

        }

        return getView
    }
}