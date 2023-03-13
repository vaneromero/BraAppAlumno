package com.bp.braappalumno

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_menu_inv.*
import kotlinx.android.synthetic.main.activity_option.*
import spencerstudios.com.bungeelib.Bungee

class MenuInv : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_inv)

        BtnT.setOnClickListener {
            startActivity(Intent(this,Lector1::class.java))
            Bungee.zoom(this)
        }
        BtnH.setOnClickListener {
            startActivity(Intent(this,Historia::class.java))
            Bungee.zoom(this)
        }
        BtnJ.setOnClickListener {
            startActivity(Intent(this,Juegos::class.java))
            Bungee.zoom(this)
        }
        OpcionesMenu.setOnClickListener {
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
    override fun onBackPressed() {
        moveTaskToBack(true)
    }
}