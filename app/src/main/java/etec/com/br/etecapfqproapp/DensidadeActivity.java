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

         editTextMassa = (EditText) findViewById(R.id.editText);
         editTextVolume = (EditText) findViewById(R.id.editText2);
         textViewDensidade = (TextView) findViewById(R.id.txtDensidadeResultado);

         buttonCalcular7 = (Button) findViewById(R.id.button7);

         buttonCalcular7.setOnClickListener(new View.OnClickListener() {

             String massa = editTextMassa.getText().toString();
             String massaD = massa.replaceAll(",", ".");
             String volume = editTextVolume.getText().toString();
             String volumeD = volume.replaceAll(",", ".");

             @Override
             public void onClick(View v){


                 if ((volume.isEmpty()) && (massa.isEmpty())) {

                     editTextMassa.setText("Informe sua massa!");
                     editTextVolume.setText("Informe seu volume!");

                 } else {

                     double massaT = Double.parseDouble(massaD);
                     double volumeT = Double.parseDouble(volumeD);
                     double densidadeT = (massaT/volumeT);

                     textViewDensidade.setText("Densidade: " + densidadeT + "g/cm³");
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
