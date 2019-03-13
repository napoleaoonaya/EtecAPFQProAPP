package etec.com.br.etecapfqproapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.file.Files;

public class DicasProfessorActivity extends AppCompatActivity {

    private EditText editTextPadraoAcidoConcentracao;
    private EditText editTextMassaMolarPadraoAcido;
    private EditText editTextVolumePadraoAcido;
    private EditText editTextTituloPadraoAcido;
    private EditText editTextDensidadeAcidoPadrao;
    private TextView textViewMassaPadraoAcidoSolucao;
    private TextView textViewMassaReal;
    private TextView textViewVolumeReal;
    private Button buttonCalcularMassa;
    private Button buttonLimpar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicas_professor);


        editTextPadraoAcidoConcentracao = (EditText) findViewById(R.id.editTextPadraoAcidoConcentracao);
        editTextMassaMolarPadraoAcido = (EditText) findViewById(R.id.editTextMassaMolarPadraoAcido);
        editTextVolumePadraoAcido = (EditText) findViewById(R.id.editTextVolumePadraoAcido);
        editTextTituloPadraoAcido = (EditText) findViewById(R.id.editTextTituloPadraoAcido);
        editTextDensidadeAcidoPadrao = (EditText) findViewById(R.id.editTextDensidadeAcidoPadrao);
        textViewMassaPadraoAcidoSolucao = (TextView) findViewById(R.id.textViewMassaPadraoAcidoSolucao);
        textViewMassaReal = (TextView) findViewById(R.id.textViewMassaReal);
        textViewVolumeReal = (TextView) findViewById(R.id.textViewVolumeReal);
        buttonCalcularMassa = (Button) findViewById(R.id.button9);
        buttonLimpar = (Button) findViewById(R.id.button10);

        buttonCalcularMassa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String concentracao =  editTextPadraoAcidoConcentracao.getText().toString();
                String concentracaoDig = concentracao.replaceAll(",",".");
                String massaMolar = editTextMassaMolarPadraoAcido.getText().toString();
                String massaMolarDig = massaMolar.replaceAll(",",".");
                String volume = editTextVolumePadraoAcido.getText().toString();
                String volumeDig = volume.replaceAll(",",".");
                String titulo = editTextTituloPadraoAcido.getText().toString();
                String tituloDig = titulo.replaceAll(",",".");
                String densidade = editTextDensidadeAcidoPadrao.getText().toString();
                String densidadeDig = densidade.replaceAll(",",".");

                if((concentracaoDig.isEmpty()
                        &&(massaMolarDig.isEmpty()))
                        &&(volumeDig.isEmpty())
                        &&(tituloDig.isEmpty())
                        &&(densidadeDig.isEmpty())){

                    editTextPadraoAcidoConcentracao.setText("");
                    editTextMassaMolarPadraoAcido.setText("");
                    editTextVolumePadraoAcido.setText("");
                    editTextTituloPadraoAcido.setText("");
                    editTextDensidadeAcidoPadrao.setText("");


                }else {

                    double volumeD = Double.parseDouble(volumeDig);
                    double volumeReal = (volumeD / 1000);

                    double concentracaoD = Double.parseDouble(concentracaoDig);
                    double massaMolarD = Double.parseDouble(massaMolarDig);

                    double massaD = concentracaoD * massaMolarD * volumeReal;

                    textViewMassaPadraoAcidoSolucao.setText("Massa:" + massaD + "g");

                    double tituloD = Double.parseDouble(tituloDig);
                    double tituloR = tituloD / 100;

                    double massaReal = tituloR * massaD;

                    textViewMassaReal.setText("Massa real:" + massaReal + "g");

                    double densidadeD = Double.parseDouble(densidadeDig);

                    double volumeRealPadrao = massaReal / densidadeD;

                    textViewVolumeReal.setText("Volume real:" + volumeRealPadrao + "ml");

                }

            }
        });

        buttonLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editTextPadraoAcidoConcentracao.setText("");
                editTextMassaMolarPadraoAcido.setText("");
                editTextVolumePadraoAcido.setText("");
                editTextTituloPadraoAcido.setText("");
                editTextDensidadeAcidoPadrao.setText("");
                textViewMassaPadraoAcidoSolucao.setText("");
                textViewMassaReal.setText("");
                textViewVolumeReal.setText("");


            }
        });

    }
}
