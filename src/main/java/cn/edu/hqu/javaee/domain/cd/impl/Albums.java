package cn.edu.hqu.javaee.domain.cd.impl;

import cn.edu.hqu.javaee.domain.cd.CompactDisc;


public class Albums implements CompactDisc {

	private String title="跨时代";
	private String artist="周杰伦";
	public Albums() {
		
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("正在播放"+artist+"的专辑《"+title+"》");
	}
}
