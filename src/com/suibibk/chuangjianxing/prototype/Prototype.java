package com.suibibk.chuangjianxing.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * 深复制：引用也会复制
 * @author suibibk.com
 *
 */
public class Prototype implements Cloneable,Serializable{
	 private static final long serialVersionUID =1L;
     private String string;
     /*浅复制*/
     public Object clone() throws CloneNotSupportedException{
	      Prototype proto =(Prototype)super.clone();
	      return proto;
     }
     /*深复制*/
     public Object deepClone() throws IOException,ClassNotFoundException{
         /*写入当前对象的二进制流*/
         ByteArrayOutputStream bos = new ByteArrayOutputStream();
         ObjectOutputStream oos = new ObjectOutputStream(bos);
         oos.writeObject(this);
        
         /*读出二进制流产生新的对象*/
         ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
         ObjectInputStream ois = new ObjectInputStream(bis);
         return ois.readObject();
     }
     public String getString() {  
         return string;  
     }  
   
	 public void setString(String string) {  
	         this.string = string;  
	 }  
	 public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		Prototype prototype = new Prototype();
		prototype.setString("哈哈哈");
		Prototype prototype2 = (Prototype) prototype.clone();
		System.out.println(prototype.getString()==prototype2.getString());
		Prototype prototype3 = (Prototype) prototype.deepClone();
		System.out.println(prototype.getString()==prototype3.getString());
	}
}
