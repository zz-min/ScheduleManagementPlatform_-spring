package com.webprj.studio.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan({
	"com.webprj.studio.dao",
	"com.webprj.studio.service",
	"com.webprj.studio.controller",
})
@PropertySource({"classpath:com/webprj/studio/config/db.properties"})
@EnableTransactionManagement
@EnableAspectJAutoProxy
@Configuration
public class studioConfig {
	@Autowired
	Environment env;
	
	@Bean(destroyMethod="close")
	public DataSource dataSource() {
		DataSource ds = new DataSource();
		ds.setDriverClassName(env.getProperty("db.driverName"));
		ds.setUrl(env.getProperty("db.url"));
		ds.setUsername(env.getProperty("db.userName"));
		ds.setPassword(env.getProperty("db.password"));
		ds.setInitialSize(5);
		ds.setMaxActive(15);
		ds.setMaxIdle(15);
		ds.setTestWhileIdle(true);
		ds.setMinEvictableIdleTimeMillis(1000*60*3);
		ds.setTimeBetweenEvictionRunsMillis(1000*10);
		return ds;
	}

}
