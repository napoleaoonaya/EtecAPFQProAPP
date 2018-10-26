package etec.com.br.etecapfqproapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static etec.com.br.etecapfqproapp.R.*;

public class ConcentracaoMolarActivity extends AppCompatActivity {

    private Button calcularConcentracaoMolar;
    private Button limparConcentracaoMolar;
    private EditText editTextMassa;
    private EditText editTextVolume;
    private EditText editTextMassaMolar;
    private TextView concentracaoMolar;
    String massaDigitada;
    String volumeDigitado;
    String massaMolarDigitada;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_concentracao_molar);



        calcularConcentracaoMolar = (Button) findViewById(R.id.buttonCalcularConcentracaoMolar);
        limparConcentracaoMolar = (Button) findViewById(R.id.buttonLimparConcentracaoMolar);
        editTextMassa = (EditText) findViewById(R.id.editTextMassaConcentracaoMolarTC);
        editTextVolume = (EditText) findViewById(R.id.editTextVolumeConcentracoMolarTC);
        editTextMassaMolar = (EditText) findViewById(R.id.editTextMassaMolarConcentracaoMolarTC);
        concentracaoMolar = (TextView) findViewById(R.id.textViewConcentracaoMolarResultado);



        calcularConcentracaoMolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                massaDigitada = editTextMassa.getText().toString();
                String massa = massaDigitada.replaceAll(",",".");
                volumeDigitado = editTextVolume.getText().toString();
                String volume = volumeDigitado.replaceAll(",",".");
                massaMolarDigitada = editTextMassaMolar.getText().toString();
                String massaMolar = massaMolarDigitada.replaceAll(",",".");

                if((massaDigitada.isEmpty())&&(volumeDigitado.isEmpty())&&(massaMolarDigitada.isEmpty())) {

                    editTextMassa.setText("Informe a massa!");
                    editTextVolume.setText("Informe o volume!");
                    editTextMassaMolar.setText("Informe a massa molar!");

                }else{

                    double massaD = Double.parseDouble(massa);
                    double volumeD = Double.parseDouble(volume);
                    double massaMolarD = Double.parseDouble(massaMolar);
                    double concentracaoMolarD = (massaD/(massaMolarD*volumeD));

                    concentracaoMolar.setText("Concentração Molar: "+concentracaoMolarD+"mol/L");
                }

            }
        });

        limparConcentracaoMolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editTextMassa.setText("");
                editTextVolume.setText("");
                editTextMassaMolar.setText("");
                concentracaoMolar.setText("");

            }
        });
    }
}
