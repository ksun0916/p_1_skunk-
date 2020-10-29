package skunk.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlayer {

	@Test
	public void test_create_new_player() {
		Player player = new Player();
		assertEquals(player.getClass(), Player.class);
	}
	
	@Test
	public void test_set_chip() {
		Player player = new Player();
		assertEquals(player.getChip(), 50);
		player.setChip(100);
		assertEquals(player.getChip(), 100);
	}
	
	@Test
	public void test_adjust_chip() {
		Player player = new Player();
		assertEquals(player.getChip(), 50);
		player.adjustChip(10);
		assertEquals(player.getChip(), 60);
		player.adjustChip(-5);
		assertEquals(player.getChip(), 55);
	}
	
	@Test
	public void test_add_point() {
		fail();
	}

}
