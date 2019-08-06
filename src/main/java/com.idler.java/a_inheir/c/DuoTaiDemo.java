package com.idler.java.a_inheir.c;

class DuoTaiDemo {
	public static void main(String[] args) {
		//要有父类引用指向子类对象。
		//父 f =  new 子();
		Fu f = new Zi();
		System.out.println(f.num);
		//找不到符号
		//System.out.println(f.num2);
		
		f.show();
		//找不到符号
//		f.method();
		f.function();
	}
}