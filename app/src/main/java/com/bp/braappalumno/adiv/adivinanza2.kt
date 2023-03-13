package com.bp.braappalumno.adiv

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Toast
import com.bp.braappalumno.*
import kotlinx.android.synthetic.main.activity_adivinanza2.*
import kotlinx.android.synthetic.main.activity_adivinanza2.adivinanza
import kotlinx.android.synthetic.main.activity_adivinanza2.btncinco2
import kotlinx.android.synthetic.main.activity_adivinanza2.btncinco3
import kotlinx.android.synthetic.main.activity_adivinanza2.btncuatro2
import kotlinx.android.synthetic.main.activity_adivinanza2.btncuatro3
import kotlinx.android.synthetic.main.activity_adivinanza2.btndos2
import kotlinx.android.synthetic.main.activity_adivinanza2.btndos3
import kotlinx.android.synthetic.main.activity_adivinanza2.btnseis2
import kotlinx.android.synthetic.main.activity_adivinanza2.btnseis3
import kotlinx.android.synthetic.main.activity_adivinanza2.btntres2
import kotlinx.android.synthetic.main.activity_adivinanza2.btntres3
import kotlinx.android.synthetic.main.activity_adivinanza2.btnuno2
import kotlinx.android.synthetic.main.activity_adivinanza2.btnuno3
import kotlinx.android.synthetic.main.activity_adivinanza2.cadena2
import kotlinx.android.synthetic.main.activity_adivinanza2.imagen
import kotlinx.android.synthetic.main.activity_adivinanza2.imagen2
import kotlinx.android.synthetic.main.activity_adivinanza2.linearLayout4
import kotlinx.android.synthetic.main.activity_adivinanza3.*
import kotlinx.android.synthetic.main.activity_option.*
import kotlinx.android.synthetic.main.instrucciones_bra_esp1.*
import kotlinx.android.synthetic.main.toast.*
import kotlinx.android.synthetic.main.toast.view.*
import kotlinx.android.synthetic.main.ventana.*
import spencerstudios.com.bungeelib.Bungee

class adivinanza2 : AppCompatActivity() {
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
        setContentView(R.layout.activity_adivinanza2)
        linearLayout4.setOnClickListener {

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
        var tex="En el centro de la pantalla encontraras 2 bloques de 6 botones los cuales seleccionaras para formar letras mayuscula en Braille"
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
            if (noSeis2 == 1) {
                noSeis2 = 1
                btnseis2.setBackgroundDrawable(resources.getDrawable(R.drawable.on))
                toast("Boton 6 deseleccionado")
            } else {
                noSeis2 = 0
                btnseis2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
                toast("Boton 6 deseleccionado")
            }
        }
        verificar2.setOnClickListener {
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
                cadena3 += "5"
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
            val p = imagen.getTag().toString()
            val l = imagen2.getTag().toString()
            //Se busca la letra usando los puntos activos en braille
            if (cadena3 == "46" && cadena4 == "1") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "12") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "14") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "145") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "15") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "124") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "1245") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "125") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "24") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "245") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "13") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "123") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "134") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "1345") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "12456") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "135") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "1234") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "12345") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "1235") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "234") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "2345") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "136") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "1236") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "2456") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "1346") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "13456") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "46" && cadena4 == "1356") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else if (cadena3 == "" || cadena4 == "") {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            } else {
                comparacion(cadena3, cadena4, p, l)
                cadena3 = ""
                cadena4 = ""
            }
        }
        reiniciar5.setOnClickListener {
            asignacion()
            limpiar()
        }
    }

    fun asignacion() {
        val numero = (1..27).random()
        numero + 1
        if (numero == 1) {
            imagen.setBackgroundResource(R.drawable.mayuscula)
            imagen2.setBackgroundResource(R.drawable.a)
            adivinanza.text =
                "Piensa y lo adivinarás… ¿qué tiene Adelita delante que Eva tiene detrás?."
            imagen2.setTag("1")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 2) {
            imagen2.setBackgroundResource(R.drawable.b)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Cuando soy pequeña tengo solo una barriguita, pero cuando me quedo mayor mi barriga se divide en dos ¿Quién soy?."
            imagen2.setTag("12")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 3) {
            imagen2.setBackgroundResource(R.drawable.c)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Una raja de melón de la comida al final y los cuernos de la luna cuando menguante está. ¿Qué seré?"
            imagen2.setTag("14")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 4) {
            imagen2.setBackgroundResource(R.drawable.d)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Yo soy letra tan escasa, que en dos sólo verás una y entra una en la docena. ¿Qué seré?"
            imagen2.setTag("145")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 5) {
            imagen2.setBackgroundResource(R.drawable.e)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "En medio del cielo estoy, sin ser lucero ni estrella, sin ser sol ni luna bella. ¡A ver si sabes quién soy!."
            imagen2.setTag("15")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 6) {
            imagen2.setBackgroundResource(R.drawable.f)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Soy la letra del desfile y el sonido del pinchazo, sólo tres palitos tengo y a los Felipes empiezo. ¿Qué seré?"
            imagen2.setTag("124")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")

        } else if (numero == 7) {
            imagen2.setBackgroundResource(R.drawable.g)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Gracias siempre la lleva consigo, y guapa, y también garbanzo. ¿Sabes ya de qué letrita te hablo?."
            imagen2.setTag("1245")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")

        } else if (numero == 8) {
            imagen2.setBackgroundResource(R.drawable.h)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Aunque diciendo mi nombre des tú casi un estornudo, hacha me tiene en su vientre pero mi sonido es mudo. ¿Qué seré?"
            imagen2.setTag("125")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")

        } else if (numero == 9) {
            imagen2.setBackgroundResource(R.drawable.i)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Entre todas mis hermanas, soy la que he crecido menos; jamás en España estoy, pero en Madrid sí me encuentro. ¿Qué seré?"
            imagen2.setTag("24")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 10) {
            imagen2.setBackgroundResource(R.drawable.j)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Por la cabeza me danza esta gran adivinanza: la letra más bailadora resultó ser servidora. ¿Cuál es?."
            imagen2.setTag("245")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 11) {
            imagen2.setBackgroundResource(R.drawable.k)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Primera en el kiwi, tambien en kimono, no esta en banana, y tampoco en el mono. ¿Qué seré?"
            imagen2.setTag("13")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 12) {
            imagen2.setBackgroundResource(R.drawable.l)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "En Melilla hay tres, en Madrid ninguna, en Castilla dos y en Galicia una. ¿Qué seré?"
            imagen2.setTag("123")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 13) {
            imagen2.setBackgroundResource(R.drawable.m)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "¿Qué es lo que se repite una vez cada minuto, dos veces cada momento y nunca en cien años?. ¿Qué seré?"
            imagen2.setTag("134")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 14) {
            imagen2.setBackgroundResource(R.drawable.n)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text = "¡Nana, nanita, nanita, ea! ¿Cuál es esa letrita que tanto suena?. ¿Qué seré?"
            imagen2.setTag("1345")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 15) {
            imagen2.setBackgroundResource(R.drawable.ene)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Estoy en medio del año, y casi al final del castaño y del otoño ¿Quién soy?."
            imagen2.setTag("13456")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 16) {
            imagen2.setBackgroundResource(R.drawable.o)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text = "Tengo forma de anillo, y soy la primera y la última en organillo. ¿Qué seré?"
            imagen2.setTag("135")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 17) {
            imagen2.setBackgroundResource(R.drawable.p)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "José, dicho entre amigos, repite siempre esta letra; también es la de los padres y la de Pedros y Petras. ¿Qué seré?"
            imagen2.setTag("1234")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 18) {
            imagen2.setBackgroundResource(R.drawable.q)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Estoy en el mosquito pero no en la hormiguita. No me tiene en el grillo pero sí en la mariquita ¿Qué letra soy?."
            imagen2.setTag("12345")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 19) {
            imagen2.setBackgroundResource(R.drawable.r)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Formo parte de París, en el fin del mar me encuentro, en el principio de Roma y, del Norte, estoy en el centro. ¿Qué seré?"
            imagen2.setTag("1235")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 20) {
            imagen2.setBackgroundResource(R.drawable.s)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "En cualquier día de la semana me verás, excepto en domingo que no me encontrarás.. ¿Qué seré?"
            imagen2.setTag("234")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 21) {
            imagen2.setBackgroundResource(R.drawable.t)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "La tienes en Torremocha y hacia el final de Albacete, y, dondequiera que estés, a las tres como a las siete. ¿Qué seré?"
            imagen2.setTag("2345")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 22) {
            imagen2.setBackgroundResource(R.drawable.u)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "El burro la lleva a cuestas, metidas está en el baúl yo no la tuve jamás y siempre la tienes tú ¿Quién soy?."
            imagen2.setTag("136")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 23) {
            imagen2.setBackgroundResource(R.drawable.v)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Vanessa la lleva al principio, y Violeta, y también Víctor. Veleta y venado se apuntan. ¿sabes qué letra es la que llevan?"
            imagen2.setTag("1236")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 24) {
            imagen2.setBackgroundResource(R.drawable.w)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Cuando estoy de pie puedes confundirme con dos letras. Cuando estoy al revés suelen confundirme con una letra ¿Quién soy?"
            imagen2.setTag("2456")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 25) {
            imagen2.setBackgroundResource(R.drawable.x)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Es una cruz muy bonita, molino de aspas son. ¿Qué letra puede ser esta, que se emplea en multiplicación?¿Cuál será?."
            imagen2.setTag("1346")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 26) {
            imagen2.setBackgroundResource(R.drawable.y)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Soy hermana de la V, pero con un palito de más. Me llevas en un pronombre, si de ti quieres hablar. ¿Qué seré?"
            imagen2.setTag("13456")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        } else if (numero == 27) {
            imagen2.setBackgroundResource(R.drawable.z)
            imagen.setBackgroundResource(R.drawable.mayuscula)
            adivinanza.text =
                "Una letra pizpireta, de perdiz y cazoleta que se esconde en la maceta. ¿Qué seré?"
            imagen2.setTag("1356")
            imagen.setTag("46")
            cadena2.setText("${imagen.tag}")
        }
    }


    fun comparacion(dato1: String, dato2: String, p: String, l: String) {
        Log.v("prueba", " escribi $dato1 definido $p")
        Log.v("prueba", " escribi $dato2 definido $l")
        if (dato1 == p && dato2 == l) {
            marcador=marcador+10
            limpiar()
            asignacion()
            limpiar()
            pts2.text= "Puntaje: "+marcador.toString()
            toast("Es correcto")
        } else if ((dato1!=p && dato2!=l)||(dato1==p && dato2!=l)||(dato1!=p && dato2==l)) {
            if (marcador>0){
                marcador=marcador-2
                if (marcador<0){
                    marcador=0
                }

            }
            pts2.text= "Puntaje: "+marcador.toString()
            toast("Es incorrecto")
            limpiar()
        } else if (dato1.isEmpty() || dato2.isEmpty() || p.isEmpty() || l.isEmpty()) {
            if (marcador>0){
                marcador=marcador-2

                if (marcador<0){
                    marcador=0
                }

            }
            pts2.text= "Puntaje: "+marcador.toString()
            toast("Es incorrecto")
            limpiar()
        } else if (dato1.isEmpty() && dato2.isEmpty() && p.isEmpty() && l.isEmpty()) {
            if (marcador>0){
                marcador=marcador-2
                if (marcador<0){
                    marcador=0
                }

            }
            pts2.text= "Puntaje: "+marcador.toString()
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