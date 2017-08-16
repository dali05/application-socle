package com.weslaty.data.access.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableJpaRepositories(basePackages = {"com.weslaty.data.access.repositories"})
@EnableTransactionManagement
public class PersistenceContext {

    @Bean
    DataSource dataSource(Environment env) {
        System.out.println("AOI : dataSource");
        HikariConfig dataSourceConfig = new HikariConfig();
        dataSourceConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setJdbcUrl("jdbc:mysql://localhost:3306/application_socle_db?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=utf8&autoReconnect=true&connectionCollation=utf8_general_ci&characterSetResults=utf8");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("root");

        return new HikariDataSource(dataSourceConfig);
    }

    @Bean
    LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource,
                                                                Environment env) {
        System.out.println("AOI : entityManagerFactory");

        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource);
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        entityManagerFactoryBean.setPackagesToScan("com.weslaty.data.access.entities");

        Properties jpaProperties = new Properties();

        //Configures the used database dialect. This allows Hibernate to create SQL
        //that is optimized for the used database.
        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");

        //Specifies the action that is invoked to the database when the Hibernate
        //SessionFactory is created or closed.
        jpaProperties.put("hibernate.hbm2ddl.auto","validate");

        //Configures the naming strategy that is used when Hibernate creates
        //new database objects and schema elements
        jpaProperties.put("hibernate.ejb.naming_strategy","org.hibernate.cfg.ImprovedNamingStrategy");

        //If the value of this property is true, Hibernate writes all SQL
        //statements to the console.
        jpaProperties.put("hibernate.show_sql","true");

        //If the value of this property is true, Hibernate will format the SQL
        //that is written to the console.
        jpaProperties.put("hibernate.format_sql","true");

        entityManagerFactoryBean.setJpaProperties(jpaProperties);

        return entityManagerFactoryBean;
    }

    @Bean
    JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        System.out.println("AOI : transactionManager");

        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }

}
