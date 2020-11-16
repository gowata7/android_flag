package org.techtown.a2b_1116;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    public final int REQUEST_CODE_MENU = 101;
    EditText edtId, edtPwd;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtId = findViewById(R.id.editId);
        edtPwd = findViewById(R.id.editPwd);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = edtId.getText().toString();
                String pwd = edtPwd.getText().toString();
                Log.d("2B","ID:"+id+",PWD:"+pwd);
                if(id.equals("") || pwd.equals("")){
                    Toast.makeText(getApplicationContext(),"아이디와 비밀번호를 입력하세요!",Toast.LENGTH_LONG).show();
                }else{
                    Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivityForResult(intent,REQUEST_CODE_MENU);
                }
            }
        });
    }
}
