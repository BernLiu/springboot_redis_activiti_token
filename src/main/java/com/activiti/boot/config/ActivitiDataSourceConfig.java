package com.activiti.boot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
//扫描 Mapper 接口并容器管理
@MapperScan(basePackages = ActivitiDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "activitiSqlSessionFactory")
public class ActivitiDataSourceConfig {
	
	// 精确到 master 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.activiti.boot.dao.activiti";
    static final String MAPPER_LOCATION = "classpath:mapper/activiti/*.xml";
    
    @Value("${activiti.datasource.url}")
    private String url;

    @Value("${activiti.datasource.username}")
    private String user;

    @Value("${activiti.datasource.password}")
    private String password;

    @Value("${activiti.datasource.driver-class-name}")
    private String driverClass;

    @Bean(name = "activitiDataSource")
    @Primary
    public DataSource activitiDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "activitiTransactionManager")
    @Primary
    public DataSourceTransactionManager activitiTransactionManager() {
        return new DataSourceTransactionManager(activitiDataSource());
    }

    @Bean(name = "activitiSqlSessionFactory")
    @Primary
    public SqlSessionFactory activitiSqlSessionFactory(@Qualifier("activitiDataSource") DataSource activitiDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(activitiDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(ActivitiDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }

}
