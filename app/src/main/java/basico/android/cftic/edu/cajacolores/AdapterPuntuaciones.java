package basico.android.cftic.edu.cajacolores;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;

import android.support.v7.widget.RecyclerView.Adapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import basico.android.cftic.edu.cajacolores.actividades.DetalleRecordActivity;
import basico.android.cftic.edu.cajacolores.dto.Puntacion;
import basico.android.cftic.edu.cajacolores.dto.PuntuacionParcelable;

public class AdapterPuntuaciones
        extends RecyclerView.Adapter<PuntuacionHolder> implements View.OnClickListener{

    private List<Puntacion> datos;


    /**
     * ESTE MÉTODO CREA LAS CAJAS / ITEMS QUE ALBERGARÁ LA INFORMACIÓN
     * DE CADA REGISTRO / ELEMENTO. CREAMOS LA VISTA (LA CAJA)
     *
     * @param parent la propia lista, el RecyclerView
     * @param viewType
     * @return
     */
    @Override
    public PuntuacionHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        PuntuacionHolder puntuacionHolder = null;

            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View itemView = inflater.inflate(R.layout.fila_record, parent, false);
            itemView.setOnClickListener(this);//asociaría el listener
            puntuacionHolder = new PuntuacionHolder(itemView);

        return puntuacionHolder;
    }

    //Al holder, le meto la info de item que toca
    @Override
    public void onBindViewHolder(PuntuacionHolder holder, int position) {

        Puntacion puntacion = datos.get(position);
        holder.cargarPuntuacion(puntacion);

    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public AdapterPuntuaciones (List<Puntacion> lista_puntuaciones)
    {
        this.datos = lista_puntuaciones;
    }



    @Override
    public void onClick(View view) {
        Log.d("MIAPP", "Han tocado una fila");
        TextView caja_nombre = view.findViewById(R.id.nombre_jugador);
        TextView caja_tiempo = view.findViewById(R.id.tiempo_jugador);

        String nombre = caja_nombre.getText().toString();
        String str_tiempo = caja_tiempo.getText().toString();
        long tiempo = Long.parseLong(str_tiempo);//casting de String a long


        PuntuacionParcelable pp = new PuntuacionParcelable(nombre, tiempo);

        //Puntacion p = new Puntacion(nombre, tiempo);
        Intent i_detalle = new Intent(view.getContext(), DetalleRecordActivity.class);
        //i_detalle.putExtra("puntacion", p);
        i_detalle.putExtra("puntacion", pp);
        view.getContext().startActivity(i_detalle);

    }
}
