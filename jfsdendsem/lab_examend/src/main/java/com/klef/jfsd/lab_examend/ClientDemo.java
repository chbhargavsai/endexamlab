package com.klef.jfsd.lab_examend;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // Create Device record
        Device device = new Device();
        device.setBrand("Generic");
        device.setModel("X100");
        device.setPrice(150.00);
        session.save(device);

        // Create Smartphone record
        Smartphone smartphone = new Smartphone();
        smartphone.setBrand("Samsung");
        smartphone.setModel("Galaxy S21");
        smartphone.setPrice(800.00);
        smartphone.setOperatingSystem("Android");
        smartphone.setCameraResolution(108);
        session.save(smartphone);

        // Create Tablet record
        Tablet tablet = new Tablet();
        tablet.setBrand("Apple");
        tablet.setModel("iPad Pro");
        tablet.setPrice(1200.00);
        tablet.setScreenSize(12.9);
        tablet.setBatteryLife(10);
        session.save(tablet);

        transaction.commit();
        session.close();
        factory.close();

        System.out.println("Records inserted successfully!");
    }
}
