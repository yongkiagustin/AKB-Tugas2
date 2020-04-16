package id.yongki.edu.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.regis_toolbar);
        setActionBar(toolbar);
    }
    public void back_act (View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void regis_btn (View v){
        Intent intent = new Intent(this, AlmostActivity.class);
        startActivity(intent);
        finish();
    }
}
