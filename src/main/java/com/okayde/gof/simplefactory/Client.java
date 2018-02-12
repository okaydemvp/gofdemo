package com.okayde.gof.simplefactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Client {
    private Client() {
    }

    public static void run() {
        Api api = Factory.createApi(2);
        api.operation("正在使用简单工厂");

        try {
            Properties properties = new Properties();
            InputStream in = Client.class.getClassLoader().getResourceAsStream("FactoryTest.properties");
            properties.load(in);
            Api api2 = (Api) Class.forName(properties.getProperty("ImplClass")).newInstance();
            api2.operation("使用反射");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
