package com.jl.generic.customgeneric;

import java.io.Serializable;

public class CustomInterface {
	public static void main(String[] args) {

	}
}
class BB implements IUsb<Integer,Float> {

	@Override
	public Float get(Integer integer) {
		return 0f;
	}

	@Override
	public void hi(Float aFloat) {

	}

	@Override
	public void run(Float r1, Float r2, Integer u1, Integer u2) {

	}
}
interface IUsb<U, R> {


	R get(U u);

	void hi(R r);

	void run(R r1, R r2, U u1, U u2);

	default R method(U u) {
		return null;
	}
}