package basico.android.cftic.edu.cajacolores;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import basico.android.cftic.edu.cajacolores.actividades.NombreActivity;

public class IncioMovilReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        //throw new UnsupportedOperationException("Not yet implemented");
        Log.d("MIAPP", "Se ha encendido el dispositivo");
        //Intent i = new Intent(context, NombreActivity.class);
        //context.startActivity(i);
        NotificaMensajeBuenosDias.lanzarNotificiacion(context);
    }
}
