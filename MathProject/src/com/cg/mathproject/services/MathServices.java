package com.cg.mathproject.services;
import com.cg.mathproject.exceptions.InValidNoRangeException;
public interface MathServices {
public  abstract int add(int n1,int n2)throws InValidNoRangeException;
abstract int sub(int n1, int n2)throws InValidNoRangeException;
int div(int n1, int n2)throws InValidNoRangeException;
}