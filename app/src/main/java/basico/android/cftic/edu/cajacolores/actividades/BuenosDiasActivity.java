package basico.android.cftic.edu.cajacolores.actividades;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import basico.android.cftic.edu.cajacolores.R;

public class BuenosDiasActivity extends AppCompatActivity implements Animation.AnimationListener{


    private void ocultarStatusBar ()
    {
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buenos_dias);
        ocultarStatusBar();

        View v = findViewById(R.id.marco_anim);
        Animation a = AnimationUtils.loadAnimation(this, R.anim.animacion_view);
        a.setAnimationListener(this);
        v.startAnimation(a);


    }


    @Override
    public void onAnimationEnd(Animation animation) {
        Log.d("MENSAJE", "onAnimationEnd");

        ImageView iangel = (ImageView)findViewById(R.id.angelito);
        iangel.setVisibility(View.INVISIBLE);

    }

    @Override
    public void onAnimationStart(Animation animation) {
        Log.d("MENSAJE", "onAnimationStart");
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        Log.d("MENSAJE", "onAnimationRepeat");

    }
}
