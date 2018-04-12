package cn.edu.hqu.javaee.domain.cd.impl;

import cn.edu.hqu.javaee.domain.cd.CompactDisc;
import cn.edu.hqu.javaee.domain.cd.MediaPlayer;

public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;
	
	public CDPlayer(CompactDisc cd) {
		this.cd=cd;
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		cd.play();
	}

}
