package com.app.service;

import java.util.List;

import com.app.entity.Subscription;

public interface ISubscriptionService {

	public int saveSubscription(Subscription subscription);
	public void updateSubscription(Subscription subscription);
	public void deleteSubscription(int id);
	public Subscription getSubscriptionById(int id);
	public List<Subscription> getAllSubscription();
	
	
}
