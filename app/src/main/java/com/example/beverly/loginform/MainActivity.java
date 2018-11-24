package com.example.beverly.loginform;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user;
    EditText pass;
    Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbtn = (Button) findViewById(R.id.btn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                user = (EditText) findViewById(R.id.txtuname);
                pass = (EditText) findViewById(R.id.txtpassw);

                String myusername = user.getText().toString();
                String mypassword = pass.getText().toString();

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);

                if((myusername.equals("admin")) && mypassword.equals("admin123")){
                    Toast.makeText(MainActivity.this, "Success",
                            Toast.LENGTH_SHORT).show();
                }//end if
                else if((myusername.equals(""))){
                    Toast.makeText(MainActivity.this, "Username can not be empty!",
                            Toast.LENGTH_SHORT).show();
                }//end if
                else if((mypassword.equals(""))){
                    Toast.makeText(MainActivity.this, "Password can not be empty!",
                            Toast.LENGTH_SHORT).show();
                }//end if
                else{
                    Toast.makeText(MainActivity.this, "Failed!",
                            Toast.LENGTH_SHORT).show();
                }//end of else

            }
        });
    }
}
