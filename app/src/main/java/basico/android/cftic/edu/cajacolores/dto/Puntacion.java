package basico.android.cftic.edu.cajacolores.dto;

import basico.android.cftic.edu.cajacolores.util.Preferencias;

public class Puntacion implements Comparable{

    private String nombre;
    private long tiempo;

    @Override
    public int compareTo(Object o) {
        //tengo que comparar this y o
        int comparacion = 0;
        Puntacion p1 = null;

            p1 = (Puntacion)o;
            //comparacion = (int)this.getTiempo()-(int)p1.getTiempo();
            comparacion = this.nombre.compareTo(p1.nombre);

        return comparacion;
    }

    public Puntacion(String nombre, long tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public Puntacion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }


    @Override
    public String toString() {
        return "Puntacion{" +
                "nombre='" + nombre + '\'' +
                ", tiempo=" + tiempo +
                '}';
    }


}
