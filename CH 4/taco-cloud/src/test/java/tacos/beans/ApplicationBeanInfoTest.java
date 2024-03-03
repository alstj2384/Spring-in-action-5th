package tacos.beans;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tacos.Appconfig;

public class ApplicationBeanInfoTest {

   AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig .class);
    @Test
    public void findAllBeans(){
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);

            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION){
                System.out.println("beanDefinition = " + beanDefinitionName);
            }
        }
    }
}
