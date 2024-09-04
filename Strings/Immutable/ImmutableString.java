package com.evergent.CoreJAVA.strings.Immutable;
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
