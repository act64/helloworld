package com.example.broadcastbestpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {

	TextView tvAccount;
	TextView tvPassword;
	Button loginBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		tvAccount=(TextView) findViewById(R.id.account_edittext);
		tvPassword=(TextView) findViewById(R.id.password_edittext);
		loginBtn=(Button) findViewById(R.id.login_button);
		loginBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			String account=tvAccount.getText().toString();
			String password=tvPassword.getText().toString();
			if (account.equals("act64")&&password.equals("1234")) {
				Intent i=new Intent(LoginActivity.this,MainActivity.class);
				startActivity(i);
				finish();
			}
			else {
				Toast.makeText(getApplicationContext(), "account or password invalid", Toast.LENGTH_SHORT).show();
			}
			}
		});
	}
}
