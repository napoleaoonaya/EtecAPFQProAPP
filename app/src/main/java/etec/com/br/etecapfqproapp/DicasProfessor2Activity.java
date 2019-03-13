package etec.com.br.etecapfqproapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DicasProfessor2Activity extends AppCompatActivity {

    private EditText mAcido;
    private EditText vAcido;
    private TextView mBase;
    private EditText vBase;
    private EditText fcReal;
    private TextView fcTeorico;
    private TextView mReal;
    private Button btnCalcular;
    private Button btnLimpar;
    String mAcidoDigitado;
    String vAcidoDigitado;
    String vBaseDigitado;
    String fcRealDigitado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicas_professor2);

        btnCalcular = (Button) findViewById(R.id.buttonCalcPadraoNaOH);
        btnLimpar = (Button) findViewById(R.id.buttonLimpPadraoNaOH);
        mAcido = (EditText) findViewById(R.id.editTextMacido);
        vAcido = (EditText) findViewById(R.id.editTextVacido);
        mBase = (TextView) findViewById(R.id.textViewMbase);
        vBase = (EditText) findViewById(R.id.editTextVbase);
        fcReal = (EditText) findViewById(R.id.editTextFreal);
        fcTeorico = (TextView) findViewById(R.id.textViewFcTeo);
        mReal = (TextView) findViewById(R.id.textViewMrealBase);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                mAcidoDigitado = mAcido.getText().toString();
                String mAcidoS = mAcidoDigitado.replaceAll(",",".");

                vAcidoDigitado = vAcido.getText().toString();
                String vAcidoS = vAcidoDigitado.replaceAll(",",".");

                vBaseDigitado = vBase.getText().toString();
                String vBaseS = vBaseDigitado.replaceAll(",",".");

                fcRealDigitado = fcReal.getText().toString();
                String fcRealS = fcRealDigitado.replaceAll(",",".");

                if((mAcidoDigitado.isEmpty())&&(vAcidoDigitado.isEmpty())&&(vBaseDigitado.isEmpty())&&(fcRealDigitado.isEmpty())){
                    mAcido.setText("");
                    vAcido.setText("");
                    vBase.setText("");
                    fcReal.setText("");
                }else{
                    double mAcidoD = Double.parseDouble(mAcidoS);
                    double vAcidoD = Double.parseDouble(vAcidoS);
                    double vBaseD = Double.parseDouble(vBaseS);
                    double mBaseD = (mAcidoD*vAcidoD)/vBaseD;
                    double fcRealD = Double.parseDouble(fcRealS);

                    mAcido.setText("M(ácido):"+mAcidoD);
                    vAcido.setText("V(ácido):"+vAcidoD);
                    mBase.setText("M(base):"+mBaseD);
                    vBase.setText("V(base):"+vBaseD);
                    fcReal.setText("Fc(real):"+fcRealD);

                    fcTeorico.setText("Fc(teórico):"+mBaseD);

                    double mRealBase = fcRealD/mBaseD;

                    mReal.setText("M(real base):"+mRealBase);

                }


            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAcido.setText("");
                vAcido.setText("");
                mBase.setText("");
                vBase.setText("");
                fcReal.setText("");
                fcTeorico.setText("");
                mReal.setText("");
            }
        });


    }
}

