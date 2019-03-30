package com.suibibk.jiegouxing.facade;

public class Computer {
	private CPU cpu;
	private Memory memory;
	private Disk disk;
	public Computer() {
		cpu=new CPU();
		memory=new Memory();
		disk=new Disk();
	}
	public void startup() {
		System.out.println("启动Computer");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("Computer启动成功");
	}
	public void shutdown() {
		System.out.println("关闭Computer");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("Computer关闭成功");
	}
}
