/* 
 * Native hash functions for Java
 * 
 * Copyright (c) Project Nayuki
 * http://www.nayuki.io/page/native-hash-functions-for-java
 */

package nayuki.nativehash;


public final class Ripemd320Test extends HashTest {
	
	public static void main(String[] args) {
		new Ripemd320Test().run();
	}
	
	
	protected BlockHasher newHasher(boolean useNative) {
		return useNative ? new Ripemd320() : new Ripemd320Java();
	}
	
	
	protected String[][] getTestVectors() {
		return new String[][] {
			{"22D65D5661536CDC75C1FDF5C6DE7B41B9F27325EBC61E8557177D705A0EC880151C3A32A00899B8", ""},
			{"CE78850638F92658A5A585097579926DDA667A5716562CFCF6FBE77F63542F99B04705D6970DFF5D", "a"},
			{"DE4C01B3054F8930A79D09AE738E92301E5A17085BEFFDC1B8D116713E74F82FA942D64CDBC4682D", "abc"},
			{"3A8E28502ED45D422F68844F9DD316E7B98533FA3F2A91D29F84D425C88D6B4EFF727DF66A7C0197", "message digest"},
			{"CABDB1810B92470A2093AA6BCE05952C28348CF43FF60841975166BB40ED234004B8824463E6B009", "abcdefghijklmnopqrstuvwxyz"},
			{"D034A7950CF722021BA4B84DF769A5DE2060E259DF4C9BB4A4268C0E935BBC7470A969C9D072A1AC", "abcdbcdecdefdefgefghfghighijhijkijkljklmklmnlmnomnopnopq"},
			{"ED544940C86D67F250D232C30B7B3E5770E0C60C8CB9A4CAFE3B11388AF9920E1B99230B843C86A4", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"},
			{"557888AF5F6D8ED62AB66945C6D2A0A47ECD5341E915EB8FEA1D0524955F825DC717E4A008AB2D42", "12345678901234567890123456789012345678901234567890123456789012345678901234567890"},
		};
	}
	
}
