package com.jikexueyuan.game2048;

import android.content.Context;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;
/*
*卡片类
*在这里进行游戏卡片的自定义绘制
* */
public class Card extends FrameLayout {

	public Card(Context context) {
		super(context);
		/**自定义卡片属性*/
		label = new TextView(getContext());
		label.setTextSize(32);
		label.setBackgroundColor(0x33ffffff);
		label.setGravity(Gravity.CENTER);
		
		LayoutParams lp = new LayoutParams(-1, -1);
		lp.setMargins(10, 10, 0, 0);
		addView(label, lp);
		
		setNum(0);
	}



	/*Num的set、get方法*/
	private int num = 0;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
		
		if (num<=0) {
			label.setText("");
		}else{
			label.setText(num+"");
		}
	}

	/*
	* 定义一个equals方法，方便用于比较判断
	* */
	public boolean equals(Card o) {
		return getNum()==o.getNum();
	}

	private TextView label;
}
