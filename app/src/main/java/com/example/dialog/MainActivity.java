package com.example.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    public RelativeLayout relativeLayout;
    private ConstraintLayout layout;
    private Button button1;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
        Button bgButton = (Button) findViewById(R.id.button1);
        bgButton.setOnClickListener(this);


        layout = findViewById(R.id.layout);
    }
    @Override
    public void onClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final CharSequence[] items = {getText(R.string.violet), getText(R.string.blue), getText(R.string.green)};

        builder.setTitle(R.string.message);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                switch (i) {
                    case 0:
                        Toast.makeText(context, R.string.violet, Toast.LENGTH_LONG).show();
                        layout.setBackgroundResource(R.color.violetC);
                        break;
                    case 1:
                        Toast.makeText(context, R.string.blue, Toast.LENGTH_LONG).show();
                        layout.setBackgroundResource(R.color.blueC);
                        break;
                    case 2:
                        Toast.makeText(context, R.string.green, Toast.LENGTH_LONG).show();
                        layout.setBackgroundResource(R.color.greenC);
                        break;
                }

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }
}
