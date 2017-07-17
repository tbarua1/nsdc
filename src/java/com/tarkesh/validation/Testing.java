/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarkesh.validation;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


/**
 *
 * @author Abhishek.Sehgal
 */
public class Testing {
    private static SessionFactory sessionFactory;
    private static Session openSession;
    public static SessionFactory getsessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            //sessionFactory = new Configuration().configure().buildSessionFactory();
            return sessionFactory;
        } else {
            return sessionFactory;
        }
    }
    public static void main(String[] args) throws IOException {
        
        System.out.println("Hibernate one to many (Annotation)");
	Session session = Testing.getsessionFactory().openSession();

	session.beginTransaction();
	session.getTransaction().commit();
	System.out.println("Done");
    }
}
