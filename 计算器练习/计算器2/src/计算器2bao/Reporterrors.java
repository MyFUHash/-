package ������2bao;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
class Calculator {
	private Double num1;
	private Double num2;
	private String var;
	private  Scanner input;
	
	public Double getNum1() {
		return num1;
	}
	public void setNum1(Double num1) {
		this.num1 = num1;
	}
	public Double getNum2() {
		return num2;
	}
	public void setNum2(Double num2) {
		this.num2 = num2;
	}
	public String getVar() {
		return var;
	}
	public void setVar(String var) {
		this.var = var;
	}
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}
	public boolean input1(){
	        System.out.println("�������һ������");
	        String num1Str = input.next();
	        if(!this.isNumber(num1Str)){
	        	input1();
	        }else{
	        	this.num1 =Double.valueOf(num1Str);
	        }
	        return true;
	        
	}
	public boolean input2(){
        System.out.println("����ڶ�����:");
        String num2Str = input.next();
        if(!this.isNumber(num2Str)){
        	input2();
        }else if(var.equalsIgnoreCase("/")&&num2Str.equalsIgnoreCase("0")){
        	System.err.println("��������Ϊ0");
        	input2();
        }else{
        	this.num2 =Double.valueOf(num2Str);
        }
        return true;
	}
	public boolean inputVar(){
		System.out.println("����������:+ - * /");
		String varStr=input.next();
 
		 Pattern pat=Pattern.compile("[+-\\\\*/]");
		 Matcher match=pat.matcher(varStr);
		 boolean flag=match.matches();
		 if(flag==false){
			 System.err.println("������Ų���ȷ��");
			 inputVar();
		 }else{
			 this.setVar(varStr);
		 }
		 
        return true;
	}
	
	public void goCal(){
		
		Scanner input= new Scanner(System.in);
		this.setInput(input);
		boolean flag1=this.input1();
		if(flag1){
			if(this.inputVar()){
				if(this.input2()){
					calculate();
				}
			}
		}
	}
    public void calculate(){
    	try {
			switch (var) {
			case "+":
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				break;
			case "-":
				 System.out.println(num1+"-"+num2+"="+(num1-num2));
				break;
			case "*":
				 System.out.println(num1+"-"+num2+"="+(num1*num2));
				break;
			case "/":
				System.out.println(num1+"/"+num2+"="+(num1/(double)num2));
				break;
 
			default:
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if(input!=null){
    			input.close();
    			System.exit(0);
    		}
		}
    	if(input!=null){
			input.close();
			System.exit(0);
		}
       
    }
    public boolean isNumber(Object obj){
    	if(obj==null||obj.toString().equals("")){
    		return false;
    	}
    	Pattern pattern=Pattern.compile("[0-9]+.*[0-9]*");
    	String str=obj.toString();
    	Matcher matcher=pattern.matcher(str);
    	boolean flag=matcher.matches();//������
    	if(flag==false){
    		System.err.println("��������Ч��ֵ��");
    	}
    	return flag;
    }
}

public class Reporterrors {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.goCal();
	}

}
