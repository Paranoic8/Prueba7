package rithual.company.prueba7;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.edt_nombre)
    TextInputEditText edtNombre;
    @BindView(R.id.txt_inputnombre)
    TextInputLayout txtInputnombre;
    @BindView(R.id.edt_apellido)
    TextInputEditText edtApellido;
    @BindView(R.id.txt_inputapellido)
    TextInputLayout txtInputapellido;
    @BindView(R.id.edt_telefono)
    TextInputEditText edtTelefono;
    @BindView(R.id.txt_inputtelefono)
    TextInputLayout txtInputtelefono;
    @BindView(R.id.container)
    LinearLayout container;
    @BindView(R.id.button_save)
    Button buttonSave;
    @BindView(R.id.switch1)
    Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }


    @OnClick(R.id.button_save)
    public void saveData() {

        View view=this.getCurrentFocus();
        if (view!=null){
            InputMethodManager inputMethodManager=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0);
        }

        if (switch1.isChecked()) {
            Toast.makeText(this, "Guardando Datos", Toast.LENGTH_SHORT).show();
        } else {
            Snackbar.make(container, "Aceptar terminos y condiciones", Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch1.setChecked(true);
                }
            }).show();
        }
    }


}
