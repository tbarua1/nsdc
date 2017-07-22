/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarkesh.validation;


import com.tarkesh.entity.TrainingCenter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.codehaus.jackson.map.ObjectMapper;
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
        
//        System.out.println("Hibernate one to many (Annotation)");
//	Session session = Testing.getsessionFactory().openSession();
//
//	session.beginTransaction();
//	session.getTransaction().commit();
//	System.out.println("Done");
String s2="[{\"id\":3,\"name\":\"PMKYTC2\",\"nameSPOC\":\"Tarkeshwar2\",\"contactSPOC\":\"75032271512\",\"buildingNo\":null,\"streetNo\":null,\"locality\":null,\"city\":null,\"district\":null,\"state\":null,\"username\":\"tarkesh\",\"password\":\"aaaAAA123\",\"usertype\":\"tc\",\"creator\":null,\"jobrole\":\"null\",\"ssc\":null,\"qpcode\":null,\"tpsmartid\":null,\"pin\":null,\"rdate\":null,\"latitude\":22.7140929,\"longitude\":90.1117824}]";
String s1="[[{\"id\":3,\"name\":\"PMKYTC2\",\"nameSPOC\":\"Tarkeshwar2\",\"contactSPOC\":\"75032271512\",\"buildingNo\":null,\"streetNo\":null,\"locality\":null,\"city\":null,\"district\":null,\"state\":null,\"username\":\"tarkesh\",\"password\":\"aaaAAA123\",\"usertype\":\"tc\",\"creator\":null,\"jobrole\":\"null\",\"ssc\":null,\"qpcode\":null,\"tpsmartid\":null,\"pin\":null,\"rdate\":null,\"latitude\":22.7140929,\"longitude\":90.1117824}]] ";
String s="[{\"id\":3,\"name\":\"PMKYTC2\",\"nameSPOC\":\"Tarkeshwar2\",\"contactSPOC\":\"75032271512\",\"buildingNo\":null,\"streetNo\":null,\"locality\":null,\"city\":null,\"district\":null,\"state\":null,\"username\":\"tarkesh\",\"password\":\"aaaAAA123\",\"usertype\":\"tc\",\"creator\":null,\"jobrole\":\"null\",\"ssc\":null,\"qpcode\":null,\"tpsmartid\":null,\"pin\":null,\"rdate\":null,\"latitude\":22.7140929,\"longitude\":90.1117824}]";
        TrainingCenter[] readValue = new ObjectMapper().readValue(s2, TrainingCenter[].class);
        for(TrainingCenter t:readValue){
            System.out.println(t.getBuildingNo());
             System.out.println(t.getCity());
              System.out.println(t.getLatitude());
               System.out.println(t.getLocality());

 System.out.println(t.getLongitude());        }
    }
}
