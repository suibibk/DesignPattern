package com.suibibk.jiegouxing.composite;

import java.util.ArrayList;
import java.util.List;
/**
 * 组合模式
 * @author suibibk.com
 */
public class TreeNode {
	private String name;
	private List<TreeNode> childrens = new ArrayList<TreeNode>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void add(TreeNode treeNode) {
		childrens.add(treeNode);
	}
	public void remove(TreeNode treeNode) {
		childrens.remove(treeNode);
	}
	public void display(){
		 System.out.println("节点名字："+name);
		 if(childrens.size()>0) {
			 for (int i = 0; i < childrens.size(); i++) {
				 System.out.println("第"+(i+1)+"个孩子节点的名字是："+childrens.get(i).name);
			}
		 }
	}
}
