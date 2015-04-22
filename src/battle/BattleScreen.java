package src.battle;

import java.util.Random;
import src.stats.*;

public class BattleScreen{
	static int heroHP[4]; //You get to control up to four heroes. Each hero's HP will be stored here.
	static int enemyHP[5]; //You fight up to 4 enemies. A special circumstance will fill that 5th space: BOSSES.
	static int heroSP[4]; //You use SP to perform powerful attacks.
	static int enemySP[5];