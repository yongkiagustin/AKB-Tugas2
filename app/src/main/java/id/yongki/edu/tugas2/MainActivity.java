package id.yongki.edu.tugas2;
//NAMA : YONGKI AGUSTIN
//KELAS : IF6K
//DESKRIPSI PEKERJAAN :
//- MINGGU 12 APRIL 2020 19:40 LAYOUTING MAIN_ACTIVITY
//- MINGGU 12 APRIL 2020 20:10 LAYOUTING ACITIVITY_REGISTER
//- SENIN 13 APRIL 2020 09:10 LANJUT LAYOUTING ACITIVITY_REGISTER
//- SENIN 13 APRIL 2020 11:00 LAYOUTING ACITIVITY_ALMOST
//- SENIN 13 APRIL 2020 13:00 LAYOUTING ACITIVITY_VERIFY
//- SENIN 13 APRIL 2020 14:00 MEMBUAT INTENT VERIFY ACTIVITY DAN ALMOST ACIVITY
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import id.yongki.edu.tugas2.R;
import id.yongki.edu.tugas2.RegisterActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void register_TextView (View v){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
        finish();
    }
}
