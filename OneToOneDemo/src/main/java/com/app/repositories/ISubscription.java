package com.app.repositories;

import java.util.List;

import com.app.entity.Subscription;

public interface ISubscription {

	
	public void  saveSubscription(Subscription subscription);
	public void updateSubscription(Subscription subscription);
	public void deleteSubscription(int id);
	public  Subscription getSubscriptionById(int id);
	public List<Subscription> getAllSubscription();
}
