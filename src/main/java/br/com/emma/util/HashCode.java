package br.com.emma.util;


public class HashCode {
	
	private int _hashCode = 17;
	
	public HashCode append(int value) {
		_hashCode = 31 * _hashCode + value;
		return this;
	}
	
	public HashCode append(long value) {
		return append((int)(value^(value>>>32)));
	}
	
	public HashCode append(boolean value) {
		return append(value?1:0);
	}
	
	public HashCode append(String value) {
		return append(value.hashCode());
	}
	
	public HashCode append(double value) {
		return append(Double.doubleToLongBits(value));
	}
	
	public HashCode append(float value) {
		return append(Float.floatToIntBits(value));
	}
	
	public HashCode append(byte value) {
		return append((int)value);
	}
	
	public HashCode append(char value) {
		return append((int)value);
	}
	
	public HashCode append(short value) {
		return append((int)value);
	}
	
	@Override
	public int hashCode() {
		return _hashCode;
	}
	
}
