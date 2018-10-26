package etec.com.br.etecapfqproapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumeroDeMolsActivity extends AppCompatActivity {

    private Button calcularNM;
    private Button limparNM;
    private EditText massaNM;
    private EditText massaMolarNM;
    private TextView resultadoNM;
    String massaDigitada;
    String massaMolarDigitada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_de_mols);

        calcularNM = (Button) findViewById(R.id.buttonCalcNMols);
        limparNM = (Button) findViewById(R.id.buttonLimparNM);
        massaNM = (EditText) findViewById(R.id.editTextMassaNMols2);
        massaMolarNM = (EditText) findViewById(R.id.editTextNumeroDeMolsMassaMolar2);
        resultadoNM = (TextView) findViewById(R.id.textView4);


        calcularNM.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                massaDigitada = massaNM.getText().toString();
                String massa = massaDigitada.replaceAll(",",".");
                massaMolarDigitada = massaMolarNM.getText().toString();
                String massaMolar = massaMolarDigitada.replaceAll(",",".");

                if((massaDigitada.isEmpty())&&(massaMolarDigitada.isEmpty())){

                    massaNM.setText("Informe a massa!");
                    massaMolarNM.setText("Informe a massa molar!");

                }else {

                    double massaNMD = Double.parseDouble(massa);
                    double massaMolarNMD = Double.parseDouble(massaMolar);
                    double resultadoNMD = (massaNMD/massaMolarNMD);

                    resultadoNM.setText("Número de mols: "+resultadoNMD+"mols");

                }

            }
        });

        limparNM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                massaNM.setText("");
                massaMolarNM.setText("");
                resultadoNM.setText("");

            }
        });

    }
}
