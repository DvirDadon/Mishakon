package com.example.simulation.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button btnP;
Button btnE;
Button btnB;
Button btnS;
TextView textnum1;
TextView textnum2;
TextView textTOF;
int x=0;
int y=0;
Random rand=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnP= (Button)findViewById(R.id.btnP);
        btnE= (Button)findViewById(R.id.btnE);
        btnB= (Button)findViewById(R.id.btnB);
        btnS= (Button)findViewById(R.id.btnS);
        textnum1=(TextView)findViewById(R.id.textnum1);
        textnum2=(TextView)findViewById(R.id.textnum2);
        textTOF=(TextView)findViewById(R.id.textTOF);
    }


    public void btnrandom(View view) {
        x=rand.nextInt(300);
        y=rand.nextInt(300);
        textnum1.setText("The number is:"+x);
        textnum2.setText("The number is:"+y);
        textTOF.setText("True or False");

    }


    public void btnS(View view) {
        if(y>x)
      textTOF.setText("True");
        else if(x>y)
            textTOF.setText("False");
    }

    public void btnE(View view) {
        if(x==y)
            textTOF.setText("True");
        else if (x!=y)
            textTOF.setText("False");
    }

    public void btnB(View view) {
        if(x>y)
            textTOF.setText("True");
        else if(y>x)
            textTOF.setText("False");
    }
}
