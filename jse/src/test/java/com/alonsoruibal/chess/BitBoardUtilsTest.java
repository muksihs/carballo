package com.alonsoruibal.chess;

import com.alonsoruibal.chess.bitboard.BitboardUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitBoardUtilsTest {

	@Test
	public void testHorizontalLine() {
		assertEquals((1L << 7) | (1L << 6) | (1L << 5), BitboardUtils.getHorizontalLine((1L << 7), (1L << 5)));
		assertEquals((1L << 63) | (1L << 62) | (1L << 61) | (1L << 60), BitboardUtils.getHorizontalLine((1L << 63), (1L << 60)));
	}

	@Test
	public void testLsb() {
		assertEquals((1L), Long.lowestOneBit(1L));
		assertEquals((1L << 63), Long.lowestOneBit(1L << 63));
		assertEquals((1L << 32), Long.lowestOneBit((1L << 63) | 1L << 32));
		assertEquals(1L, Long.lowestOneBit((1L << 32) | 1L));
		assertEquals(0, Long.lowestOneBit(0));
	}

	@Test
	public void testMsb() {
		assertEquals((1L), Long.highestOneBit(1L));
		assertEquals((1L << 63), Long.highestOneBit(1L << 63));
		assertEquals((1L << 63), Long.highestOneBit((1L << 63) | 1L << 32));
		assertEquals((1L << 32), Long.highestOneBit((1L << 32) | 1L));
		assertEquals(0, Long.highestOneBit(0));
	}
}
