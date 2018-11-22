package etec.com.br.etecapfqproapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DicasProfessor2Activity extends AppCompatActivity {

    private EditText molaridadeAcido;
    private EditText volumeAcido;
    private EditText molaridadeBase;
    private EditText volumeBase;
    private TextView molaridadeRealBase;
    private EditText fatorCorrecaoReal;
    private TextView fatorCorrecaoTeorico;
    private Button btnCalcular;
    private Button btnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicas_professor2);


        molaridadeAcido = (EditText) findViewById(R.id.editText5);
        volumeAcido = (EditText) findViewById(R.id.editText6);

        molaridadeBase= (EditText) findViewById(R.id.editText3);
        volumeBase = (EditText) findViewById(R.id.editText7);

        fatorCorrecaoReal = (EditText) findViewById(R.id.editText8);
        fatorCorrecaoTeorico = (TextView) findViewById(R.id.textView18);

        molaridadeRealBase = (TextView) findViewById(R.id.textView19);

        btnCalcular = (Button) findViewById(R.id.button12);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String molaridadeAcidoD = molaridadeAcido.getText().toString();
                String volumeAcidoD = volumeAcido.getText().toString();

                String molaridadeBaseD = molaridadeBase.getText().toString();
                String volumeBaseD = volumeBase.getText().toString();

                String fatorCorrecaoRealD = fatorCorrecaoReal.getText().toString();


                if((molaridadeAcidoD.isEmpty())&&(volumeAcidoD.isEmpty())&&(molaridadeBaseD.isEmpty())&&(volumeBaseD.isEmpty())&&(fatorCorrecaoRealD.isEmpty())){

                    molaridadeAcido.setText("Informe a molaridade do ácido");
                    volumeAcido.setText("Informe o volume do ácido");

                    molaridadeBase.setText("Informe a molaridade do base");
                    volumeBase.setText("Informe o volume do base");

                    fatorCorrecaoReal.setText("Informe o fator de correção real");

                }else{

                    String molaridadeAcidoRep = molaridadeAcidoD.replaceAll(",",".");
                    String volumeAcidoRep = volumeAcidoD.replaceAll(",",".");
                    String molaridadeBaseRep = molaridadeBaseD.replaceAll(",",".");
                    String volumeBaseRep = volumeBaseD.replaceAll(",",".");
                    String fatorCorrecaoRealRep = fatorCorrecaoRealD.replaceAll(",",".");

                    double molaridadeAcidoDo = Double.parseDouble(molaridadeAcidoRep);
                    double volumeAcidoDo = Double.parseDouble(volumeAcidoRep);

                    double molaridadeBaseDo = Double.parseDouble(molaridadeBaseRep);
                    double volumeBaseDo = Double.parseDouble(volumeBaseRep);

                    double fatorCorrecaoRealDo = Double.parseDouble(fatorCorrecaoRealRep);


                    double fatorCorrecaoTeoricoDo = (molaridadeBaseDo*volumeBaseDo)/(molaridadeAcidoDo*volumeAcidoDo);

                    fatorCorrecaoTeorico.setText("Fc (teórico): "+fatorCorrecaoTeoricoDo);

                    double molaridadeRealBaseDo = (fatorCorrecaoRealDo/fatorCorrecaoTeoricoDo);

                    molaridadeRealBase.setText("M real (base): "+molaridadeRealBaseDo+"mol/l");


                }

            }
        });



        btnLimpar = (Button) findViewById(R.id.button13);

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                molaridadeAcido.setText("");
                volumeAcido.setText("");
                molaridadeBase.setText("");
                volumeBase.setText("");
                fatorCorrecaoReal.setText("");
                fatorCorrecaoTeorico.setText("");
                molaridadeRealBase.setText("");
            }
        });



    }
}
