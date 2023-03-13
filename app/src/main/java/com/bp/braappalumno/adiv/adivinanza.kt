package com.bp.braappalumno.adiv

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bp.braappalumno.*
import kotlinx.android.synthetic.main.activity_adivinanza.*
import kotlinx.android.synthetic.main.activity_adivinanza.imagen
import kotlinx.android.synthetic.main.activity_adivinanza.reiniciar
import kotlinx.android.synthetic.main.activity_adivinanza3.*
import kotlinx.android.synthetic.main.activity_option.*
import kotlinx.android.synthetic.main.toast.*
import kotlinx.android.synthetic.main.toast.view.*
import spencerstudios.com.bungeelib.Bungee


class adivinanza : AppCompatActivity() {
var marcador=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adivinanza)
        alerta()
        OpcionesJuegos95.setOnClickListener {
            val customDialog = Dialog(this)
            customDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            customDialog.setContentView(R.layout.activity_option)
            customDialog.window?.setLayout(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            customDialog.BtnH1.setOnClickListener {
                startActivity(Intent(applicationContext, Historia::class.java))
            }
            customDialog.BtnJ1.setOnClickListener {
                startActivity(Intent(applicationContext, Juegos::class.java))
            }
            customDialog.BtnT1.setOnClickListener {
                startActivity(Intent(applicationContext, Lector1::class.java))
            }
            customDialog.BtnM1.setOnClickListener {
                startActivity(Intent(applicationContext, MenuInv::class.java))
            }
            customDialog.show()
        }
        asignacion()
        reiniciar.setOnClickListener {
            asignacion()
        }
        uno.setOnClickListener {
            if (uno.text == imagen.getTag()) {
                marcador=marcador+10
                pts.text= "Puntaje: "+marcador.toString()
                toast("Es correcto")
                asignacion()
            } else {
                if (marcador>0){
                    marcador=marcador-2
                    if (marcador<0){
                        marcador=0
                    }
                }
                pts.text= "Puntaje: "+marcador.toString()
                toast("Es incorrecto")
            }
        }
        dos.setOnClickListener {
            if (dos.text == imagen.getTag()) {
                marcador=marcador+10
                pts.text= "Puntaje: "+marcador.toString()
                toast("Es correcto")
                asignacion()
            } else {
                if (marcador>0){
                    marcador=marcador-2
                    if (marcador<0){
                        marcador=0
                    }
                }
                pts.text= "Puntaje: "+marcador.toString()
                toast("Es incorrecto")
            }
        }
        tres.setOnClickListener {
            if (tres.text == imagen.getTag()) {
                marcador=marcador+10
                pts.text= "Puntaje: "+marcador.toString()
                toast("Es correcto")
                asignacion()
            } else {
                if (marcador>0){
                    marcador=marcador-2
                    if (marcador<0){
                        marcador=0
                    }
                }
                pts.text= "Puntaje: "+marcador.toString()
                toast("Es incorrecto")
            }
        }
        cuatro.setOnClickListener {
            if (cuatro.text == imagen.getTag()) {
                marcador=marcador+10
                pts.text= "Puntaje: "+marcador.toString()
                toast("Es correcto")
                asignacion()
            } else {
                if (marcador>0){
                    marcador=marcador-2
                    if (marcador<0){
                        marcador=0
                    }
                }
                pts.text= "Puntaje: "+marcador.toString()
                toast("Es incorrecto")
            }
        }
        pts.text= "Puntaje: "+marcador.toString()
        OpcionesJuegos95.setOnClickListener {
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

    @SuppressLint("SetTextI18n")
    fun asignacion() {
        val numero = (1..29).random()
        numero + 1
        if (numero == 1) {
            imagen.setBackgroundResource(R.drawable.a)
            adivinanzaa.text =
                "Yo fui tu primer sonido cuando empezaste a hablar y soy la primera letra que en el alfabeto está. ¿Qué seré?"
            imagen.setTag("a")
            asignacionBo(imagen.tag.toString())

        } else if (numero == 2) {
            imagen.setBackgroundResource(R.drawable.b)
            adivinanzaa.text =
                "Porque bien gordita estoy, dos barrigas me verás. No me gustan los viajes y en el barco me veras. ¿Qué seré?"
            imagen.setTag("b")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 3) {
            imagen.setBackgroundResource(R.drawable.c)
            adivinanzaa.text =
                "Me puedes encontrar muy al final del amanecer, nunca al mediodía ni en la tarde, pero sí en el medio de la noche ¿Quién soy?."
            imagen.setTag("c")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 4) {
            imagen.setBackgroundResource(R.drawable.d)
            adivinanzaa.text =
                "En los dedos tengo dos, en los dientes tengo uno, pero en las piernas, manos y brazos, ninguno. ¿Qué será?."
            imagen.setTag("d")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 5) {
            imagen.setBackgroundResource(R.drawable.e)
            adivinanzaa.text =
                "Como un tenedor, pero sin asa. Así dicen que soy los que me graban. ¿Qué seré?"
            imagen.setTag("e")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 6) {
            imagen.setBackgroundResource(R.drawable.f)
            adivinanzaa.text =
                "Le sirve de puerta al frío y al fuego, es final en nombres rusos y mediadora en oferta ¿Qué letra soy?."
            imagen.setTag("f")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 7) {
            imagen.setBackgroundResource(R.drawable.g)
            adivinanzaa.text =
                "Generosa gracias a ti existe, y en garganta dos veces insiste. ¿Quién soy?."
            imagen.setTag("g")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 8) {
            imagen.setBackgroundResource(R.drawable.h)
            adivinanzaa.text =
                "Aunque mi sonido es mudo, cuando me nombran parezco a un estornudo ¿Quién soy?."
            imagen.setTag("h")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 9) {
            imagen.setBackgroundResource(R.drawable.i)
            adivinanzaa.text =
                "Soy un palito muy derechito y encima de la frente llevo un mosquito que ni pica ni vuela ni toca la vihuela. ¿Qué seré?"
            imagen.setTag("i")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 10) {
            imagen.setBackgroundResource(R.drawable.j)
            adivinanzaa.text =
                "Mi nombre es nombre de baile, alegre y muy bravío; cuando suena en Aragón, la gente pierde el sentío. ¿Qué seré?"
            imagen.setTag("j")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 11) {
            imagen.setBackgroundResource(R.drawable.k)
            adivinanzaa.text =
                "No me pronunciéis dos veces, que tengo sonido feo; siendo la letra del kilo, en carreteras me veo. ¿Qué seré?"
            imagen.setTag("k")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 12) {
            imagen.setBackgroundResource(R.drawable.l)
            adivinanzaa.text = "Empieza en luna termina en sol. ¿Qué seré?"
            imagen.setTag("l")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 13) {
            imagen.setBackgroundResource(R.drawable.m)
            adivinanzaa.text =
                "Una vez en un minuto, dos veces en un momento, tres veces en mimetismo, y en cuatro, ¡no la encuentro!. ¿Qué seré?"
            imagen.setTag("m")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 14) {
            imagen.setBackgroundResource(R.drawable.n)
            adivinanzaa.text =
                "Suelen tenerla los puentes, pero no los viaductos. Como también las fuentes. ¿Qué será?"
            imagen.setTag("n")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 15) {
            imagen.setBackgroundResource(R.drawable.ene)
            adivinanzaa.text =
                "Aunque lleve turbante mora no soy, que solo en castellano de letra estoy. ¿Qué seré?"
            imagen.setTag("ñ")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 16) {
            imagen.setBackgroundResource(R.drawable.o)
            adivinanzaa.text =
                "Una cosa quisicosa, de ovalada construcción, todos los nombres la tiene, pero las mujeres, no. El Obispo como todos también tiene dos. ¿Qué seré?"
            imagen.setTag("o")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 17) {
            imagen.setBackgroundResource(R.drawable.p)
            adivinanzaa.text =
                "Como una B pero sin barriga. Me encontrarás al comienzo de Pancho, Paco y Pandora. ¿Qué seré?"
            imagen.setTag("p")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 18) {
            imagen.setBackgroundResource(R.drawable.q)
            adivinanzaa.text =
                "Estoy en el mosquito pero no en la hormiguita. No me tiene en el grillo pero sí en la mariquita ¿Qué letra soy?. ¿Qué seré?"
            imagen.setTag("q")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 19) {
            imagen.setBackgroundResource(R.drawable.r)
            adivinanzaa.text =
                "La tiene el tigre pero no el león dos veces el perro y una el ratón. ¿Qué seré?"
            imagen.setTag("r")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 20) {
            imagen.setBackgroundResource(R.drawable.s)
            adivinanzaa.text =
                "Desde el lunes hasta el viernes, soy la última en llegar, el sábado soy la primera y el domingo a descansar. ¿Qué seré?"
            imagen.setTag("s")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 21) {
            imagen.setBackgroundResource(R.drawable.t)
            adivinanzaa.text =
                "Te la digo y no la sabes, te la vuelvo a repetir, te la digo 3 veces y no la sabes decir. ¿Qué seré?"
            imagen.setTag("t")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 22) {
            imagen.setBackgroundResource(R.drawable.u)
            adivinanzaa.text =
                "¿Sabes de alguna letrita, que si la vuelta le das, enseguida se convierte de consonante en vocal?. ¿Qué seré?"
            imagen.setTag("u")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 23) {
            imagen.setBackgroundResource(R.drawable.v)
            adivinanzaa.text =
                "En la vaca estoy, en el viento voy, si en burro me ves en ortografía vas al revés. ¿Qué seré?"
            imagen.setTag("v")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 24) {
            imagen.setBackgroundResource(R.drawable.w)
            adivinanzaa.text =
                "Wamba y Witiza me tienen de pie, Víctor sólo a medias y Muza al revés. ¿Qué seré?"
            imagen.setTag("w")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 25) {
            imagen.setBackgroundResource(R.drawable.x)
            adivinanzaa.text =
                "Es una cruz muy bonita, molino de aspas son. ¿Qué letra puede ser esta, que se emplea en multiplicación?¿Cuál será?. ¿Qué seré?"
            imagen.setTag("x")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 26) {
            imagen.setBackgroundResource(R.drawable.y)
            adivinanzaa.text =
                "Tengo una pierna y no camino ni salto, tengo dos brazos y no puedo aplaudir. ¿Quién soy?"
            imagen.setTag("y")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 27) {
            imagen.setBackgroundResource(R.drawable.z)
            adivinanzaa.text =
                "La última de todas soy, pero en zurdo y zapato primera voy. ¿Qué seré?"
            imagen.setTag("z")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 28) {
            imagen.setBackgroundResource(R.drawable.punto)
            adivinanzaa.text = "Muy chiquito, chiquito, pone fin a lo escrito. ¿Qué seré?"
            imagen.setTag(".")
            asignacionBo(imagen.tag.toString())
        } else if (numero == 29) {
            imagen.setBackgroundResource(R.drawable.signos_interrogacion)
            adivinanzaa.text =
                "Termino cabeza arriba y empiezo cabeza abajo, y tan sólo a preguntar se limita mi trabajo. ¿Qué seré?"
            imagen.setTag("¿?")
            asignacionBo(imagen.tag.toString())
        }
    }

    fun asignacionBo(dato1: String) {
        var bandera = false

        val abc = mutableListOf(
            "a",
            "b",
            "c",
            "d",
            "e",
            "f",
            "g",
            "h",
            "i",
            "j",
            "k",
            "l",
            "m",
            "n",
            "ñ",
            "o",
            "p",
            "q",
            "r",
            "s",
            "t",
            "u",
            "v",
            "w",
            "x",
            "y",
            "z",
            ".",
            "¿?"
        )
        var dato2 = abc.random()
        var dato3 = abc.random()
        var dato4 = abc.random()

        while (!bandera) {
            if (dato2.equals(dato1) || dato2.equals(dato3) || dato2.equals(dato4)) {
                dato2 = abc.random()
            } else if (dato3.equals(dato1) || dato3.equals(dato2) || dato3.equals(dato4)) {
                dato3 = abc.random()
            } else if (dato4.equals(dato1) || dato4.equals(dato2) || dato4.equals(dato3)) {
                dato4 = abc.random()
            } else {
                bandera = true
            }
        }
        val arreglo = arrayListOf<String>(dato1, dato2, dato3, dato4)
        arreglo.shuffle()
        uno.text = arreglo[0]
        dos.text = arreglo[1]
        tres.text = arreglo[2]
        cuatro.text = arreglo[3]
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
        startActivity(Intent(applicationContext, Menu_Adivinanzas::class.java))
    }
    private fun alerta() {
        val customDialog = Dialog(this)
        customDialog.setContentView(R.layout.instrucciones_adivinanzas)
        customDialog.window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        customDialog.show()
    }
}