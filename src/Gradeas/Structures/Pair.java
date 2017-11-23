package Gradeas.Structures;

import java.io.Serializable;

public class Pair<T,U> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private T t;
	U u;
	
	/*
	 * Constructors	
	 */
	public Pair() {
		super();
	}

	public Pair(T t, U u) {
		super();
		this.setT(t);
		this.u = u;
	}
	/*
	 * Setters and Getters
	 */
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public U getU() {
		return u;
	}
	public void setU(U u) {
		this.u = u;
	}

	@Override
	public String toString() {
		return "Pair [t=" + getT() + ", u=" + u + "]";
	}
	
	
}
