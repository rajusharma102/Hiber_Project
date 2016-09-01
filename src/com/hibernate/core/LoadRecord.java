package com.hibernate.core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LoadRecord {
	public static void main(String[] args) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = ChibernateUtil.getSessionFctory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			Employee employee = (Employee) session.load(Employee.class, 7);
			System.out.println(employee.getEmp_id() + "\t"
					+ employee.getEmp_Name() + "\t" + employee.getEmp_country()
					+ "\t" + employee.getPincode());
		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();

		}
	}
}
