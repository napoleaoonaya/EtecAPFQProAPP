package etec.com.br.etecapfqproapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormulasActivity extends AppCompatActivity {

    private Button buttonFormulasCalculos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulas);

        buttonFormulasCalculos = (Button) findViewById(R.id.buttonFormCalc);

        buttonFormulasCalculos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(FormulasActivity.this, CalculosActivity.class));


            }
        });

    }
}
