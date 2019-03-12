package com.ahmadulilirfan.acakjodoh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    btn1.text = "Acak"
    btn1.setOnClickListener {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }
    btn1.setOnClickListener {
        kocokGambar()
    }
}

private fun kocokGambar() {
    val acakLaki = Random().nextInt(6) + 1
    val acakPrm = Random().nextInt(6)+1
    val drawableLaki = when (acakLaki) {
        1 -> R.drawable.iav
        2 -> R.drawable.adytya
        3 -> R.drawable.acong
        4 -> R.drawable.riki
        5 -> R.drawable.edi
        else -> R.drawable.odib
    }
    val drawablePerempuan = when (acakPrm) {
        1 -> R.drawable.hanum
        2 -> R.drawable.fuji
        3 -> R.drawable.umikhotimatuss
        4 -> R.drawable.ayulest
        5 -> R.drawable.mela
        else -> R.drawable.citra
    }
    cowo.setImageResource(drawableLaki)
    cewe.setImageResource(drawablePerempuan)
}
}