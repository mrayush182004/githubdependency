package com.example.toast_ho_ja

import android.content.Context
import android.widget.Toast

class ToastMessage {

    companion object {

        fun printToastMessage(context: Context?, message: String?) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }


    }
}

