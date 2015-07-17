package com.student.oclass.activity;

import com.student.oclass.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * 账号充值
 * @author lanyj
 *
 */
public class PayAccountActivity extends BaseActivity implements OnClickListener{

	private Button btn_pay,btn_reset;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pay);
		initView();
		iv_title.setImageResource(R.drawable.money_pressed);
		tv_title.setText(getResources().getString(R.string.add_account));
	}
	private void initView(){
		iv_title=(ImageView)this.findViewById(R.id.iv_title);
		tv_title=(TextView)this.findViewById(R.id.tv_title);
		btn_back=(Button)this.findViewById(R.id.btn_back);
		btn_pay=(Button)this.findViewById(R.id.btn_pay);
		btn_pay.setOnClickListener(this);
		btn_back.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()) {
		case R.id.btn_pay:
			Intent intent=new Intent(PayAccountActivity.this,PayOkActivity.class);
			startActivity(intent);
			break;
		case R.id.btn_back:
			finish();
			break;	
		}
	}
}
