
public class PrimitiveValue {

	public static void main(String[] args) {

		System.out.println("  minimal byte value:   " + getValueByte());
		System.out.println("  maximal byte value:    " + (byte) (getValueByte() - 1));
//		
		System.out.println("  minimal short value:  " + getValueShort());
		System.out.println("  maximal short value:   " + (short)(getValueShort() - 1));
//		
		System.out.println("  minimal int value:    " + getValueInt());
		System.out.println("  maximal int value:     " + (int)(getValueInt()-1));
//		
		System.out.println("  minimal long value:   " + getValueLong());
		System.out.println("  maximal long value:    " + (long)(getValueLong()-1));
//		
		char c = (char) -1;
//		
		System.out.println("  minimal char value:    " + 0 );
		System.out.println("  maximal char value:    " + (int)c);

	}

	private static byte getValueByte() {
		byte res = 0;
		while (res >= 0) {
			res++;
		}
		return res;
	}

	private static short getValueShort() {
		short res = 0;
		while (res >= 0) {
			res++;
		}
		return res;
	}
	private static int getValueInt() {
		int res = 1;
		while (res > 0) {
			res*=2;
		}
		return res;
	}
	private static long getValueLong() {
		long res = 1;
		while (res > 0) {
			res*=2;
		}
		return res;
	}
	//Комментарий
	//Rjkfkfk
}