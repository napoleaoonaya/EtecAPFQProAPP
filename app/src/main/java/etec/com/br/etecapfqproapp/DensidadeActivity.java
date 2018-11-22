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
    private Button buttonCalcular7;
    private Button buttonCalcular8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_densidade);

         editTextMassa = (EditText) findViewById(R.id.editTextMassaDensidade);
         editTextVolume = (EditText) findViewById(R.id.editTextVolumeDensidade);
         textViewDensidade = (TextView) findViewById(R.id.txtDensidadeResultado);

         buttonCalcular7 = (Button) findViewById(R.id.button7);

         buttonCalcular7.setOnClickListener(new View.OnClickListener() {

             String massaDigitada = editTextMassa.getText().toString();
             String massa = massaDigitada.replaceAll(",", ".");
             String volumeDigitado = editTextVolume.getText().toString();
             String volume = volumeDigitado.replaceAll(",", ".");

             @Override
             public void onClick(View v){


                 if ((massaDigitada.isEmpty()) && (volumeDigitado.isEmpty())) {

                     editTextMassa.setText("Informe sua massa!");
                     editTextVolume.setText("Informe seu volume!");

                 } else {

                     double massaD = Double.parseDouble(massa);
                     double volumeD = Double.parseDouble(volume);
                     double densidade = (massaD/volumeD);

                     textViewDensidade.setText("Densidade: "+densidade+"g/cm³");
                 }
             }

         });

         buttonCalcular8 = (Button) findViewById(R.id.button8);
         buttonCalcular8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){

                editTextMassa.setText("");
                editTextVolume.setText("");
                textViewDensidade.setText("");
            }
        });
    }
}
