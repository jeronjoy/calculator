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

public class addActivity extends AppCompatActivity {
EditText e1,e2;
Button b1;
TextView tx;
String GetNum1,GetNum2,reslt;
int a,b,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
       e1=(EditText) findViewById(R.id.num1);
       e2=(EditText) findViewById(R.id.num2);
       b1=(Button) findViewById(R.id.addition);
       tx=(TextView) findViewById(R.id.reslt);

b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        GetNum1=e1.getText().toString();
        GetNum2=e2.getText().toString();
        a=Integer.parseInt(GetNum1);
        b=Integer.parseInt(GetNum2);
        sum=a+b;
        reslt=String.valueOf(sum);
        Toast.makeText(getApplicationContext(),reslt,Toast.LENGTH_LONG).show();
tx.setText(reslt);

    }
});
    }
}