package basico.android.cftic.edu.cajacolores.actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import basico.android.cftic.edu.cajacolores.R;
import basico.android.cftic.edu.cajacolores.dto.Puntacion;

public class DetalleRecordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_record);
        Puntacion p = (Puntacion) getIntent().getExtras().get("puntacion");
        Log.d("MIAPP", "Puntuacion RX " + p.toString());
    }
}
