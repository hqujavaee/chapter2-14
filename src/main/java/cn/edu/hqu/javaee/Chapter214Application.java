package cn.edu.hqu.javaee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.edu.hqu.javaee.domain.cd.MediaPlayer;

public class Chapter214Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		MediaPlayer mediaPlayer=context.getBean(MediaPlayer.class);
		mediaPlayer.turnOn();
		context.close();
	}
}
