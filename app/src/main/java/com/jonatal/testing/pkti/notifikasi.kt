package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_log_in.*
import kotlinx.android.synthetic.main.fragment_notifikasi.*

class notifikasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifikasi)

        setSupportActionBar(Notif_Toolbar)

        supportActionBar?.apply {

            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }
//    fun onDetail(view: View) {
//        var intentDetail = Intent(this, detailpesanan_user::class.java)
//        startActivity(intentDetail)
//    }
    fun onDetail(view: View) {
        var intentDetail = Intent(this, detailpesanan::class.java)
        startActivity(intentDetail)
    }

}