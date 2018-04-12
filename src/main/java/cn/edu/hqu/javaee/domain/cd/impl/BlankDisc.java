package cn.edu.hqu.javaee.domain.cd.impl;

import cn.edu.hqu.javaee.domain.cd.CompactDisc;

public class BlankDisc implements CompactDisc {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("这是一张空CD");
	}

}
