package etec.com.br.etecapfqproapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DensidadeActivity extends AppCompatActivity {

    private EditText editTextMassa;
    private EditText editTextVolume;
    private TextView textViewDensidade;
    private Button buttonCalcDensidade;
    private Button buttonLimpDensidade;
    String massaDigitada;
    String volumeDigitado;
    String densidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_densidade);

         buttonLimpDensidade = (Button) findViewById(R.id.buttonLimparDensidade);
         buttonCalcDensidade = (Button) findViewById(R.id.buttonCalcularDensidade);
         editTextMassa = (EditText) findViewById(R.id.editTextMassaDensidade);
         editTextVolume = (EditText) findViewById(R.id.editTextVolumeDensidade);
         textViewDensidade = (TextView) findViewById(R.id.txtDensidadeResultado);


         buttonCalcDensidade.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 massaDigitada = editTextMassa.getText().toString();
                 String massa = massaDigitada.replaceAll(",",".");
                 volumeDigitado = editTextVolume.getText().toString();
                 String volume = volumeDigitado.replaceAll(",",".");

                 if((massaDigitada.isEmpty())&&(volumeDigitado.isEmpty())){

                     editTextMassa.setText("");
                     editTextVolume.setText("");

                 }else{

                     double massaD = Double.parseDouble(massa);
                     double volumeD = Double.parseDouble(volume);
                     double densidade = (massaD/volumeD);

                     textViewDensidade.setText("Densidade:"+densidade+"g/cm³");
                 }

             }
         });

         buttonLimpDensidade.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editTextMassa.setText("");
                 editTextVolume.setText("");
                 textViewDensidade.setText("");
             }
         });


    }
}
