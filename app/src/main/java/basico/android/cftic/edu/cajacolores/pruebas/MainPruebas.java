package basico.android.cftic.edu.cajacolores.pruebas;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import basico.android.cftic.edu.cajacolores.dto.Puntacion;

public class MainPruebas {

    public static void main (String [] argumentos)
    {
        Puntacion puntacion = new Puntacion("Javi", 1);
        Puntacion puntacion1 = new Puntacion("Ana", 50);
        Puntacion puntacion2 = new Puntacion("Lucy", 22);

        List<Puntacion> lp = new ArrayList<Puntacion>(3);
        lp.add(puntacion);
        lp.add(puntacion1);
        lp.add(puntacion2);

        System.out.println("ANTES " + lp.toString());

        Collections.sort(lp);//ORDEN NATURAL
        System.out.println("Orden natural " + lp.toString());
        Collections.sort(lp, new ComparadorPuntuaciones());//ORDEN TOTAL

        System.out.println("Orden total " +lp.toString());
        /* System.out.println(puntacion.toString());
        //VAMOS A PASAR DE objeto puntacion A JSON --> SERIALIZAR
        Gson gson = new Gson();
        String str_puntacion = gson.toJson(puntacion);
        System.out.println(str_puntacion);
        //VAMOS A PASAR DE JSON a objeto puntación --> DESERIALIZAR
        Puntacion p2 = gson.fromJson(str_puntacion, Puntacion.class);
        System.out.println("p2 = " + p2.toString());*/
    }
}
