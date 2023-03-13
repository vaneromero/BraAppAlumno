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
import kotlinx.android.synthetic.main.activity_adivinanza4.*
import kotlinx.android.synthetic.main.activity_option.*
import kotlinx.android.synthetic.main.toast.*
import kotlinx.android.synthetic.main.toast.view.*
import spencerstudios.com.bungeelib.Bungee

class adivinanza4 : AppCompatActivity() {
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
        setContentView(R.layout.activity_adivinanza4)
        alerta()
        asignacion()
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
                toast("Boton 6 seleccionado")
            } else {
                noSeis2 = 0
                btnseis2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
                toast("Boton 6 deseleccionado")
            }
        }
        reiniciar6.setOnClickListener {
            asignacion()
            limpiar()
        }
        verificar5.setOnClickListener {
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
            val l = imagen2.getTag().toString()
            if (cadena4 == "1") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "12") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "14") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "145") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "15") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "124") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "1245") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "125") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "24") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "245") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "13") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "123") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "134") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "1345") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "12456") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "135") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "1234") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "12345") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "1235") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "234") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "2345") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "136") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "1236") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "2456") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "1346") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "13456") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "1356") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "3") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "26") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else if (cadena4 == "") {
                comparacion(cadena4, l)
                cadena4 = ""
            } else {
                comparacion(cadena4, l)
                cadena4 = ""
            }

        }
        OpcionesJuegos5.setOnClickListener {
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
        val numero=(1..29).random()
        numero+1
        if(numero==1){
            imagen2.setBackgroundResource(R.drawable.a)
            adivinanza.text="Yo fui tu primer sonido cuando empezaste a hablar y soy la primera letra que en el alfabeto está. ¿Qué seré?"
            imagen2.setTag("1")

        }
        else if(numero==2){
            imagen2.setBackgroundResource(R.drawable.b)
            adivinanza.text="Porque bien gordita estoy, dos barrigas me verás. No me gustan los viajes y en el barco me veras. ¿Qué seré?"
            imagen2.setTag("12")

        }
        else if(numero==3){
            imagen2.setBackgroundResource(R.drawable.c)
            adivinanza.text="Me puedes encontrar muy al final del amanecer, nunca al mediodía ni en la tarde, pero sí en el medio de la noche ¿Quién soy?."
            imagen2.setTag("14")

        }
        else if(numero==4){
            imagen2.setBackgroundResource(R.drawable.d)
            adivinanza.text="En los dedos tengo dos, en los dientes tengo uno, pero en las piernas, manos y brazos, ninguno. ¿Qué será?."
            imagen2.setTag("145")

        }
        else if(numero==5){
            imagen2.setBackgroundResource(R.drawable.e)
            adivinanza.text="Como un tenedor, pero sin asa. Así dicen que soy los que me graban. ¿Qué seré?"
            imagen2.setTag("15")

        }
        else if(numero==6){
            imagen2.setBackgroundResource(R.drawable.f)
            adivinanza.text="Le sirve de puerta al frío y al fuego, es final en nombres rusos y mediadora en oferta ¿Qué letra soy?."
            imagen2.setTag("124")

        }
        else if(numero==7){
            imagen2.setBackgroundResource(R.drawable.g)
            adivinanza.text="Generosa gracias a ti existe, y en garganta dos veces insiste. ¿Quién soy?."
            imagen2.setTag("1245")

        }
        else if(numero==8){
            imagen2.setBackgroundResource(R.drawable.h)
            adivinanza.text="Aunque mi sonido es mudo, cuando me nombran parezco a un estornudo ¿Quién soy?."
            imagen2.setTag("125")

        }
        else if(numero==9){
            imagen2.setBackgroundResource(R.drawable.i)
            adivinanza.text="Soy un palito muy derechito y encima de la frente llevo un mosquito que ni pica ni vuela ni toca la vihuela. ¿Qué seré?"
            imagen2.setTag("24")

        }
        else if(numero==10){
            imagen2.setBackgroundResource(R.drawable.j)
            adivinanza.text="Mi nombre es nombre de baile, alegre y muy bravío; cuando suena en Aragón, la gente pierde el sentío. ¿Qué seré?"
            imagen2.setTag("245")

        }
        else if(numero==11){
            imagen2.setBackgroundResource(R.drawable.k)
            adivinanza.text="No me pronunciéis dos veces, que tengo sonido feo; siendo la letra del kilo, en carreteras me veo. ¿Qué seré?"
            imagen2.setTag("13")

        }
        else if(numero==12){
            imagen2.setBackgroundResource(R.drawable.l)
            adivinanza.text="Empieza en luna termina en sol. ¿Qué seré?"
            imagen2.setTag("123")

        }
        else if(numero==13){
            imagen2.setBackgroundResource(R.drawable.m)
            adivinanza.text="Una vez en un minuto, dos veces en un momento, tres veces en mimetismo, y en cuatro, ¡no la encuentro!. ¿Qué seré?"
            imagen2.setTag("134")

        }
        else if(numero==14){
            imagen2.setBackgroundResource(R.drawable.n)
            adivinanza.text="Suelen tenerla los puentes, pero no los viaductos. Como también las fuentes. ¿Qué será?"
            imagen2.setTag("1345")

        }
        else if(numero==15){
            imagen2.setBackgroundResource(R.drawable.ene)
            adivinanza.text="Aunque lleve turbante mora no soy, que solo en castellano de letra estoy. ¿Qué seré?"
            imagen2.setTag("12456")

        }
        else if(numero==16){
            imagen2.setBackgroundResource(R.drawable.o)
            adivinanza.text="Una cosa quisicosa, de ovalada construcción, todos los nombres la tiene, pero las mujeres, no. El Obispo como todos también tiene dos. ¿Qué seré?"
            imagen2.setTag("135")

        }
        else if(numero==17){
            imagen2.setBackgroundResource(R.drawable.p)
            adivinanza.text="Como una B pero sin barriga. Me encontrarás al comienzo de Pancho, Paco y Pandora. ¿Qué seré?"
            imagen2.setTag("1234")

        }
        else if(numero==18){
            imagen2.setBackgroundResource(R.drawable.q)
            adivinanza.text="Estoy en el mosquito pero no en la hormiguita. No me tiene en el grillo pero sí en la mariquita ¿Qué letra soy?."
            imagen2.setTag("12345")

        }
        else if(numero==19){
            imagen2.setBackgroundResource(R.drawable.r)
            adivinanza.text="La tiene el tigre pero no el león dos veces el perro y una el ratón. ¿Qué seré?"
            imagen2.setTag("1235")

        }
        else if(numero==20){
            imagen2.setBackgroundResource(R.drawable.s)
            adivinanza.text="Desde el lunes hasta el viernes, soy la última en llegar, el sábado soy la primera y el domingo a descansar. ¿Qué seré?"
            imagen2.setTag("234")

        }
        else if(numero==21){
            imagen2.setBackgroundResource(R.drawable.t)
            adivinanza.text="Te la digo y no la sabes, te la vuelvo a repetir, te la digo 3 veces y no la sabes decir. ¿Qué seré?"
            imagen2.setTag("2345")

        }
        else if(numero==22){
            imagen2.setBackgroundResource(R.drawable.u)
            adivinanza.text="¿Sabes de alguna letrita, que si la vuelta le das, enseguida se convierte de consonante en vocal?."
            imagen2.setTag("136")
        }  else if(numero==23){
            imagen2.setBackgroundResource(R.drawable.v)
            adivinanza.text="En la vaca estoy, en el viento voy, si en burro me ves en ortografía vas al revés. ¿Qué seré?"
            imagen2.setTag("1236")
        }
        else if(numero==24){
            imagen2.setBackgroundResource(R.drawable.w)
            adivinanza.text="Wamba y Witiza me tienen de pie, Víctor sólo a medias y Muza al revés. ¿Qué seré?"
            imagen2.setTag("2456")
        }
        else if(numero==25){
            imagen2.setBackgroundResource(R.drawable.x)
            adivinanza.text="Es una cruz muy bonita, molino de aspas son. ¿Qué letra puede ser esta, que se emplea en multiplicación?¿Cuál será?."
            imagen2.setTag("1346")
        }
        else if(numero==26){
            imagen2.setBackgroundResource(R.drawable.y)
            adivinanza.text="Tengo una pierna y no camino ni salto, tengo dos brazos y no puedo aplaudir. ¿Quién soy?"
            imagen2.setTag("13456")
        }
        else if(numero==27){
            imagen2.setBackgroundResource(R.drawable.z)
            adivinanza.text="La última de todas soy, pero en zurdo y zapato primera voy. ¿Qué seré?"
            imagen2.setTag("1356")
        }
        else if(numero==28){
            imagen2.setBackgroundResource(R.drawable.punto)
            adivinanza.text="Muy chiquito, chiquito, pone fin a lo escrito. ¿Qué seré?"
            imagen2.setTag("3")
        }
        else if(numero==29){
            imagen2.setBackgroundResource(R.drawable.signos_interrogacion)
            adivinanza.text="Termino cabeza arriba y empiezo cabeza abajo, y tan sólo a preguntar se limita mi trabajo. ¿Qué seré?"
            imagen2.setTag("26")
        }
    }


    fun limpiar() {
        btnuno2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
        btndos2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
        btntres2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
        btncuatro2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
        btncinco2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
        btnseis2.setBackgroundDrawable(resources.getDrawable(R.drawable.off))
        noUno2 = 0
        noDos2 = 0
        noTres2 = 0
        noCuatro2 = 0
        noCinco2 = 0
        noSeis2 = 0
        cadena4 = ""
    }
    fun comparacion(dato1: String,l:String){
        Log.v("prueba"," escribi $dato1 definido $l")
        if (dato1==l){
            marcador=marcador+10
            Log.v("entro123"," ")
            limpiar()
            asignacion()
            limpiar()
            pts4.text= "Puntaje: "+marcador.toString()
            toast("Es correcto")
        }else if (dato1!=l){
            if (dato1.isEmpty()){
                pts4.text= "Puntaje: "+marcador.toString()
                toast("Es incorrecto")
                limpiar()
            }else{
                if (marcador>0){
                    marcador=marcador-2
                    if (marcador<0){
                        marcador=0
                    }
                }
            }
            pts4.text= "Puntaje: "+marcador.toString()
            toast("Es incorrecto")
            limpiar()
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
    private fun alerta() {
        val customDialog = Dialog(this)
        customDialog.setContentView(R.layout.instrucciones_bra_esp)
        customDialog.window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        customDialog.show()
    }
    override fun onBackPressed() {

        startActivity(Intent(this, Menu_Adivinanzas::class.java))
        Bungee.zoom(this)
    }
}