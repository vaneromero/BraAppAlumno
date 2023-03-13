package com.bp.braappalumno.adiv

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bp.braappalumno.*
import kotlinx.android.synthetic.main.activity_adivinanza3.*
import kotlinx.android.synthetic.main.activity_option.*
import kotlinx.android.synthetic.main.instrucciones_bra_esp1.*
import kotlinx.android.synthetic.main.toast.*
import kotlinx.android.synthetic.main.toast.view.*
import spencerstudios.com.bungeelib.Bungee


class adivinanza3 : AppCompatActivity() {
    var noUno1 = 0
    var noDos1 = 0
    var noTres1 = 0
    var noCuatro1 = 0
    var noCinco1 = 0
    var noSeis1 = 0
    var cadena3 = ""
    var noUno2 = 0
    var noDos2 = 0
    var noTres2 = 0
    var noCuatro2 = 0
    var noCinco2 = 0
    var noSeis2 = 0
    var cadena4 = ""
    var marcador=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adivinanza3)
        var tex="En el centro de la pantalla encontraras 2 bloques de 6 botones los cuales seleccionaras para formar numeros en Braille"
        alerta(tex)
        asignacion()
        btnuno3.setOnClickListener {
            noUno1 += 1
            if (noUno1 == 1) {
                noUno1 = 1
                btnuno3.setBackgroundDrawable(resources.getDrawable(R.drawable.on))
                toast("Boton 1 para el prefijo seleccionado")

            } else {
                noUno1 = 0
                btnuno3.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
                toast("Boton 1 para el prefijo deseleccionado")
            }
        }
        btndos3.setOnClickListener {
            noDos1 += 1
            if (noDos1 == 1) {
                noDos1 = 1
                btndos3.setBackgroundDrawable(resources.getDrawable(R.drawable.on))
                toast("Boton 2 para el prefijo seleccionado")

            } else {
                noDos1 = 0
                btndos3.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
                toast("Boton 2 para el prefijo deseleccionado")
            }
        }
        btntres3.setOnClickListener {
            noTres1 += 1
            if (noTres1 == 1) {
                noTres1 = 1
                btntres3.setBackgroundDrawable(resources.getDrawable(R.drawable.on))
                toast("Boton 3 para el prefijo seleccionado")
            } else {
                noTres1 = 0
                btntres3.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
                toast("Boton 3 para el prefijo deseleccionado")
            }
        }
        btncuatro3.setOnClickListener {
            noCuatro1 += 1
            if (noCuatro1 == 1) {
                noCuatro1 = 1
                btncuatro3.setBackgroundDrawable(resources.getDrawable(R.drawable.on))
                toast("Boton 4 para el prefijo seleccionado")
            } else {
                noCuatro1 = 0
                btncuatro3.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
                toast("Boton 4 para el prefijo deseleccionado")
            }
        }
        btncinco3.setOnClickListener {
            noCinco1 += 1
            if (noCinco1 == 1) {
                noCinco1 = 1
                btncinco3.setBackgroundDrawable(resources.getDrawable(R.drawable.on))
                toast("Boton 5 para el prefijo seleccionado")
            } else {
                noCinco1 = 0
                btncinco3.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
                toast("Boton 5 para el prefijo deseleccionado")
            }
        }
        btnseis3.setOnClickListener {
            noSeis1 += 1
            if (noSeis1 == 1) {
                noSeis1 = 1
                btnseis3.setBackgroundDrawable(resources.getDrawable(R.drawable.on))
                toast("Boton 6 para el prefijo seleccionado")
            } else {
                noSeis1 = 0
                btnseis3.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
                toast("Boton 6 para el prefijo deseleccionado")
            }
        }

        btnuno2.setOnClickListener {
            noUno2 += 1
            if (noUno2 == 1) {
                noUno2 = 1
                btnuno2.setBackgroundDrawable(resources.getDrawable(R.drawable.on))
                toast("Boton 1 seleccionado")
            } else {
                noUno2 = 0
                btnuno2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
                toast("Boton 1 deseleccionado")
            }
        }
        btndos2.setOnClickListener {
            noDos2 += 1
            if (noDos2 == 1) {
                noDos2 = 1
                btndos2.setBackgroundDrawable(resources.getDrawable(R.drawable.on))
                toast("Boton 2 seleccionado")
            } else {
                noDos2 = 0
                btndos2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
                toast("Boton 2 deseleccionado")
            }
        }
        btntres2.setOnClickListener {
            noTres2 += 1
            if (noTres2 == 1) {
                noTres2 = 1
                btntres2.setBackgroundDrawable(resources.getDrawable(R.drawable.on))
                toast("Boton 3 seleccionado")
            } else {
                noTres2 = 0
                btntres2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
                toast("Boton 3 deseleccionado")
            }
        }
        btncuatro2.setOnClickListener {
            noCuatro2 += 1
            if (noCuatro2 == 1) {
                noCuatro2 = 1
                btncuatro2.setBackgroundDrawable(resources.getDrawable(R.drawable.on))
                toast("Boton 4 seleccionado")
            } else {
                noCuatro2 = 0
                btncuatro2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
                toast("Boton 4 deseleccionado")
            }
        }
        btncinco2.setOnClickListener {
            noCinco2 += 1
            if (noCinco2 == 1) {
                noCinco2 = 1
                btncinco2.setBackgroundDrawable(resources.getDrawable(R.drawable.on))
                toast("Boton 5 seleccionado")
            } else {
                noCinco2 = 0
                btncinco2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
                toast("Boton 5 deseleccionado")
            }
        }
        btnseis2.setOnClickListener {
            noSeis2 += 1
            if (noSeis2== 1) {
                noSeis2 = 1
                btnseis2.setBackgroundDrawable(resources.getDrawable(R.drawable.on))
                toast("Boton 6 seleccionado")
            } else {
                noSeis2 = 0
                btnseis2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
                toast("Boton 6 deseleccionado")
            }
        }
        verificar4.setOnClickListener {
            if (noUno1 == 1) {
                cadena3 += "1"
            }
            if (noDos1 == 1) {
                cadena3 += "2"
            }
            if (noTres1 == 1) {
                cadena3 += "3"
            }
            if (noCuatro1 == 1) {
                cadena3 += "4"
            }
            if (noCinco1 == 1) {
                cadena3+= "5"
            }
            if (noSeis1 == 1) {
                cadena3 += "6"
            }
            if (noUno2 == 1) {
                cadena4 += "1"
            }
            if (noDos2 == 1) {
                cadena4 += "2"
            }
            if (noTres2 == 1) {
                cadena4 += "3"
            }
            if (noCuatro2 == 1) {
                cadena4 += "4"
            }
            if (noCinco2 == 1) {
                cadena4 += "5"
            }
            if (noSeis2 == 1) {
                cadena4 += "6"
            }
            val p=imagen.getTag().toString()
            val l=imagen2.getTag().toString()
            if (cadena3=="3456" && cadena4=="1") {
                comparacion(cadena3,cadena4,p,l)
                cadena3=""
                cadena4=""
            } else if (cadena3=="3456" && cadena4 == "12") {
                comparacion(cadena3,cadena4,p,l)
                cadena3=""
                cadena4=""
            } else if (cadena3=="3456" && cadena4== "14") {
                comparacion(cadena3,cadena4,p,l)
                cadena3=""
                cadena4=""
            } else if (cadena3=="3456" && cadena4== "145") {
                comparacion(cadena3,cadena4,p,l)
                cadena3=""
                cadena4=""
            } else if (cadena3=="3456" && cadena4 == "15") {
                comparacion(cadena3,cadena4,p,l)
                cadena3=""
                cadena4=""
            } else if (cadena3=="3456" && cadena4 == "124") {
                comparacion(cadena3,cadena4,p,l)
                cadena3=""
                cadena4=""
            } else if (cadena3=="3456" && cadena4 == "1245") {
                comparacion(cadena3,cadena4,p,l)
                cadena3=""
                cadena4=""
            } else if (cadena3=="3456" && cadena4 == "125") {
                comparacion(cadena3,cadena4,p,l)
                cadena3=""
                cadena4=""
            } else if (cadena3=="3456" && cadena4== "24") {
                comparacion(cadena3,cadena4,p,l)
                cadena3=""
                cadena4=""
            } else if (cadena3=="3456" && cadena4 == "245") {
                comparacion(cadena3,cadena4,p,l)
                cadena3=""
                cadena4=""
            }
            else if (cadena3=="" || cadena4 == ""){
                comparacion(cadena3,cadena4,p,l)
                cadena3=""
                cadena4=""
            }
            else {
                comparacion(cadena3,cadena4,p,l)
                cadena3=""
                cadena4=""
            }
        }
        reiniciar4.setOnClickListener { asignacion()
            limpiar() }
OpcionesJuegos46.setOnClickListener {
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
    fun asignacion(){
        val numero=(1..10).random()
        numero+1
        if(numero==1){
            imagen.setBackgroundResource(R.drawable.numeros1)
            imagen2.setBackgroundResource(R.drawable.a)
            adivinanza.text="Un agricultor tiene tres montones de paja en el pajar y cuatro en el prado. Si los junta ¿cuántos montones tiene?."
            imagen2.setTag("1")
            imagen.setTag("3456")
            cadena2.setText("${imagen.tag}")
        }
        else if(numero==2){
            imagen2.setBackgroundResource(R.drawable.b)
            imagen.setBackgroundResource(R.drawable.numeros1)
            adivinanza.text="Tengo forma de patito, soy arqueado y redondito. ¿Quién soy?."
            imagen2.setTag("12")
            imagen.setTag("3456")
            cadena2.setText("${imagen.tag}")
        }
        else if(numero==3){
            imagen2.setBackgroundResource(R.drawable.c)
            imagen.setBackgroundResource(R.drawable.numeros1)
            adivinanza.text="En una pecera 2 peces van delante de un pez, 2 peces van detrás de un pez, y un pez entre dos peces, ¿Cuántos peces hay?."
            imagen2.setTag("14")
            imagen.setTag("3456")
            cadena2.setText("${imagen.tag}")
        }
        else if(numero==4){
            imagen2.setBackgroundResource(R.drawable.d)
            imagen.setBackgroundResource(R.drawable.numeros1)
            adivinanza.text="Soy como una escalerita o como un hombre sentado, y cuando se habla de patas, soy las que tienen los bancos. ¿Qué seré?"
            imagen2.setTag("145")
            imagen.setTag("3456")
            cadena2.setText("${imagen.tag}")
        }
        else if(numero==5){
            imagen2.setBackgroundResource(R.drawable.e)
            imagen.setBackgroundResource(R.drawable.numeros1)
            adivinanza.text="¿Qué número tiene tantas letras en su nombre como lo indica el valor de su cifra?."
            imagen2.setTag("15")
            imagen.setTag("3456")
            cadena2.setText("${imagen.tag}")
        }
        else if(numero==6){
            imagen2.setBackgroundResource(R.drawable.f)
            imagen.setBackgroundResource(R.drawable.numeros1)
            adivinanza.text="Este era un número impar, pero un día la vuelta se dio bocabajo se quedó y en un numero par se convirtió. ¿Qué seré?"
            imagen2.setTag("124")
            imagen.setTag("3456")
            cadena2.setText("${imagen.tag}")

        }
        else if(numero==7){
            imagen2.setBackgroundResource(R.drawable.g)
            imagen.setBackgroundResource(R.drawable.numeros1)
            adivinanza.text="Si quieres saber qué número soy, espera a que llueva. Contando los colores del arcoíris tendrás la prueba. ¿Qué seré?"
            imagen2.setTag("1245")
            imagen.setTag("3456")
            cadena2.setText("${imagen.tag}")

        }
        else if(numero==8){
            imagen2.setBackgroundResource(R.drawable.h)
            imagen.setBackgroundResource(R.drawable.numeros1)
            adivinanza.text="Un caracol se cayó en un pozo de 11 metros, cada día sube 3 metros y al dormirse baja 2 ¿En cuántos días saldrá el caracol del pozo?."
            imagen2.setTag("125")
            imagen.setTag("3456")
            cadena2.setText("${imagen.tag}")

        }
        else if(numero==9){
            imagen2.setBackgroundResource(R.drawable.i)
            imagen.setBackgroundResource(R.drawable.numeros1)
            adivinanza.text="¿Cuál es el número que si lo pones de manos vale menos?. ¿Qué seré?"
            imagen2.setTag("24")
            imagen.setTag("3456")
            cadena2.setText("${imagen.tag}")
        }
        else if(numero==10){
            imagen2.setBackgroundResource(R.drawable.j)
            imagen.setBackgroundResource(R.drawable.numeros1)
            adivinanza.text="Redondo soy y es cosa anunciada que a la derecha algo valgo, pero a la izquierda nada. ¿Qué seré?"
            imagen2.setTag("245")
            imagen.setTag("3456")
            cadena2.setText("${imagen.tag}")
        }
    }
    fun comparacion(dato1: String,dato2: String,p:String,l:String){
        Log.v("prueba"," escribi $dato1 definido $p")
        Log.v("prueba"," escribi $dato2 definido $l")
        if (dato1==p && dato2==l){
            marcador=marcador+10
            limpiar()
            asignacion()
            limpiar()
            pts3.text= "Puntaje: "+marcador.toString()
            toast("Es correcto")
        }else if ((dato1!=p && dato2!=l)||(dato1==p && dato2!=l)||(dato1!=p && dato2==l)){
            if (marcador>0){
                marcador=marcador-2
                if (marcador<0){
                    marcador=0
                }
            }
            pts3.text= "Puntaje: "+marcador.toString()
            toast("Es incorrecto")
            limpiar()
        }else if (dato1.isEmpty() || dato2.isEmpty()||p.isEmpty()||l.isEmpty()){
            if (marcador>0){
                marcador=marcador-2
                if (marcador<0){
                    marcador=0
                }

            }
            pts3.text= "Puntaje: "+marcador.toString()
            toast("Es incorrecto")
            limpiar()
        }
    }
    fun limpiar() {
        btnuno2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
        btndos2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
        btntres2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
        btncuatro2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
        btncinco2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
        btnseis2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
        btnuno3.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
        btndos3.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
        btntres3.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
        btncuatro3.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
        btncinco3.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
        btnseis3.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
        noUno1 = 0
        noDos1 = 0
        noTres1 = 0
        noCuatro1 = 0
        noCinco1 = 0
        noSeis1 = 0
        cadena3 = ""
        noUno2 = 0
        noDos2 = 0
        noTres2 = 0
        noCuatro2 = 0
        noCinco2 = 0
        noSeis2 = 0
        cadena4 = ""
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
    private fun alerta(dato1: String) {
        val customDialog = Dialog(this)
        customDialog.setContentView(R.layout.instrucciones_bra_esp1)
        customDialog.window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        customDialog.dato.setText(dato1)
        customDialog.show()
    }
    override fun onBackPressed() {

        startActivity(Intent(this, Menu_Adivinanzas::class.java))
        Bungee.zoom(this)
    }
}