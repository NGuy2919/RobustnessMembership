package sqa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import sqa.main.Ranking;

public class RobustnessMembership {

	@Test
	public void testTC014() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, -1, 500);
		assertEquals("Standard",res);
	}

	@Test
	public void testTC015() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 0, 500);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC016() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 1, 500);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC017() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 15, 500);
		assertEquals("Standard",res);
	}

	@Test
	public void testTC018() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 30, 500);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC019() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 31, 500);
		assertEquals("Standard",res);
	}
	@Test
	public void testTC020() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 32, 500);
		assertEquals("Standard",res);
	}

	@Test
	public void testTC021() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 15, -1);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC022() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 15, 0);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC023() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 15, 1);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC024() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 15, 999);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC025() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 15, 1000);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC026() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 15, 1001);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC027() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(-1, 15, 500);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC028() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(0, 0, 500);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC029() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(1, 15, 500);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC030() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(99999, 15, 500);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC031() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(100000, 15, 500);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC032() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(100001, 15, 500);
		assertEquals("Standard",res);
	}
}
