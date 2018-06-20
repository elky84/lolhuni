package com.lol.tracer.model.lol.staticdata;

public class InfoDto {

	private int difficulty;
	private int attack;
	private int defense;
	private int magic;
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getMagic() {
		return magic;
	}
	public void setMagic(int magic) {
		this.magic = magic;
	}
	@Override
	public String toString() {
		return "InfoDto [difficulty=" + difficulty + ", attack=" + attack + ", defense=" + defense + ", magic=" + magic
				+ "]";
	}
	
}
