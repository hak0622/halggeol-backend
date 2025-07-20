package com.halggeol.backend.global.config;


import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.io.Reader;
import java.util.Properties;

@Configuration
@PropertySource("classpath:/application.yml")
@MapperScan(basePackages = {"com.halggeol.backend.mapper"})
public class AppConfig {

    @Bean
    public DataSource dataSource() {
        Properties properties = new Properties();
        HikariDataSource dataSource = new HikariDataSource();
        try {
            Reader reader = Resources.getResourceAsReader("config/application.yml");
            properties.load(reader);
            dataSource.setDriverClassName(properties.getProperty("spring.datasource.driver-class-name"));
            dataSource.setUsername(properties.getProperty("spring.datasource.username"));
            dataSource.setPassword(properties.getProperty("spring.datasource.password"));
            dataSource.setJdbcUrl(properties.getProperty("spring.datasource.url"));
            dataSource.setAutoCommit(true);
        } catch (Exception e) {
            System.out.println("Error loading database configuration: " + e.getMessage());
        }
        return dataSource;
    }

    @Autowired
    ApplicationContext applicationContext;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setConfigLocation(
                applicationContext.getResource("classpath:/mybatis/mybatis-config.xml"));
        sqlSessionFactory.setDataSource(dataSource());
        return (SqlSessionFactory) sqlSessionFactory.getObject();
    }

    @Bean
    public DataSourceTransactionManager transactionManager(){
        DataSourceTransactionManager manager = new DataSourceTransactionManager(dataSource());
        return manager;
    }
}
