package rithual.company.prueba7;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
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
    @BindView(R.id.button_save)
    MaterialButton buttonSave;
    @BindView(R.id.container)
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.button_save)
    public void saveData() {

    }
}
