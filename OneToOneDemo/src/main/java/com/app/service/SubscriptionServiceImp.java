package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Subscription;
import com.app.repositories.ISubscription;

@Service
public class SubscriptionServiceImp implements ISubscriptionService {

	  @Autowired
	private ISubscription sdao;
	
	 @Transactional
	public int saveSubscription(Subscription subscription) {
		
		return sdao.saveSubscription(subscription);
	}

	    @Transactional
	public void updateSubscription(Subscription subscription) {
		sdao.updateSubscription(subscription);
		
	}

	      @Transactional
	public void deleteSubscription(int id) {
		sdao.deleteSubscription(id);
		
	}

	       @Transactional(readOnly = true)
	public Subscription getSubscriptionById(int id) {
		return sdao.getSubscriptionById(id);
		
	}

	         @Transactional(readOnly = true)
	public List<Subscription> getAllSubscription() {
		
		return sdao.getAllSubscription();
	}

}
