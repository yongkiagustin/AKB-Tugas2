package id.yongki.edu.tugas2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;


public class RegisterActivity extends AppCompatActivity {
    Storage storage;
    @BindView(R.id.username_edittext)
    EditText guname;
    @BindView(R.id.regis_btn)
    Button regisBtn;
    @BindView(R.id.sp_bloodtype)
    Spinner spBlood;
    @BindView(R.id.agree_chbox)
    CheckBox agreeCheckBox;
    @BindView(R.id.regis_toolbar)
    Toolbar toolbar;


    public void toastMsg(String msg) {

        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        setActionBar(toolbar);


        storage = new Storage((getSharedPreferences(Storage.STORAGE_NAME, Context.MODE_PRIVATE)));
        regisBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(agreeCheckBox.isChecked()){

                    String blood = spBlood.getSelectedItem().toString();
                    String name = guname.getText().toString();
                    storage.storeData(name, blood);
                    startActivity(new Intent(getApplicationContext(), AlmostActivity.class));
                }else
                    toastMsg("Sorry, you haven't agreed with our terms and conditions");
            }
        });


    }


    public void back_act(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
