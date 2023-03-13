package com.bp.braappalumno.adiv

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
import kotlinx.android.synthetic.main.activity_adivinanza1.*
import kotlinx.android.synthetic.main.activity_adivinanza1.adivinanza
import kotlinx.android.synthetic.main.activity_adivinanza1.cadena2
import kotlinx.android.synthetic.main.activity_adivinanza1.imagen
import kotlinx.android.synthetic.main.activity_adivinanza1.imagen2
import kotlinx.android.synthetic.main.activity_adivinanza1.reiniciar
import kotlinx.android.synthetic.main.activity_adivinanza3.*
import kotlinx.android.synthetic.main.activity_option.*
import kotlinx.android.synthetic.main.toast.*
import kotlinx.android.synthetic.main.toast.view.*
import spencerstudios.com.bungeelib.Bungee


class adivinanza1 : AppCompatActivity() {
    var marcador=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adivinanza1)
        alerta()
        asignacion()
        reiniciar.setOnClickListener {

            asignacion()
        }
        cinco.setOnClickListener {
            if (cinco.text == imagen2.getTag()) {
                marcador=marcador+10
                pts1.text= "Puntaje: "+marcador.toString()
                toast("Es correcto")
                asignacion()
            } else {
                if (marcador>0){
                    marcador=marcador-2
                    if (marcador<0){
                        marcador=0
                    }
                }
                pts1.text= "Puntaje: "+marcador.toString()
                toast("Es incorrecto")
            }
        }
        seis.setOnClickListener {
            if (seis.text == imagen2.getTag()) {
                marcador=marcador+10
                pts1.text= "Puntaje: "+marcador.toString()
                toast("Es correcto")
                asignacion()
            } else {
                if (marcador>0){
                    marcador=marcador-2
                    if (marcador<0){
                        marcador=0
                    }

                }
                pts1.text= "Puntaje: "+marcador.toString()
                toast("Es incorrecto")
            }
        }
        OpcionesJuegos48.setOnClickListener {
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
        siete.setOnClickListener {
            if (siete.text == imagen2.getTag()) {
                marcador=marcador+10
                pts1.text= "Puntaje: "+marcador.toString()
                toast("Es correcto")
                asignacion()
            } else {
                if (marcador>0){
                    marcador=marcador-2
                    pts1.text= "Puntaje: "+marcador.toString()
                    if (marcador<0){
                        marcador=0
                    }
                }
                pts1.text= "Puntaje: "+marcador.toString()
                toast("Es incorrecto")
            }
        }
        ocho.setOnClickListener {
            if (ocho.text == imagen2.getTag()) {
                marcador = marcador + 10
                pts1.text= "Puntaje: "+marcador.toString()
                toast("Es correcto")
                asignacion()
            } else {
                if (marcador > 0) {
                    marcador = marcador - 2
                    if (marcador < 0) {
                        marcador = 0
                    }

                }
                pts1.text= "Puntaje: "+marcador.toString()
                toast("Es incorrecto")
            }
        }
        pts1.text= "Puntaje: "+marcador.toString()
    }


    fun asignacion() {
        val numero = (1..37).random()
        numero + 1
        if (numero == 1) {
            imagen.setBackgroundResource(R.drawable.mayuscula)
            imagen2.setBackgroundResource(R.drawable.a)
            adivinanza.text =
                "Piensa y lo adivinarás… ¿qué tiene Adelita delante que Eva tiene detrás?."
            imagen2.setTag("A")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 2) {
            imagen2.setBackgroundResource(R.drawable.b)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Cuando soy pequeña tengo solo una barriguita, pero cuando me quedo mayor mi barriga se divide en dos ¿Quién soy?."
            imagen2.setTag("B")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 3) {
            imagen2.setBackgroundResource(R.drawable.c)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Una raja de melón de la comida al final y los cuernos de la luna cuando menguante está. ¿Qué seré?"
            imagen2.setTag("C")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 4) {
            imagen2.setBackgroundResource(R.drawable.d)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Yo soy letra tan escasa, que en dos sólo verás una y entra una en la docena. ¿Qué seré?"
            imagen2.setTag("D")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 5) {
            imagen2.setBackgroundResource(R.drawable.e)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "En medio del cielo estoy, sin ser lucero ni estrella, sin ser sol ni luna bella. ¡A ver si sabes quién soy!. ¿Qué seré?"
            imagen2.setTag("E")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 6) {
            imagen2.setBackgroundResource(R.drawable.f)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Soy la letra del desfile y el sonido del pinchazo, sólo tres palitos tengo y a los Felipes empiezo. ¿Qué seré?"
            imagen2.setTag("F")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())

        } else if (numero == 7) {
            imagen2.setBackgroundResource(R.drawable.g)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Gracias siempre la lleva consigo, y guapa, y también garbanzo. ¿Sabes ya de qué letrita te hablo?."
            imagen2.setTag("G")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())

        } else if (numero == 8) {
            imagen2.setBackgroundResource(R.drawable.h)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Aunque diciendo mi nombre des tú casi un estornudo, hacha me tiene en su vientre pero mi sonido es mudo. ¿Qué seré?"
            imagen2.setTag("H")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())

        } else if (numero == 9) {
            imagen2.setBackgroundResource(R.drawable.i)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Entre todas mis hermanas, soy la que he crecido menos; jamás en España estoy, pero en Madrid sí me encuentro. ¿Qué seré?"
            imagen2.setTag("I")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 10) {
            imagen2.setBackgroundResource(R.drawable.j)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Por la cabeza me danza esta gran adivinanza: la letra más bailadora resultó ser servidora. ¿Cuál es?."
            imagen2.setTag("J")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())

        } else if (numero == 11) {
            imagen2.setBackgroundResource(R.drawable.k)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Primera en el kiwi, tambien en kimono, no esta en banana, y tampoco en el mono. ¿Qué seré?"
            imagen2.setTag("K")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 12) {
            imagen2.setBackgroundResource(R.drawable.l)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "En Melilla hay tres, en Madrid ninguna, en Castilla dos y en Galicia una. ¿Qué seré?"
            imagen2.setTag("L")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 13) {
            imagen2.setBackgroundResource(R.drawable.m)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "¿Qué es lo que se repite una vez cada minuto, dos veces cada momento y nunca en cien años?. ¿Qué seré?"
            imagen2.setTag("M")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 14) {
            imagen2.setBackgroundResource(R.drawable.n)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "¡Nana, nanita, nanita, ea! ¿Cuál es esa letrita que tanto suena?. ¿Qué seré?"
            imagen2.setTag("N")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 15) {
            imagen2.setBackgroundResource(R.drawable.ene)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Estoy en medio del año, y casi al final del castaño y del otoño ¿Quién soy?."
            imagen2.setTag("Ñ")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 16) {
            imagen2.setBackgroundResource(R.drawable.o)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Tengo forma de anillo, y soy la primera y la última en organillo. ¿Qué seré?"
            imagen2.setTag("O")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 17) {
            imagen2.setBackgroundResource(R.drawable.p)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "José, dicho entre amigos, repite siempre esta letra; también es la de los padres y la de Pedros y Petras. ¿Qué seré?"
            imagen2.setTag("P")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 18) {
            imagen2.setBackgroundResource(R.drawable.q)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Estoy en el mosquito pero no en la hormiguita. No me tiene en el grillo pero sí en la mariquita ¿Qué letra soy?."
            imagen2.setTag("Q")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 19) {
            imagen2.setBackgroundResource(R.drawable.r)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Formo parte de París, en el fin del mar me encuentro, en el principio de Roma y, del Norte, estoy en el centro. ¿Qué seré?"
            imagen2.setTag("R")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 20) {
            imagen2.setBackgroundResource(R.drawable.s)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "En cualquier día de la semana me verás, excepto en domingo que no me encontrarás.. ¿Qué seré?"
            imagen2.setTag("S")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 21) {
            imagen2.setBackgroundResource(R.drawable.t)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "La tienes en Torremocha y hacia el final de Albacete, y, dondequiera que estés, a las tres como a las siete. ¿Qué seré?"
            imagen2.setTag("T")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 22) {
            imagen2.setBackgroundResource(R.drawable.u)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "El burro la lleva a cuestas, metidas está en el baúl yo no la tuve jamás y siempre la tienes tú ¿Quién soy?."
            imagen2.setTag("U")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 23) {
            imagen2.setBackgroundResource(R.drawable.v)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Vanessa la lleva al principio, y Violeta, y también Víctor. Veleta y venado se apuntan. ¿sabes qué letra es la que llevan?"
            imagen2.setTag("V")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 24) {
            imagen2.setBackgroundResource(R.drawable.w)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Cuando estoy de pie puedes confundirme con dos letras. Cuando estoy al revés suelen confundirme con una letra ¿Quién soy?"
            imagen2.setTag("W")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 25) {
            imagen2.setBackgroundResource(R.drawable.x)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Es una cruz muy bonita, molino de aspas son. ¿Qué letra puede ser esta, que se emplea en multiplicación?¿Cuál será?."
            imagen2.setTag("X")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 26) {
            imagen2.setBackgroundResource(R.drawable.y)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Soy hermana de la V, pero con un palito de más. Me llevas en un pronombre, si de ti quieres hablar. ¿Qué seré?"
            imagen2.setTag("Y")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 27) {
            imagen2.setBackgroundResource(R.drawable.z)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Una letra pizpireta, de perdiz y cazoleta que se esconde en la maceta. ¿Qué seré?"
            imagen2.setTag("Z")
            imagen.setTag("Mayuscula")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 28) {
            imagen2.setBackgroundResource(R.drawable.a)
            imagen.setBackgroundResource(R.drawable.numeros1)
            adivinanza.text =
                "Un agricultor tiene tres montones de paja en el pajar y cuatro en el prado. Si los junta ¿cuántos montones tiene?."
            imagen2.setTag("1")
            imagen.setTag("Numero")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 29) {
            imagen2.setBackgroundResource(R.drawable.b)
            imagen.setBackgroundResource(R.drawable.numeros1)
            adivinanza.text = "Tengo forma de patito, soy arqueado y redondito. ¿Quién soy?."
            imagen2.setTag("2")
            imagen.setTag("Numero")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 30) {
            imagen2.setBackgroundResource(R.drawable.c)
            imagen.setBackgroundResource(R.drawable.numeros1)
            adivinanza.text =
                "En una pecera 2 peces van delante de un pez, 2 peces van detrás de un pez, y un pez entre dos peces, ¿Cuántos peces hay?."
            imagen2.setTag("3")
            imagen.setTag("Numero")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 31) {
            imagen2.setBackgroundResource(R.drawable.d)
            imagen.setBackgroundResource(R.drawable.numeros1)
            adivinanza.text =
                "Soy como una escalerita o como un hombre sentado, y cuando se habla de patas, soy las que tienen los bancos. ¿Qué seré?"
            imagen2.setTag("4")
            imagen.setTag("Numero")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 32) {
            imagen2.setBackgroundResource(R.drawable.e)
            imagen.setBackgroundResource(R.drawable.numeros1)
            adivinanza.text =
                "¿Qué número tiene tantas letras en su nombre como lo indica el valor de su cifra?. ¿Qué seré?"
            imagen2.setTag("5")
            imagen.setTag("Numero")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 33) {
            imagen2.setBackgroundResource(R.drawable.f)
            imagen.setBackgroundResource(R.drawable.numeros1)
            adivinanza.text =
                "Este era un número impar, pero un día la vuelta se dio bocabajo se quedó y en un numero par se convirtió.¿Qué seré?"
            imagen2.setTag("6")
            imagen.setTag("Numero")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 34) {
            imagen2.setBackgroundResource(R.drawable.g)
            imagen.setBackgroundResource(R.drawable.numeros1)
            adivinanza.text =
                "Si quieres saber qué número soy, espera a que llueva. Contando los colores del arcoíris tendrás la prueba. ¿Qué seré?"
            imagen2.setTag("7")
            imagen.setTag("Numero")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 35) {
            imagen2.setBackgroundResource(R.drawable.h)
            imagen.setBackgroundResource(R.drawable.numeros1)
            adivinanza.text =
                "Un caracol se cayó en un pozo de 11 metros, cada día sube 3 metros y al dormirse baja 2 ¿En cuántos días saldrá el caracol del pozo?."
            imagen2.setTag("8")
            imagen.setTag("Numero")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 36) {
            imagen2.setBackgroundResource(R.drawable.i)
            imagen.setBackgroundResource(R.drawable.numeros1)
            adivinanza.text = "¿Cuál es el número que si lo pones de manos vale menos?."
            imagen2.setTag("9")
            imagen.setTag("Numero")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        } else if (numero == 37) {
            imagen2.setBackgroundResource(R.drawable.j)
            imagen.setBackgroundResource(R.drawable.numeros1)
            adivinanza.text =
                "Redondo soy y es cosa anunciada que a la derecha algo valgo, pero a la izquierda nada. ¿Qué seré?"
            imagen2.setTag("0")
            imagen.setTag("Numero")
            cadena2.setText("${imagen.tag}")
            asignacionBo(imagen2.tag.toString())
        }
    }

    fun asignacionBo(dato1: String) {
        var bandera = false

        val abc = mutableListOf(
            "A",
            "B",
            "C",
            "D",
            "E",
            "F",
            "G",
            "H",
            "I",
            "J",
            "K",
            "L",
            "M",
            "N",
            "Ñ",
            "O",
            "P",
            "Q",
            "R",
            "S",
            "T",
            "U",
            "V",
            "W",
            "X",
            "Y",
            "Z",
            "1",
            "2", "3", "4", "5", "6", "7", "8",
            "9", "0"
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
        cinco.text = arreglo[0]
        seis.text = arreglo[1]
        siete.text = arreglo[2]
        ocho.text = arreglo[3]
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
    private fun alerta() {
        val customDialog = Dialog(this)
        customDialog.setContentView(R.layout.instrucciones_adivinanzas)
        customDialog.window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        customDialog.show()
    }
    override fun onBackPressed() {
        startActivity(Intent(applicationContext, Menu_Adivinanzas::class.java))
    }
}