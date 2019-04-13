package com.suibibk.xingweixing.tongguozhognjianlei.visitor;
/**
 * 客户端
 * @author suibibk.com
 */
public class Client {

	public static void main(String[] args) {
		ObjectStructure object = new ObjectStructure();
		Book book1 = new Book("英语书");
		Book book2 = new Book("数学书");
		Book book3 = new Book("语文书");
		CD cd1 = new CD("音乐光盘");
		CD cd2 = new CD("体育光盘");
		CD cd3 = new CD("影视光盘");
		object.addElement(book1);
		object.addElement(book2);
		object.addElement(book3);
		object.addElement(cd1);
		object.addElement(cd2);
		object.addElement(cd3);
		//管理员访问
		System.out.println("管理员访问");
		object.visit(new Manager());
		//读者访问
		System.out.println("读者访问");
		object.visit(new Reader());
		//财务访问
		System.out.println("财务访问");
		object.visit(new Finance());
	}

}
