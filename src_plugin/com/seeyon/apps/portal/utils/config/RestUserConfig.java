package com.seeyon.apps.portal.utils.config;

import com.seeyon.apps.portal.utils.pojo.RestUser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author 刘星锴
 * @date 2018.11.28 16:40
 * 用于封装并读取resource中URLs的RESTUser.properties
 */
@Configuration
@PropertySource(value = "classpath:plugin/portal/config/RESTUser.properties")
public class RestUserConfig {

    private RestUser user;

    @Value("${RESTUserName}")
    private String userName;

    @Value("${RESTUserPassword}")
    private String password;

    @Value("${RESTUserForTokenUrl}")
    private String restUserUrl;
    
    @Value("${UrlPath}")
    private String urlPath;

    @Bean(name = "RestUser")
    public RestUser getUser(){
        user = new RestUser();
        user.setUserName(userName);
        user.setPassword(password);
        user.setRestUserUrl(restUserUrl);
        user.setUrlPath(urlPath);
        return user;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Override
    public String toString() {
        return "RestUserConfig{" +
                "user=" + user +
                '}';
    }
}
