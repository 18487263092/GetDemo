package com.example.duihk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button btnLogin;
	private Button btngb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent = new Intent(MainActivity.this,SecondActivity.class);
				startActivity(intent);
				overridePendingTransition(R.anim.scale_rotate_in,R.anim.alpha_out);
				
			}
		});
//        btngb=(Button)findViewById(R.id.btnClose);
//        btngb.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View arg0) {
//				Builder builder=new AlertDialog.Builder(MainActivity.this);
//				builder.setTitle("Xiao Xi Ti Shi");
//				builder.setMessage("Que Ding Tui Chu?");
//				builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//					
//					@Override
//					public void onClick(DialogInterface arg0, int arg1) {
//						// TODO Auto-generated method stub
//						finish();
//					}
//				});
//				builder.setNegativeButton("NO", null);
//				builder.create().show();
//			}
//        	
//        });
    }
}
