package ������2bao3;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Xin1 extends Frame{
	public static void main(String[] args) {
		final double  PI = 3.141592657;
		
		final Frame jf = new Frame("������");     
		jf.setSize(350,400);        //���ô��ڳ���
		jf.setResizable(false);     //���ô����С���ɸ���
		jf.setLayout(null);         //��������洰�ڵĴ�С���ı�
		//����ı���
		final JTextField jt1 = new JTextField();	
		jt1.setHorizontalAlignment(JTextField.RIGHT);    //�����ı����Ҷ���
		jt1.setEditable(false);          //�����ı��򲻿ɱ༭
		jf.add(jt1);  //���ı�����ӵ�������
		//��������
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
	    JButton btnCancel = new JButton("��");
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
	    JButton btnPion = new JButton("��");
	    
	    
	    
		
	}
}