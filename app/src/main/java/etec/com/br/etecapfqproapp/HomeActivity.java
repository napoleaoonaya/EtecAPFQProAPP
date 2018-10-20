package etec.com.br.etecapfqproapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    private ImageView imageInfo;
    private ImageView imageFormulas;
    private ImageView imageRendimento;
    private ImageView imageExcesso;
    private ImageView imageLimitante;
    private ImageView imageNotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Transição de tela para informações
        imageInfo = (ImageView) findViewById(R.id.imageViewInformacao);
        imageInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomeActivity.this, InformacaoActivity.class));

            }
        });

        //Transição de tela para fórmulas
        imageFormulas = (ImageView) findViewById(R.id.imageViewFormulas);
        imageFormulas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomeActivity.this, FormulasActivity.class));

            }
        });


        //Transição de tela para rendimento
        imageRendimento = (ImageView) findViewById(R.id.imageViewRendimento);
        imageRendimento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomeActivity.this, RendimentoActivity.class));

            }
        });

        //Transição de tela excesso
        imageExcesso = (ImageView) findViewById(R.id.imageViewExcesso);
        imageExcesso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomeActivity.this, ExcessoActivity.class));

            }
        });


        //Transição de tela limitante
        imageLimitante = (ImageView) findViewById(R.id.imageViewLimitante);
        imageLimitante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomeActivity.this, LimitanteActivity.class));

            }
        });

        //Transição de tela notas
        imageNotas = (ImageView) findViewById(R.id.imageViewNotas);
        imageNotas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomeActivity.this, NotasActivity.class));

            }
        });


    }
}
