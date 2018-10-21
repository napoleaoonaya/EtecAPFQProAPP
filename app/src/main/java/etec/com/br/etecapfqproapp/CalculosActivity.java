package etec.com.br.etecapfqproapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalculosActivity extends AppCompatActivity {

    private Button buttonConcentracaoSimples;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos);


        buttonConcentracaoSimples = (Button) findViewById(R.id.button);


        buttonConcentracaoSimples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(CalculosActivity.this, ConcentracaoSimplesActivity.class));


            }
        });


    }
}