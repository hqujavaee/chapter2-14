package cn.edu.hqu.javaee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import cn.edu.hqu.javaee.domain.cd.CompactDisc;
import cn.edu.hqu.javaee.domain.cd.impl.Albums;
import cn.edu.hqu.javaee.domain.cd.impl.AlbumsExistsCondition;
import cn.edu.hqu.javaee.domain.cd.impl.BlankDisc;
import cn.edu.hqu.javaee.domain.cd.impl.BlankDiscExistsCondition;
import cn.edu.hqu.javaee.domain.cd.impl.CDPlayer;

@Configuration
@PropertySource("application.properties")
public class Config {
	@Bean

	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		//直接注入
		return new CDPlayer(compactDisc);
	}
	@Bean
	@Conditional(AlbumsExistsCondition.class)
	public Albums albums() {
		return new Albums();
	}
	
	@Bean
	@Conditional(BlankDiscExistsCondition.class)
	public BlankDisc blankDisc() {
		return new BlankDisc();
	}
}
