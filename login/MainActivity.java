package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    Button btn;
    TextView t1;
    TextView t2;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.editText3);
        e2=(EditText) findViewById(R.id.editText4);
        btn=(Button) findViewById(R.id.login);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){
                if(e1.getText().toString().equals("admin")&&e2.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(),"Login successful",Toast.LENGTH_SHORT).show();

                }
                else{

                    Toast.makeText(getApplicationContext(),"Wrong Credentials",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
