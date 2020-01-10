package Main;

import java.util.ArrayList;

public class PocketMonVO {
	private String name;
	private String type;
	private String skill;
	private int attack;
	private int shield;

	public String toString() {
		return name + ", " + skill + ", " + type + ", " + attack + ", " + shield;
	}

	public PocketMonVO(String name, String type, String skill, int attack, int shield) {
		this.name = name;
		this.type = type;
		this.skill = skill;
		this.attack = attack;
		this.shield = shield;
	}

	public String getName() {
		return name;
	}

	public String getSkill() {
		return skill;
	}

	public String getType() {
		return type;
	}

	public int getAttack() {
		return attack;
	}

	public int getShield() {
		return shield;
	}

}
