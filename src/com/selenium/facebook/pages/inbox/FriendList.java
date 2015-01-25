package com.selenium.facebook.pages.inbox;

import com.selenium.facebook.base.Page;

public class FriendList extends Page {

	// search for a friend
	public boolean searchFriend(String friendName){
		input("friend_search_name", friendName);
		return isLinkPresent(friendName);
	}
}
		
		
	
