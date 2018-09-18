package com.shop;

import com.shop.config.ApplicationConfig;
import com.shop.config.HibernateConfig;

import com.shop.models.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import com.shop.services.impl.ShopServiceImpl;


@Component
public class Application {

    @Autowired
    ShopServiceImpl shopServiceImpl;

    public static void main(String args[]) {
//создаем контекст для взаимодействия , т.к. main не может общаться с методами run
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Application app = ctx.getBean(Application.class);
        app.run();
    }

    private void run() {

        Shop shop = new Shop("OBI");
        shopServiceImpl.saveShop(shop);
/*        Buyer fred = new Buyer("Fred", 31);
        fred.setShop(shop);
        shop.addBuyer(fred);
        Buyer anna = new Buyer("Anna", 54);
        anna.setShop(shop);
        shop.addBuyer(anna);
        shopServiceImpl.update(shop);*/
    }
}
