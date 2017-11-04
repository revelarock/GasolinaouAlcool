package gasolinaoualcool.abctech.com.gasolinaoualcool;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.precoAlcoolId);
        precoGasolina = (EditText) findViewById(R.id.precoGasolinaId);
        textoResultado = (TextView) findViewById(R.id.textoResultadoId);
        botaoVerificar = (Button) findViewById(R.id.botaoVerificarId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Recuperar valores Digitados

                String textoAlcool = precoAlcool.getText().toString();
                String textoGasolina = precoGasolina.getText().toString();

                //converter valores String para números

                Double valorAlcool = Double.parseDouble(textoAlcool);
                Double valorGasolina =Double.parseDouble(textoGasolina);

                // Formula para dividir ( Alcool / Gasolina)

                double resultado = valorAlcool / valorGasolina;

                if (resultado >= 0.7) {
                    // compensa Gasolina
                    textoResultado.setText ("Melhor utilizar Gasolina");

                }else {
                    // Compensa Alcool
                    textoResultado.setText("Melhor utilizar Álcool");

                }

            }
        });








    }
}
