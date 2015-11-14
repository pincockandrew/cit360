package hibernate_sandbox_andrew;

import hibernate_sandbox_andrew.HibernateUtilSingleton;
import hibernate_sandbox_andrew.Owner;
import hibernate_sandbox_andrew.Guitar;

import java.util.List;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Query;

public class HibernateAttempt {
    private List<Owner> owners;
    
    public HibernateAttempt() {

    }

    public static void main(String[] args) {

        HibernateAttempt hibernate_attempt = new HibernateAttempt();
        hibernate_attempt.addNewOwners();
        hibernate_attempt.showAllOwners();
        hibernate_attempt.deleteAddedOwners();
    }

    private void addNewOwners() {
    	SessionFactory sessionFactory = HibernateUtilSingleton.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        Transaction transaction = session.beginTransaction();

        Owner aNameUser = new Owner();
        aNameUser.setUname("andrew");
        aNameUser.setPword("andrewpassword");
        
        session.save(aNameUser);
        transaction.commit();

        System.out.println("aUser generated ID is: " + aNameUser.getId());
    }
    
    private void showAllOwners() {
        Session session = HibernateUtilSingleton.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Query allUsersQuery = session.createQuery("select u from Owner as u order by u.id");

        owners = allUsersQuery.list();
        System.out.println("num users: "+owners.size());

        Iterator<Owner> iter = owners.iterator();
        while(iter.hasNext()) {
            Owner element = iter.next();
            System.out.println(element.toString());
            System.out.println("num of guitars: "+element.getGuitars().size());
        }
        transaction.commit();
    }
    
    private void deleteAddedOwners() {

            Session session = HibernateUtilSingleton.getSessionFactory().getCurrentSession();
            Transaction transaction = session.beginTransaction();
            
            int numUsers = owners.size();
            System.out.println("Owner count: "+numUsers);
            for(int i = 0; i < numUsers; i++){
                System.out.println("deleting user "+owners.get(i).getUname());
                session.delete(owners.get(i));
            }
            transaction.commit();

            System.out.println(owners);
            owners.clear();

            System.out.println(owners);
        }
                                   
}