package germinoci.springframework.config;

import germinoci.springframework.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${germinoci.username}")
    String user;
    @Value("${germinoci.password}")
    String password;
    @Value("${germinoci.dburl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        fakeDataSource.setUser(user);
        return fakeDataSource;
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }

}
