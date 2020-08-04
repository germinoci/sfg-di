package germinoci.springframework;

import germinoci.springframework.controllers.MyController;
import germinoci.springframework.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@ComponentScan(basePackages = {"germinoci.guru.services", "germinoci.springframework" })
@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

//        System.out.println("----------------I18nController");
//
//        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
//        System.out.println(i18nController.sayHallo());
//
//
//
        MyController myController = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getUrl());
        System.out.println(fakeDataSource.getUser());
//
//        System.out.println("----------------Primary Bean");
//        System.out.println(myController.hello());
//
//        System.out.println("----------------Property");
//
//        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
//        System.out.println(propertyInjectedController.getGreeting());
//
//        System.out.println("----------------Setter");
//
//        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
//        System.out.println(setterInjectedController.getGreeting());
//
//        System.out.println("----------------Constructor");
//
//        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
//        System.out.println(constructorInjectedController.getGreeting());
    }

}
