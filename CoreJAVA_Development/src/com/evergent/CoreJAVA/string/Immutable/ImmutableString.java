package com.evergent.CoreJAVA.string.Immutable;
//Using toString() method
public class ImmutableString {
	private final String Value;
	public ImmutableString(String Value) {
		this.Value=Value;
	}
	public String toString()
	{
		return Value;
	}
	

}
