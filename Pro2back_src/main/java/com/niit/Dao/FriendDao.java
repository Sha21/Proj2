package com.niit.Dao;

import java.util.List;

import com.niit.Model.Friend;
import com.niit.Model.User;

public interface FriendDao {

	List<User> getAllSuggestedUsers(String username);
	
	void friendRequest(Friend friend);//insert into friend

	List<Friend> pendingRequests(String username);

	void updatePendingRequest(Friend friend);
	
	List<Friend> listOfFriends(String username);
	
	List<String> getMutualFriends(String username, String otherUsername);

}
