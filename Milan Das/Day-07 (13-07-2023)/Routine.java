package com.helper;

public class Routine {

	public String padL(int n, int len) {
		StringBuffer rValue = new StringBuffer("" + n);
		for(int i=rValue.length(); i<len; i++) {
			rValue.insert(0, ".");
		}
		return rValue.toString();
	}

	public String padR(int n, int len) {
		StringBuffer rValue = new StringBuffer("" + n);
		for(int i=rValue.length(); i<len; i++) {
			rValue.append(".");
		}
		return rValue.toString();
	}

	public String padC(int n, int len) {
		StringBuffer rValue = new StringBuffer("" + n);
		for(int i=rValue.length(); i<len; i++) {
			if(i%2==0) {
				rValue.append(".");
			} else {
				rValue.insert(0, ".");
			}
		}
		return rValue.toString();
	}
}
