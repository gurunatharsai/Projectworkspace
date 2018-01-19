package com.niit.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.ProductDAO;

import com.niit.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
@Autowired
	
	SessionFactory sessionFactory;

@Override
public void addproduct(Product product) {
	// TODO Auto-generated method stub
	
	try
	{
	
Session session=sessionFactory.openSession();
	
Transaction trans=session.beginTransaction();
		
session.save(product);
		
trans.commit();
		
session.flush();
		
session.close();	
	
}
	
catch(Exception e)
	
{
			
System.out.println(e);
	
}
}

@SuppressWarnings("unchecked")
@Override
public List<Product> getProList() {
	// TODO Auto-generated method stub
List<Product> prolist=new ArrayList<Product>();
	
	try
	{
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		prolist=session.createQuery("from Product").list();
		trans.commit();
		session.flush();
		session.close();
	}
	
	catch(Exception ex)
	{
		System.out.println("Error="+ex);
	}
	return prolist;
}

@Override
public void deleteProductById(String proid) {
	// TODO Auto-generated method stub
	try
	{
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
	Product proobj=(Product)session.get(Product.class, proid);
		session.delete(proobj);
		trans.commit();
		session.flush();
		session.close();
	}
	
	catch(Exception ex)
	{
		System.out.println("Error="+ex);
	}

}

@Override
public Product getProductById(String proid) {
	// TODO Auto-generated method stub
	Product proobj=new Product();
	try
	{
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		 proobj=(Product)session.get(Product.class, proid);
		trans.commit();
		session.flush();
		session.close();
	}
	
	catch(Exception ex)
	{
		System.out.println("Error="+ex);
	}
	
	return proobj;
}

@Override
public void updateproduct(Product product) {
	// TODO Auto-generated method stub
	// TODO Auto-generated method stub
		try
		{
			Session session=sessionFactory.openSession();
			Transaction trans=session.beginTransaction();
			session.update(product);
			trans.commit();
			session.flush();
			session.close();
		}
		
		catch(Exception ex)
		{
			System.out.println("Error="+ex);
		}
}


}
