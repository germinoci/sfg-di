package germinoci.springframework.config;

import germinoci.springframework.examplebeans.FakeDataSource;
import germinoci.springframework.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class PropertyConfig {

    //datasource
    @Value("${germinoci.username}")
    String user;
    @Value("${germinoci.password}")
    String password;
    @Value("${germinoci.dburl}")
    String url;

    //jms
    @Value("${germinoci.jsm.username}")
    String jmsUser;
    @Value("${germinoci.jsm.password}")
    String jmsPassword;
    @Value("${germinoci.jsm.dburl}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
         fakeDataSource.setUser(user);
//        fakeDataSource.setUser(env.getProperty("GERMINOCIx_USERNAME"));// idea overide user environment variables
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        fakeJmsBroker.setUser(jmsUser);
        return fakeJmsBroker;
    }

//    @Bean // s5 dont need
//    public static PropertySourcesPlaceholderConfigurer properties() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }

//    @Bean // or ... no //@PropertySource("classpath:datasource.properties")
//    public static PropertySourcesPlaceholderConfigurer properties() {
//        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
//        configurer.setLocation(new ClassPathResource("datasource.properties"));
//        return configurer;
//    }
}
