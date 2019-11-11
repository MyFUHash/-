package 计算器2bao3;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Xin1 extends Frame{
	public static void main(String[] args) {
		final double  PI = 3.141592657;
		
		final Frame jf = new Frame("计算器");     
		jf.setSize(350,400);        //设置窗口长度
		jf.setResizable(false);     //设置窗体大小不可更改
		jf.setLayout(null);         //组件不会随窗口的大小而改变
		//添加文本框
		final JTextField jt1 = new JTextField();	
		jt1.setHorizontalAlignment(JTextField.RIGHT);    //设置文本框右对齐
		jt1.setEditable(false);          //设置文本框不可编辑
		jf.add(jt1);  //将文本框添加到窗口中
		//创建按键
	    JTextField txtResult = new JTextField("0");
	    JButton btnNull = new JButton("sqrt");
	    JButton btnFour = new JButton("4");
	    JButton btnFive = new JButton("5");
	    JButton btnSix = new JButton("6");
	    JButton btnDecrease = new JButton("-");
	    JButton btnBegin = new JButton("C");
	    JButton btnOne = new JButton("1");
	    JButton btnTwo = new JButton("2");
	    JButton btnThree = new JButton("3");
	    JButton btnMultiply = new JButton("*");
	    JButton btnCancel = new JButton("←");
	    JButton btnZero = new JButton("0");
	    JButton btnMinus = new JButton("+/-");
	    JButton btnPoint = new JButton(".");
	    JButton btnDivide = new JButton("/");
	    JButton btnEqual = new JButton("=");
	    JButton btnIncrease = new JButton("+");
	    JButton btnSeven = new JButton("7");
	    JButton btnEight = new JButton("8");
	    JButton btnNine = new JButton("9");
	    JButton btnp = new JButton("(");
	    JButton btnq = new JButton(")");
	    JButton btnSquare = new JButton("^");
	    JButton btnPion = new JButton("π");
	    
	    
	    
		
	}
}