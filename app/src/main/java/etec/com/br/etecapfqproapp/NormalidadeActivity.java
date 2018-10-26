package etec.com.br.etecapfqproapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.github.rtoshiro.util.format.MaskFormatter;
import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

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
        resultadoNormalidade = (TextView) findViewById(R.id.textView3);
        equivalenteNormalidade = (EditText) findViewById(R.id.editTextEquivalente);
        volumeNormalidade = (EditText) findViewById(R.id.editTextVolumeNormalidade);


        buttonCalcularNormalidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                volumeDigitado = volumeNormalidade.getText().toString();
                String volume = volumeDigitado.replaceAll(",",".");
                equivalenteDigitado = equivalenteNormalidade.getText().toString();
                String equivalente = equivalenteDigitado.replaceAll(",",".");

                if((volumeDigitado.isEmpty())&&(equivalenteDigitado.isEmpty())) {

                    equivalenteNormalidade.setText("Informe seu equivalente!");
                    volumeNormalidade.setText("Informe seu volume!");

                }else{

                    double equivalenteT = Double.parseDouble(equivalente);
                    double volumeT = Double.parseDouble(volume);
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
