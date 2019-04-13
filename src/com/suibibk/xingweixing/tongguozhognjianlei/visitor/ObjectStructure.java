package com.suibibk.xingweixing.tongguozhognjianlei.visitor;

import java.util.ArrayList;
import java.util.List;
/**
 * 对象结构，中间类
 * @author suibibk.com
 */
public class ObjectStructure {
	private List<Element> elements = new ArrayList<Element>();
	public void addElement(Element element) {
		if(!elements.contains(element)) {
			elements.add(element);
		}
	}
	public void visit(Visit visit) {
		for (Element element : elements) {
			element.accept(visit);
		}
	}
}
