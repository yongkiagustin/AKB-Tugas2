package id.yongki.edu.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AlmostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);

    }
    public void verify_btn (View v){
        Intent intent = new Intent(this, VerifyActivity.class);
        startActivity(intent);
        finish();
    }
}
