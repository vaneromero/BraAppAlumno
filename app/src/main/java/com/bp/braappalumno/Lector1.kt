package com.bp.braappalumno

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Toast
import com.bp.braappalumno.databinding.ActivityLector1Binding
import com.google.zxing.integration.android.IntentIntegrator
import kotlinx.android.synthetic.main.activity_option.*
import kotlinx.android.synthetic.main.toast.*
import kotlinx.android.synthetic.main.toast.view.*
import spencerstudios.com.bungeelib.Bungee
class Lector1 : AppCompatActivity() {
    private  lateinit var binding: ActivityLector1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lector1)
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)
        binding = ActivityLector1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    binding.OpcionesLector1.setOnClickListener {
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
        binding.btnScan.setOnClickListener {

            scanearqr()
        }
    }
    fun scanearqr(){
        val integretor= IntentIntegrator(this)
        integretor.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE)
        integretor.setBeepEnabled(true)
        integretor.setPrompt("Enfoque al codigo qr")
        integretor.initiateScan()
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
        if (result != null) {
            if (result.contents == null) {
                toast("Cancelado")
            } else {

                val dato = result.contents
                if (dato == "a") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "b") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "c") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "d") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "e") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "f") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "g") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "h") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "i") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "j") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "k") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "l") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "m") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "n") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "ñ") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "o") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "p") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "q") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "r") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "s") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "t") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "u") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "v") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "w") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "x") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "y") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "z") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "ÿ") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "á") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "ä") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "í") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "é") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "ö") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "ó") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")

                } else if (dato == "ú") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "ü") {
                    binding.tarjetaBase8.setText(dato)
                } else if (dato == "A") {

                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "B") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "C") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "D") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "E") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "F") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")

                } else if (dato == "G") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "H") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "I") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "J") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "K") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "L") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "M") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "N") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "Ñ") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "O") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "P") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "Q") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "R") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "S") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "T") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "U") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "V") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "W") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "X") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "Y") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "Z") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "Ÿ") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "Á") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "Ä") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "Í") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "É") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "Ö") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "Ó") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "Ú") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "Ü") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == ".") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == ",") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == ";") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == ":") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "¡!") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "=") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "¿?") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "(") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == ")") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "*") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "»") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "@") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "_") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "/") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "|") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "^") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "#") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "Ç") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "[") {
                    binding.tarjetaBase8.setText(dato)
                   toast("$dato")
                } else if (dato == "]") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "x") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "÷") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "+") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "-") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "1") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "2") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "3") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "4") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "5") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "6") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "7") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "8") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "9") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else if (dato == "0") {
                    binding.tarjetaBase8.setText(dato)
                    toast("$dato")
                } else {
                    binding.tarjetaBase8.setText("\uD83D\uDEAB")
                    toast("Error Codigo QR no valido")
                }
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data)
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
        startActivity(Intent(applicationContext, MenuInv::class.java))
        Bungee.zoom(this)
    }
}