package basico.android.cftic.edu.cajacolores.pruebas;

import java.util.Comparator;

import basico.android.cftic.edu.cajacolores.dto.Puntacion;

public class ComparadorPuntuaciones implements Comparator<Puntacion> {

    @Override
    public int compare(Puntacion p1, Puntacion p2) {
        int orden = 0;
            orden = p1.getNombre().toLowerCase().compareTo(p2.getNombre().toLowerCase());
            if (orden == 0){
                orden = p1.compareTo(p2);
            }
        return orden;
    }
}
