package com.jikexueyuan.game2048;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/*
* 应用入口程序
* 加载游戏布局
* 界面待优化
* */
public class MainActivity extends Activity {
	
	public MainActivity() {
		mainActivity = this;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tvScore = (TextView) findViewById(R.id.tvScore);
	}



	/*
	* 清空成绩
	* */
	public void clearScore(){
		score = 0;
		showScore();
	}


	public void showScore(){
		tvScore.setText(score+"");
	}
	
	public void addScore(int s){
		score+=s;
		showScore();
	}

	private int score = 0;
	private TextView tvScore;
	
	private static MainActivity mainActivity = null;
	
	public static MainActivity getMainActivity() {
		return mainActivity;
	}

}
