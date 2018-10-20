package etec.com.br.etecapfqproapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    //Criando o atributo buttonStart da classe Button
    private Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //Atribuindo o ID do componente button ao atributo buttonStart
        buttonStart = (Button) findViewById(R.id.buttonIniciar);

        //Método para mudar de activity
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //A classe Intent espera dois parametros a origem activity principal eo destino activity.class
                startActivity(new Intent(StartActivity.this, IntegrantesActivity.class));

            }
        });

    }
}
