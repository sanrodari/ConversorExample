package com.example.conversor;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private Conversor conversor = new Conversor();
	private EditText entradaUsuario;
	private TextView resultado;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        entradaUsuario = (EditText) findViewById(R.id.campoTexto);
        resultado = (TextView) findViewById(R.id.resultado);
    }

    public void seleccionarBase(View view) {
    	switch (view.getId()) {
		case R.id.radioBinario:
			Log.i("Conversor", "Ha seleccionado binario");
			break;
			
		case R.id.radioOctal:
			Log.i("Conversor", "Ha seleccionado octal");
			break;
			
		case R.id.radioHexadecimal:
			Log.i("Conversor", "Ha seleccionado hexadecimal");
			break;

		default:
			break;
		}
    }
    
    public void convertir(View view) {
    	RadioButton binario = (RadioButton) findViewById(R.id.radioBinario);
    	RadioButton octal = (RadioButton) findViewById(R.id.radioOctal);
    	RadioButton hexadecimal = (RadioButton) findViewById(R.id.radioHexadecimal);
    	
    	String eu = entradaUsuario.getEditableText().toString();
    	
    	if(binario.isChecked()) {
    		Log.i("Conversor", "Se hace la conversion de binario a decimal");

    		long resultadoLong = conversor.convertirBinarioADecimal(eu);
    		resultado.setText("" + resultadoLong);
    	}
    	else if(octal.isChecked()) {
    		Log.i("Conversor", "Se hace la conversion de octal a decimal");
    		
    		long resultadoLong = conversor.convertirOctalADecimal(eu);
    		resultado.setText("" + resultadoLong);
    	}
    	else if(hexadecimal.isChecked()) {
    		Log.i("Conversor", "Se hace la conversion de hexadecimal a decimal");
    		
    		long resultadoLong = conversor.convertirHexadecimalADecimal(eu);
    		resultado.setText("" + resultadoLong);
    	}
    }

}
