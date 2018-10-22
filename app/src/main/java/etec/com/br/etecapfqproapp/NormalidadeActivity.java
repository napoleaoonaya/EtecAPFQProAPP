package etec.com.br.etecapfqproapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NormalidadeActivity extends AppCompatActivity {


    private Button buttonCalcularNormalidade;
    private Button buttonLimparNormalidade;
    private EditText volumeNormalidade;
    private EditText equivalenteNormalidade;
    private TextView resultadoNormalidade;
    String volumeDigitado;
    String equivalenteDigitado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normalidade);

        buttonCalcularNormalidade = (Button) findViewById(R.id.buttonCalcularNormalidade);
        buttonLimparNormalidade = (Button) findViewById(R.id.buttonLimparNormalidade);
        volumeNormalidade = (EditText) findViewById(R.id.editTextVolumeNormalidade);
        equivalenteNormalidade = (EditText) findViewById(R.id.editTextEquivalente);
        resultadoNormalidade = (TextView) findViewById(R.id.textView3);

        buttonCalcularNormalidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                volumeDigitado = volumeNormalidade.getText().toString();
                equivalenteDigitado = equivalenteNormalidade.getText().toString();

                if((volumeDigitado.isEmpty())&&(equivalenteDigitado.isEmpty())) {

                    equivalenteNormalidade.setText("Informe seu equivalente!");
                    volumeNormalidade.setText("Informe seu volume!");

                }else{

                    double equivalenteT = Double.parseDouble(equivalenteDigitado);
                    double volumeT = Double.parseDouble(volumeDigitado);
                    double resultadoNormalidadeResp = (equivalenteT/volumeT);

                    resultadoNormalidade.setText("Normalidade: "+resultadoNormalidadeResp+"N");
                }

            }
        });


        buttonLimparNormalidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                volumeNormalidade.setText("");
                equivalenteNormalidade.setText("");
                resultadoNormalidade.setText("");

            }
        });

    }
}
