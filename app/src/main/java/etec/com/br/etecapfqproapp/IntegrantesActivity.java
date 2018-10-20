package etec.com.br.etecapfqproapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntegrantesActivity extends AppCompatActivity {

    private Button buttonIntegrantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integrantes);

        buttonIntegrantes = (Button) findViewById(R.id.buttonIntegrantes);

        buttonIntegrantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(IntegrantesActivity.this, LoginActivity.class));

            }
        });
    }
}
