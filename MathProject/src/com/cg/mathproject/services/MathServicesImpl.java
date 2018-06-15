package com.cg.mathproject.services;

import com.cg.mathproject.exceptions.InValidNoRangeException;

public class MathServicesImpl implements MathServices {

	@Override
	public int add(int n1, int n2) throws InValidNoRangeException{
		int add=n1+n2;
		return add;
	}

	@Override
	public int sub(int n1, int n2)throws InValidNoRangeException {
		int sub=n1-n2;
		return sub;
	}
	@Override
	public int div(int n1, int n2) throws InValidNoRangeException{
	if(n1<0||n2<0)
		throw new InValidNoRangeException();
	else
		return n1/n2;
	}



}
