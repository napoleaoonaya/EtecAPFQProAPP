package etec.com.br.etecapfqproapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EntalpiaActivity extends AppCompatActivity {

    private EditText quantidadeProdutos;
    private EditText substancia;
    private EditText valorProduto;
    private EditText indiceProduto;
    private Button button11;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entalpia);

        quantidadeProdutos = (EditText) findViewById(R.id.editTextQuantidadeProdutos);
        valorProduto = (EditText) findViewById(R.id.editTextValorProdutos);
        indiceProduto = (EditText) findViewById(R.id.editTextIndiceProduto);
        substancia = (EditText) findViewById(R.id.editTextSubstancia);

        button11 = (Button) findViewById(R.id.button11);

        textView = (TextView) findViewById(R.id.textViewQuantidadeProdutos);

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String quantidadeP = quantidadeProdutos.getText().toString();
                int quantidadeDigitada = Integer.parseInt(quantidadeP);
                int contador = 0;


                double valorC = 0;
                double valorS = 0;

                while(contador<quantidadeDigitada){

                    String resposta = substancia.getText().toString();

                    if(resposta.contentEquals("simples")){
                        String valorSimples = valorProduto.getText().toString();
                        valorS = Double.parseDouble(valorSimples);
                        valorS = (0*valorS) + 1;

                    }else{
                        String indiceDigitado = indiceProduto.getText().toString();
                        int indiceConvertido = Integer.parseInt(indiceDigitado);

                        String valorComposta = valorProduto.getText().toString();
                        valorC = Double.parseDouble(valorComposta);

                        valorC = (indiceConvertido*(valorC)) + 1;

                    }

                    contador++;
                }

                textView.setText("Resultado: "+(valorC+valorS));

            }
        });

    }
}
