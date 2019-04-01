package com.suibibk.jiegouxing.composite;

public class Test {

	public static void main(String[] args) {
		TreeNode treeNode = new TreeNode();
		treeNode.setName("随笔博客");
		TreeNode treeNode2 = new TreeNode();
		treeNode2.setName("IT博客");
		TreeNode treeNode3 = new TreeNode();
		treeNode3.setName("一叶知秋博客");
		TreeNode treeNode4 = new TreeNode();
		treeNode4.setName("飘呀飘博客");
		treeNode.add(treeNode2);
		treeNode.add(treeNode3);
		treeNode.add(treeNode4);
		treeNode.display();
		

	}

}
