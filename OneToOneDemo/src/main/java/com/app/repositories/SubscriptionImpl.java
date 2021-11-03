package com.app.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.entity.Subscription;

@Repository
public class SubscriptionImpl implements ISubscription{

	  @Autowired
	private HibernateTemplate hibernateTemplate;
	 
	public void saveSubscription(Subscription subscription) {
		
	  hibernateTemplate.saveOrUpdate(subscription);
	}

	public void updateSubscription(Subscription subscription) {
		 hibernateTemplate.update(subscription);
		
	}

	public void deleteSubscription(int id) {
	 
		  hibernateTemplate.delete(new Subscription(id));
		
	}

	public Subscription getSubscriptionById(int id) {
		
		return hibernateTemplate.get(Subscription.class, id);
	}

	public List<Subscription> getAllSubscription() {
		
		return hibernateTemplate.loadAll(Subscription.class);
	}

}
