package com.example.newcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MulActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1;
    TextView tx;
    String GetNum1,GetNum2,reslt;
    int a,b,mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mul);
        e1=(EditText) findViewById(R.id.nm1);
        e2=(EditText) findViewById(R.id.nm2);
        b1=(Button) findViewById(R.id.multiply);
        tx=(TextView) findViewById(R.id.res);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GetNum1=e1.getText().toString();
                GetNum2=e2.getText().toString();
                a=Integer.parseInt(GetNum1);
                b=Integer.parseInt(GetNum2);
                mul=a*b;
                reslt=String.valueOf(mul);
                Toast.makeText(getApplicationContext(),reslt,Toast.LENGTH_LONG).show();
                tx.setText(reslt);

            }
        });
    }
}