package com.educative.Interface;
/*static method from WithClass can not be overrode */ 
public class FromWithStatic implements WithStatic{
	
	public static void main(String[] args) {
		/*calling a static method from interface*/
		WithStatic.startVehicle();
	}
}
