package com.hibernate.core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class InsertRecord {
	public static void main(String[] args) {
		Session session = null;
		Transaction txn = null;
		try {
			SessionFactory factory = ChibernateUtil.getSessionFctory();
			session = factory.openSession();
			txn = session.beginTransaction();
			Employee employee = new Employee("RAJ", "INDIA", "273212");
			if (employee.getEmp_Name() != "RAJU SHARMA")
			session.save(employee);
			txn.commit();
		} catch (Exception e) {
			if (txn != null)
				txn.rollback();
		}

	}
}
