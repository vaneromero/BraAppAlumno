package com.bp.braappalumno

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_menu_adivinanzas.*
import kotlinx.android.synthetic.main.activity_option.*
import kotlinx.android.synthetic.main.toast.*
import kotlinx.android.synthetic.main.toast.view.*
import spencerstudios.com.bungeelib.Bungee

class Menu_Adivinanzas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_adivinanzas)
        facil.setOnClickListener {
            startActivity(Intent(this, AdivFacil::class.java))
            toast("Eligio el nivel Facil")
            Bungee.zoom(this)
        }
        dificil.setOnClickListener {
            startActivity(Intent(this,AdivDificil::class.java))
            toast("Eligio el nivel Dificil")
            Bungee.zoom(this)
        }
        OpcionesMenu2.setOnClickListener {
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
    }
    private fun toast(s: String) {
        val customLayout = layoutInflater.inflate(R.layout.toast, toast23)
        val toast = Toast(this)
        toast.duration = Toast.LENGTH_SHORT
        toast.setGravity(Gravity.TOP or Gravity.RIGHT, 0, 0)
        toast.view = customLayout
        customLayout.toastT.text = s
        toast.show()
    }
    override fun onBackPressed() {

        startActivity(Intent(this,Juegos::class.java))
        Bungee.zoom(this)
    }
}