package etec.com.br.etecapfqproapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.file.Files;

public class ConcentracaoSimplesActivity extends AppCompatActivity {


    private Button calcularConcentracao;
    private Button limparConcentracao;
    private EditText massaConcentracaoSimples;
    private EditText volumeConcentracaoSimples;
    private TextView concentracaoSimples;
    String massaDigitada;
    String volumeDigitado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concentracao_simples);

        calcularConcentracao = (Button) findViewById(R.id.buttonCalcularConcentracaoSimples);
        limparConcentracao = (Button) findViewById(R.id.buttonLimparConcentracaoSimples);
        massaConcentracaoSimples = (EditText) findViewById(R.id.editTextMassaConcentracaoSimples);
        volumeConcentracaoSimples = (EditText) findViewById(R.id.editTextVolumeConcentracaoSimples);
        concentracaoSimples = (TextView) findViewById(R.id.textView2);



        calcularConcentracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                massaDigitada = massaConcentracaoSimples.getText().toString();
                String massa = massaDigitada.replaceAll(",",".");
                volumeDigitado = volumeConcentracaoSimples.getText().toString();
                String volume = volumeDigitado.replaceAll(",",".");

                if((massaDigitada.isEmpty())&&(volumeDigitado.isEmpty())) {

                    massaConcentracaoSimples.setText("Informe a massa!");
                    volumeConcentracaoSimples.setText("Informe o volume!");

                }else{

                    double massaD = Double.parseDouble(massa);
                    double volumeD = Double.parseDouble(volume);
                    double concentracaoSimplesD = (massaD/volumeD);

                    concentracaoSimples.setText("Concentração Simples: "+concentracaoSimplesD+"g/L");
                }

            }
        });

        limparConcentracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                massaConcentracaoSimples.setText("");
                volumeConcentracaoSimples.setText("");
                concentracaoSimples.setText("");

            }
        });

    }
}
