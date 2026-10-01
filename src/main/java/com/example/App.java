package com.example;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class App 
{
    public static void main( String[] args )
    {
       Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf = config.buildSessionFactory();
        Session dbs = sf.openSession();
        Transaction t = dbs.beginTransaction();
       
//        Fees f = new Fees(789);
//    
//       Example e = new Example("kanak",f);
//     
//      dbs.persist(e);
//      t.commit();
              

//       List a = dbs.createQuery("select e.name, f.amount FROM Example e JOIN Fees f ON e.id = f.fid",List.class)
//      		 .setFirstResult(0)
//      		 .setMaxResults(2)
//      		 .getResultList();
//        System.out.println(a);
        
//     List<Object[]>  ex =  dbs.createNamedQuery("countById",Object[].class)
//    		 
//    		  .getResultList();
//     for(Object[] e :ex) {
//    	 
//    	 System.out.println(e[0]+" "+e[1]);
//     }
     List<Example> s = dbs.createQuery("from Example order by name",Example.class)
    		 
    		 .getResultList();
     System.out.println(s);
     
        		
     int res = dbs.createNamedMutationQuery("update")
    		 .setParameter("name", "kamal")
    		 .setParameter("id","2")
    		 .executeUpdate();
        
System.out.println(res);
         
        dbs.close();
        sf.close();
    }
    

         
}
