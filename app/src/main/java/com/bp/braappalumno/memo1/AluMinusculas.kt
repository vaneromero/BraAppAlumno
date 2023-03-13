package com.bp.braappalumno.memo1

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.os.Handler
import android.preference.PreferenceManager
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bp.braappalumno.*
import com.bp.braappalumno.memo1.AluMinusculas.PreferenceHelper.contador
import com.bp.braappalumno.memo1.AluMinusculas.PreferenceHelper.puntos
import kotlinx.android.synthetic.main.activity_alu_minusculas.*
import kotlinx.android.synthetic.main.activity_alu_minusculas.puntaje
import kotlinx.android.synthetic.main.activity_alu_minusculas.reintentar
import kotlinx.android.synthetic.main.activity_option.*
import kotlinx.android.synthetic.main.cartas_imagen.*
import kotlinx.android.synthetic.main.toast.*
import kotlinx.android.synthetic.main.toast.view.*
import kotlinx.android.synthetic.main.ventana.*
import kotlinx.android.synthetic.main.ventana_toast.*
import kotlinx.android.synthetic.main.ventana_toast.view.*
import kotlinx.android.synthetic.main.ventana_toast.view.toastT
import spencerstudios.com.bungeelib.Bungee
import java.util.*
import kotlin.collections.ArrayList


class AluMinusculas : AppCompatActivity() {
    var marcador: Int=0;
    var primeraCarta: Int = 0
    var segundaCarta: Int = 0
    var primerClick: Int = 0
    var segundoClick: Int = 0
    var numeroCarta: Int = 1
    var a:String=""
    var p1:String=""
    var p2:String=""
    var p3:String=""
    var p4:String=""
    var p5:String=""
    var p6:String=""
    var bandera=false
    var cartas = ArrayList<Int>(listOf(12,13,14,15,16,17,22,23,24,25,26,27))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alu_minusculas)
        Log.v("entro","")
        reintentar.setOnClickListener {
            recargar()
        }
        OpcionesJuegos000.setOnClickListener {
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
        val CUSTOM_PREF_NAME = "MinusculasAlumno"
        val defaultPrefs = PreferenceHelper.defaultPreference(this)
        defaultPrefs.puntos = 0
        defaultPrefs.contador = 0
        val prefs = PreferenceHelper.customPreference(this, CUSTOM_PREF_NAME)
        Log.v("prueba","${prefs.contador}")
        var cnt=prefs.contador
        if(cnt==0){
            alerta()
        }

        // 2.- Cargar Cartas
        seleccionLetras()

        // 3.- Barajar las Cartas
        Collections.shuffle(cartas)

        // 4.- setUp OnClickListener
        setUpOnClickListner()

    }
    private fun seleccionLetras() {
        p1=""
        val abc = mutableListOf("a","b","c","d", "e", "f", "g", "h", "i", "j", "k", "l", "m","ene", "n", "o", "p",  "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "aacento", "apuntos", "eacento", "iacento","oacento","opuntos","uacento","upuntos","ypuntos")
        p1 = abc.random().toString()
        p2 = abc.random().toString()
        p3 = abc.random().toString()
        p4 = abc.random().toString()
        p5 = abc.random().toString()
        p6 = abc.random().toString()
        while (!bandera) {
            if ((p2.equals(p1)) || (p2.equals(p3)) || (p2.equals(p4)) || (p2.equals(p5)) || (p2.equals(
                    p6
                ))
            ) {
                p2 = abc.random().toString()
            }else if ((p3.equals(p1)) || (p3.equals(p2)) || (p3.equals(p4)) || (p3.equals(p5)) || (p3.equals(p6))
            ) {
                p3 = abc.random().toString()
            }else if ((p4.equals(p1)) || (p4.equals(p2)) || (p4.equals(p3)) || (p4.equals(p5)) || (p4.equals(
                    p6
                ))
            ) {
                p4 = abc.random().toString()
            }else if ((p5.equals(p1)) || (p5.equals(p2)) || (p5.equals(p3)) || (p5.equals(p4)) || (p5.equals(
                    p6
                ))
            ) {
                p5 = abc.random().toString()
            }else if ((p6.equals(p1)) || (p6.equals(p2)) || (p6.equals(p3)) || (p6.equals(p4)) || (p6.equals(
                    p5
                ))
            ) {
                p6 = abc.random().toString()
            }else {
                bandera = true;
            }
        }
    }

    private fun setUpOnClickListner(){
        im11.setOnClickListener(){
            var carta: Int = 0
            asignarImagenalaCarta(im11, carta)
        }

        im12.setOnClickListener(){
            var carta: Int = 1
            asignarImagenalaCarta(im12, carta)
        }

        im13.setOnClickListener(){
            var carta: Int = 2
            asignarImagenalaCarta(im13, carta)
        }

        im21.setOnClickListener(){
            var carta: Int = 3
            asignarImagenalaCarta(im21, carta)
        }

        im22.setOnClickListener(){
            var carta: Int = 4
            asignarImagenalaCarta(im22, carta)
        }

        im23.setOnClickListener(){
            var carta: Int = 5
            asignarImagenalaCarta(im23, carta)
        }

        im31.setOnClickListener(){
            var carta: Int = 6
            asignarImagenalaCarta(im31, carta)
        }

        im32.setOnClickListener(){
            var carta: Int = 7
            asignarImagenalaCarta(im32, carta)
        }

        im33.setOnClickListener(){
            var carta: Int = 8
            asignarImagenalaCarta(im33, carta)
        }

        im41.setOnClickListener(){
            var carta: Int = 9
            asignarImagenalaCarta(im41, carta)
        }
        im42.setOnClickListener(){
            var carta: Int = 10
            asignarImagenalaCarta(im42, carta)
        }
        im43.setOnClickListener(){
            var carta: Int = 11
            asignarImagenalaCarta(im43, carta)
        }
    }

    private fun asignarImagenalaCarta(image: ImageView, carta: Int){
        when(cartas[carta]){
            12 -> image.setImageResource(getResources().getIdentifier(p1, "drawable", getPackageName()));
            13 -> image.setImageResource(getResources().getIdentifier(p2, "drawable", getPackageName()));
            14 -> image.setImageResource(getResources().getIdentifier(p3, "drawable", getPackageName()));
            15 -> image.setImageResource(getResources().getIdentifier(p4, "drawable", getPackageName()));
            16 -> image.setImageResource(getResources().getIdentifier(p5, "drawable", getPackageName()));
            17 -> image.setImageResource(getResources().getIdentifier(p6, "drawable", getPackageName()));

            22 -> image.setImageResource(getResources().getIdentifier(p1, "drawable", getPackageName()));
            23 -> image.setImageResource(getResources().getIdentifier(p2, "drawable", getPackageName()));
            24 -> image.setImageResource(getResources().getIdentifier(p3, "drawable", getPackageName()));
            25 -> image.setImageResource(getResources().getIdentifier(p4, "drawable", getPackageName()));
            26 -> image.setImageResource(getResources().getIdentifier(p5, "drawable", getPackageName()));
            27 -> image.setImageResource(getResources().getIdentifier(p6, "drawable", getPackageName()));
        }
        if(numeroCarta == 1) {
            primeraCarta = cartas[carta]
            if (primeraCarta > 20) {
                primeraCarta = primeraCarta - 10
            }
            numeroCarta = 2
            primerClick = carta
            image.isEnabled = false
            a="Tarjeta seleccionada, por favor elija una tarjeta mas."
            toast1(a)
        }else if(numeroCarta == 2){
            segundaCarta = cartas[carta]
            if (segundaCarta > 20) {
                segundaCarta = segundaCarta - 10
            }
            numeroCarta = 1
            segundoClick = carta

            im11.isEnabled = false
            im12.isEnabled = false
            im13.isEnabled = false
            im21.isEnabled = false
            im22.isEnabled = false
            im23.isEnabled = false
            im31.isEnabled = false
            im32.isEnabled = false
            im33.isEnabled = false
            im41.isEnabled = false
            im42.isEnabled = false
            im43.isEnabled = false

            var handler = Handler()
            handler.postDelayed(Runnable {
                comprobarCorrecto()
            },1000)
        }


    }

    private fun comprobarCorrecto(){
        if(primeraCarta == segundaCarta){
            when(primerClick){
                0 -> im11.visibility = View.INVISIBLE
                1 -> im12.visibility = View.INVISIBLE
                2 -> im13.visibility = View.INVISIBLE
                3 -> im21.visibility = View.INVISIBLE
                4 -> im22.visibility = View.INVISIBLE
                5 -> im23.visibility = View.INVISIBLE
                6 -> im31.visibility = View.INVISIBLE
                7 -> im32.visibility = View.INVISIBLE
                8 -> im33.visibility = View.INVISIBLE
                9 -> im41.visibility = View.INVISIBLE
                10 -> im42.visibility = View.INVISIBLE
                11 -> im43.visibility = View.INVISIBLE
            }

            when(segundoClick){
                0 -> im11.visibility = View.INVISIBLE
                1 -> im12.visibility = View.INVISIBLE
                2 -> im13.visibility = View.INVISIBLE
                3 -> im21.visibility = View.INVISIBLE
                4 -> im22.visibility = View.INVISIBLE
                5 -> im23.visibility = View.INVISIBLE
                6 -> im31.visibility = View.INVISIBLE
                7 -> im32.visibility = View.INVISIBLE
                8 -> im33.visibility = View.INVISIBLE
                9 -> im41.visibility = View.INVISIBLE
                10 -> im42.visibility = View.INVISIBLE
                11 -> im43.visibility = View.INVISIBLE
            }
            marcador=marcador+5
            puntaje.setText(""+marcador)
            if ((primeraCarta==12)||(primeraCarta==22)){
                mensaje(p1)
            }else if ((primeraCarta==13)||(primeraCarta==23)){
                mensaje(p2)
            }else if ((primeraCarta==14)||(primeraCarta==24)){
                mensaje(p3)
            }else if ((primeraCarta==15)||(primeraCarta==25)){
                mensaje(p4)
            }else if ((primeraCarta==16)||(primeraCarta==26)){
                mensaje(p5)
            }else if ((primeraCarta==17)||(primeraCarta==27)){
                mensaje(p6)
            }

        }else{
            im11.setImageResource(R.drawable.tarjeta)
            im12.setImageResource(R.drawable.tarjeta)
            im13.setImageResource(R.drawable.tarjeta)

            im21.setImageResource(R.drawable.tarjeta)
            im22.setImageResource(R.drawable.tarjeta)
            im23.setImageResource(R.drawable.tarjeta)

            im31.setImageResource(R.drawable.tarjeta)
            im32.setImageResource(R.drawable.tarjeta)
            im33.setImageResource(R.drawable.tarjeta)

            im41.setImageResource(R.drawable.tarjeta)
            im42.setImageResource(R.drawable.tarjeta)
            im43.setImageResource(R.drawable.tarjeta)
            if (marcador>0){
                marcador=marcador-2
                if (marcador<0){
                    marcador=0
                }
                puntaje.setText(""+marcador)
            }
            a="Las letras de las tarjetas no coinciden, por favor intente con otra tarjeta."
            toast1(a)
        }
        im11.isEnabled = true
        im12.isEnabled = true
        im13.isEnabled = true

        im21.isEnabled = true
        im22.isEnabled = true
        im23.isEnabled = true

        im31.isEnabled = true
        im32.isEnabled = true
        im33.isEnabled = true

        im41.isEnabled = true
        im42.isEnabled = true
        im43.isEnabled = true

        finPartida()

    }

    private fun finPartida(){
        if(im11.visibility == View.INVISIBLE &&
            im12.visibility == View.INVISIBLE &&
            im13.visibility == View.INVISIBLE &&
            im21.visibility == View.INVISIBLE &&
            im22.visibility == View.INVISIBLE &&
            im23.visibility == View.INVISIBLE &&
            im31.visibility == View.INVISIBLE &&
            im32.visibility == View.INVISIBLE &&
            im33.visibility == View.INVISIBLE &&
            im41.visibility == View.INVISIBLE &&
            im42.visibility == View.INVISIBLE &&
            im43.visibility == View.INVISIBLE){
            var imagen ="win"
            var titulo="HAS GANADO!!"
            var dato1="Tu puntuacion es de: "+marcador
            alerta3(imagen,titulo,dato1,marcador)

        }
    }
    object PreferenceHelper {
        val USER_ID = "USER_ID"
        val USER_PASSWORD = "PASSWORD"
        fun defaultPreference(context: Context): SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(context)

        fun customPreference(context: Context, name: String): SharedPreferences =
            context.getSharedPreferences(name, Context.MODE_PRIVATE)

        inline fun SharedPreferences.editMe(operation: (SharedPreferences.Editor) -> Unit) {
            val editMe = edit()
            operation(editMe)
            editMe.apply()
        }

        inline fun SharedPreferences.Editor.put(pair: Pair<String, Any>) {
            val key = pair.first
            val value = pair.second
            when (value) {
                is String -> putString(key, value)
                is Int -> putInt(key, value)
                is Boolean -> putBoolean(key, value)
                is Long -> putLong(key, value)
                is Float -> putFloat(key, value)
                else -> error("Only primitive types can be stored in SharedPreferences")
            }
        }
        var SharedPreferences.puntos
            get() = getInt(USER_PASSWORD, 0)
            set(value) {
                editMe {
                    it.putInt(USER_PASSWORD, value)
                }
            }
        var SharedPreferences.contador
            get() = getInt(USER_ID, 0)
            set(value) {
                editMe {
                    it.putInt(USER_ID, value)
                }
            }
        var SharedPreferences.clearValues
            get() = { }
            set(value) {
                editMe {
                    it.remove(USER_ID)
                    it.remove(USER_PASSWORD)
                    it.clear()
                }
            }
    }
    private fun alerta3(imagen:String,titulo:String, dato1:String,dato3:Int) {

        val customDialog = Dialog(this)
        customDialog.setContentView(R.layout.ventana)
        customDialog.window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        customDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val CUSTOM_PREF_NAME = "MinusculasAlumno"
        val defaultPrefs = PreferenceHelper.defaultPreference(this)
        defaultPrefs.puntos = 0
        defaultPrefs.contador = 0
        val prefs = PreferenceHelper.customPreference(this, CUSTOM_PREF_NAME)
        Log.v("prueba","${prefs.puntos}")
        var punt=prefs.puntos
        if(dato3>punt){

            prefs.puntos=dato3
            prefs.contador=1
            Log.v("prueba","${prefs.puntos}")
        }else{

            prefs.contador=1
        }
        customDialog.imagen.setImageResource(getResources().getIdentifier(imagen, "drawable", getPackageName()))
        customDialog.titulo.setText(titulo)
        customDialog.punt.setText(dato1)
        val yesBtn = customDialog.findViewById<Button>(R.id.yes_opt9) as TextView
        val noBtn = customDialog.findViewById<Button>(R.id.no_opt9) as TextView

        yesBtn.setOnClickListener {
            recargar()
        }
        noBtn.setOnClickListener {
            prefs.contador=0
            var intent = Intent(applicationContext, Juegos::class.java)
            startActivity(intent)
            finish()
            customDialog.dismiss()
            onBackPressed()
        }
        customDialog.show()

    }
    fun recargar(){
        overridePendingTransition(0, 0);
        finish();
        overridePendingTransition(0, 0);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }
    private fun alerta() {
        val customDialog = Dialog(this)
        customDialog.setContentView(R.layout.instrucciones)
        customDialog.window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        customDialog.show()
    }
    fun mensaje(dato:String) {
        var dato1=""
        if(dato.equals("aacento")){
            dato1="á"
        }else if(dato.equals("apuntos")){
            dato1="ä"
        }else if(dato.equals("eacento")){
            dato1="é"
        }else if(dato.equals("iacento")){
            dato1="í"
        }else if(dato.equals("oacento")){
            dato1="ó"
        }else if(dato.equals("opuntos")){
            dato1="ö"
        }else if(dato.equals("uacento")){
            dato1="ú"
        }else if(dato.equals("upuntos")){
            dato1="ü"
        }else if(dato.equals("ypuntos")){
            dato1="Ÿ"
        }else if(dato.equals("ene")){
            dato1="ñ"
        }
        else{
            dato1=dato
        }
        toast(dato1)
    }
    override fun onBackPressed() {
        startActivity(Intent(applicationContext, MenuMemorama::class.java))
    }
    private fun toast(s: String) {
        val customLayout = layoutInflater.inflate(R.layout.ventana_toast, constraintlayout)
        val toast = Toast(this)
        toast.duration = Toast.LENGTH_LONG
        toast.setGravity(Gravity.CENTER,0,0)
        toast.view = customLayout
        customLayout.texto.text = "Letra encontrada"
        customLayout.toastT.text = s
        toast.show()
    }
    private fun toast1(s: String) {
        val customLayout = layoutInflater.inflate(R.layout.toast, toast23)
        val toast = Toast(this)
        toast.duration = Toast.LENGTH_SHORT
        toast.setGravity(Gravity.TOP or Gravity.RIGHT, 0, 0)
        toast.view = customLayout
        customLayout.toastT.text = s
        toast.show()
    }
}