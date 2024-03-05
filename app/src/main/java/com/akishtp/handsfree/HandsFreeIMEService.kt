package com.akishtp.handsfree

import android.inputmethodservice.InputMethodService
import android.view.View
import android.widget.LinearLayout

class HandsFreeIMEService :InputMethodService(){
    override fun onCreateInputView(): View {
        getPermissions()
        val layout = layoutInflater.inflate(R.layout.keyboard_layout, null) as LinearLayout

        return layout
    }

    private fun getPermissions() {

    }
}