package com.activiti.boot.config;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(basePackages = SysProjectDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "SysProjectSqlSessionFactory")
public class SysProjectDataSourceConfig {

	 // 精确到 cluster 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.activiti.boot.dao.sys";
    static final String MAPPER_LOCATION = "classpath:mapper/sys/*.xml";
    
    @Value("${project.datasource.url}")
    private String url;

    @Value("${project.datasource.username}")
    private String user;

    @Value("${project.datasource.password}")
    private String password;

    @Value("${project.datasource.driver-class-name}")
    private String driverClass;

    @Bean(name = "SysProjectDataSource")
    public DataSource SysProjectDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "SysProjectTransactionManager")
    public DataSourceTransactionManager clusterTransactionManager() {
        return new DataSourceTransactionManager(SysProjectDataSource());
    }

    @Bean(name = "SysProjectSqlSessionFactory")
    public SqlSessionFactory SysProjectSqlSessionFactory(@Qualifier("SysProjectDataSource") DataSource SysProjectDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(SysProjectDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(SysProjectDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
