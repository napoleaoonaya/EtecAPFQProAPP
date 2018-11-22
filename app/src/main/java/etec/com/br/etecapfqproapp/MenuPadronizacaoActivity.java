package etec.com.br.etecapfqproapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPadronizacaoActivity extends AppCompatActivity {

    private Button btn14;
    private Button btn15;
    private Button btn16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_padronizacao);

        btn14 = (Button) findViewById(R.id.button14);
        btn15 = (Button) findViewById(R.id.button15);
        btn16 = (Button) findViewById(R.id.button16);

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPadronizacaoActivity.this, DicasProfessorActivity.class));
            }
        });


        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPadronizacaoActivity.this, DicasProfessor2Activity.class));
            }
        });

    }
}
