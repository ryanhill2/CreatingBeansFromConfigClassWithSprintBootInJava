package myGroup.myArtifact;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public IPhone getPhone(){
        return new IPhone();
    }

    @Bean
    // this method name can changed without refactoring the code and the return type can be changed for another type of Iphone
    public MobileCPUProcessor getIPhoneProcessor(){
        return new IPhone13MobileCPUProcessor();
    }
}
