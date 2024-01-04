package com.jagex;

public class Class320_Sub20 extends Class320
{
	static int anInt8394;
	static int anInt8395;
	static int anInt8396;
	static int anInt8397;
	static int anInt8398;
	static int anInt8399;
	static int anInt8400;
	static int anInt8401;
	static int anInt8402;
	
	static final byte[] method3756(int i, int i_0_, int i_1_, float f, float f_2_, float f_3_, int i_4_, int i_5_, float f_6_, float f_7_, Class328 class328) {
		anInt8400++;
		byte[] bs = new byte[128 * 128 * 16];
		Node_Sub24.method2647((byte) 119, (float) 4.0, (float) 16.0, (float) 0.5, (float) 4.0, 16, bs, 128, 0, (float) 0.6, 128, class328, 8);
		return bs;
	}
	
	final boolean method3757(byte b) {
		anInt8396++;
		if ((byte) 116 <= 63) {
			return false;
		}
		if (!Class262_Sub3.method3157(aNode_Sub27_4063.aClass320_Sub29_7270.method3791(false), (byte) 28)) {
			return false;
		}
		return true;
	}
	
	final int method3675(int i, byte b) {
		anInt8394++;
		if (b != 54) {
			return -10;
		}
		if (!Class262_Sub3.method3157(aNode_Sub27_4063.aClass320_Sub29_7270.method3791(false), (byte) 28)) {
			return 3;
		}
		return 1;
	}
	
	final void method3673(byte b) {
		if (b <= -35) {
			anInt8395++;
			if (aNode_Sub27_4063.aClass320_Sub29_7270.method3789(-1) && !Class262_Sub3.method3157(aNode_Sub27_4063.aClass320_Sub29_7270.method3791(false), (byte) 28)) {
				anInt4064 = 0;
			}
			if (anInt4064 < 0 || anInt4064 > 1) {
				anInt4064 = method3677(0);
			}
		}
	}
	
	Class320_Sub20(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	final void method3676(boolean bool, int i) {
		anInt8399++;
		if (bool == false) {
			anInt4064 = i;
		}
	}
	
	final int method3758(boolean bool) {
		if (false != false) {
			anInt8397 = -31;
		}
		anInt8398++;
		return anInt4064;
	}
	
	final int method3677(int i) {
		if (i != 0) {
			anInt8402 = -113;
		}
		anInt8401++;
		return 0;
	}
	
	Class320_Sub20(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
}
