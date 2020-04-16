package id.yongki.edu.tugas2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {
    Storage storage;

    @BindView(R.id.nama_textview) TextView tnama;
    @BindView(R.id.bloodtype_textview) TextView tblood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        storage = new Storage(getSharedPreferences(Storage.STORAGE_NAME, Context.MODE_PRIVATE));
        tnama.setText(storage.getUsername());
        tblood.setText("Blood Type : "+storage.getBloodtype());
    }
}
