package com.naught.carter.util;

import java.util.UUID;

public class UUIdUtil {
	
	public static String getUUid(){
		return UUID.randomUUID().toString().replace("-", "");
	}

}
