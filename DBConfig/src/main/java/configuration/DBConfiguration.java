package configuration;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DBConfiguration {
	
	@Bean
    public DataSource datasource() {
        return DataSourceBuilder.create()
          .driverClassName("")
          .url("")
          .username("")
          .password("")
          .build(); 
    }
}
