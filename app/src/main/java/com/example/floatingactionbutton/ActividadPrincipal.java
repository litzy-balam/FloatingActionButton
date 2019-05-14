package com.example.floatingactionbutton;

import android.animation.Animator;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

import com.github.fafaldo.fabtoolbar.widget.FABToolbarLayout;

public class ActividadPrincipal extends AppCompatActivity implements View.OnClickListener {
    //se crea una variable de tipo boleano para rotarlo al clikearlo
    //boolean click=false;
    //se crea variable para tranformar boton an toolbar
    private FABToolbarLayout morph;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // se agrega que sera de tipo final
         /*final*/  FloatingActionButton fab = findViewById(R.id.fab);
         // se agregan cambios pra transfromar el boton en toolbar
        morph=(FABToolbarLayout)findViewById(R.id.fabtoolbar);
         //cambios para la animacion de escala en el botom
       /* fab.setScaleX(0);
        fab.setScaleY(0);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){
            final Interpolator interpolator= AnimationUtils.loadInterpolator(getBaseContext(),android.R.interpolator.fast_out_slow_in);
            fab.animate()
                    .scaleX(1)
                    .scaleY(1)
                    .setInterpolator(interpolator)
                    .setDuration(600)
                    .setStartDelay(1000)
                    .setListener(new Animator.AnimatorListener() {
                        @Override
                        public void onAnimationStart(Animator animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animator animation) {
                            fab.animate()
                                    .scaleY(0)
                                    .scaleX(0)
                                    .setInterpolator(interpolator)
                                    .setDuration(600)
                                    .start();
                        }

                        @Override
                        public void onAnimationCancel(Animator animation) {

                        }

                        @Override
                        public void onAnimationRepeat(Animator animation) {

                        }
                    });
        }*/
       // se crea cambios para animacion rotar al clickearlo
        //fab.setImageResource(android.R.drawable.ic_menu_add);
        View uno,dos,tres,cuatro;
        uno=findViewById(R.id.uno);
        dos=findViewById(R.id.dos);
        tres=findViewById(R.id.tres);
        cuatro=findViewById(R.id.cuatro);
        //se hace cambios en fab.setOnClickListener( new View.OnClickListener()

        fab.setOnClickListener(this);
        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        cuatro.setOnClickListener(this);
        /*
        * fab.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Se presiono el FAB", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
      /*  click=!click;
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){
            Interpolator interpolator=AnimationUtils.loadInterpolator(getBaseContext(),android.R.interpolator.fast_out_slow_in);
            view.animate()
                    .rotation(click?45f:0)
                    .setInterpolator(interpolator)
                    .start();
        }
    }
});
        *
        *
        * */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.fab){
            morph.show();
        }
        morph.hide();
    }
}
