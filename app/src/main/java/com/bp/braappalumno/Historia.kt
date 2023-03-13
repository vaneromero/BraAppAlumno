package com.bp.braappalumno

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_historia.*
import kotlinx.android.synthetic.main.activity_option.*
import spencerstudios.com.bungeelib.Bungee

class Historia : AppCompatActivity() {

    var mp: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historia)
        Creditossf.visibility= View.GONE
        Creditossdf.visibility= View.VISIBLE
        OpcionesHistoria1.setOnClickListener {
            destruir()
            val customDialog = Dialog(this)
            customDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            customDialog.setContentView(R.layout.activity_option)
            customDialog.window?.setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            customDialog.BtnH1.setOnClickListener {
                startActivity(Intent(applicationContext, Historia::class.java))
                Bungee.zoom(this)
            }
            customDialog.BtnJ1.setOnClickListener {
                startActivity(Intent(applicationContext, Juegos::class.java))
                Bungee.zoom(this)
            }
            customDialog.BtnT1.setOnClickListener {
                startActivity(Intent(applicationContext, Lector1::class.java))
                Bungee.zoom(this)
            }
            customDialog.BtnM1.setOnClickListener {
                startActivity(Intent(applicationContext, MenuInv::class.java))
                Bungee.zoom(this)
            }

            customDialog.show()
        }
        mp = MediaPlayer.create(this, R.raw.synthesize)
        playpause.setOnClickListener {
            if (mp!!.isPlaying) {
                mp!!.pause()
                playpause.setBackgroundResource(R.drawable.tocar)
                playpause.text="Reproducir"
                Creditossf.visibility= View.GONE
                Creditossdf.visibility= View.VISIBLE
            } else {
                mp!!.start()
                playpause.setBackgroundResource(R.drawable.pausa)
                playpause.text="Pause"

                Creditossf.visibility= View.VISIBLE
                Creditossdf.visibility= View.GONE
            }
        }
    }
    override fun onBackPressed() {
        destruir()
        startActivity(Intent(this,MenuInv::class.java))
        Bungee.zoom(this)
    }
    fun destruir() {
        if (mp != null) mp!!.release()
    }
}