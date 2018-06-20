package com.lol.tracer.model.lol.staticdata;

import java.util.List;

public class ChampionDto {

	private InfoDto info;
	private List<String> enemytips;
	private StatsDto stats;
	private String name;
	private String title;
	private ImageDto image;
	private List<String> tags;
	private String partype;
	private List<SkinDto> skins;
	private PassiveDto passvie;
	private List<RecommendedDto> recommended;
	private List<String> allytips;
	private String key;
	private String lore;
	private int id;
	private String blurb;
	private List<ChampionSpellDto> spells;
	public InfoDto getInfo() {
		return info;
	}
	public void setInfo(InfoDto info) {
		this.info = info;
	}
	public List<String> getEnemytips() {
		return enemytips;
	}
	public void setEnemytips(List<String> enemytips) {
		this.enemytips = enemytips;
	}
	public StatsDto getStats() {
		return stats;
	}
	public void setStats(StatsDto stats) {
		this.stats = stats;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ImageDto getImage() {
		return image;
	}
	public void setImage(ImageDto image) {
		this.image = image;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public String getPartype() {
		return partype;
	}
	public void setPartype(String partype) {
		this.partype = partype;
	}
	public List<SkinDto> getSkins() {
		return skins;
	}
	public void setSkins(List<SkinDto> skins) {
		this.skins = skins;
	}
	public PassiveDto getPassvie() {
		return passvie;
	}
	public void setPassvie(PassiveDto passvie) {
		this.passvie = passvie;
	}
	public List<RecommendedDto> getRecommended() {
		return recommended;
	}
	public void setRecommended(List<RecommendedDto> recommended) {
		this.recommended = recommended;
	}
	public List<String> getAllytips() {
		return allytips;
	}
	public void setAllytips(List<String> allytips) {
		this.allytips = allytips;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getLore() {
		return lore;
	}
	public void setLore(String lore) {
		this.lore = lore;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBlurb() {
		return blurb;
	}
	public void setBlurb(String blurb) {
		this.blurb = blurb;
	}
	public List<ChampionSpellDto> getSpells() {
		return spells;
	}
	public void setSpells(List<ChampionSpellDto> spells) {
		this.spells = spells;
	}
	@Override
	public String toString() {
		return "ChampionDto [info=" + info + ", enemytips=" + enemytips + ", stats=" + stats + ", name=" + name
				+ ", title=" + title + ", image=" + image + ", tags=" + tags + ", partype=" + partype + ", skins="
				+ skins + ", passvie=" + passvie + ", recommended=" + recommended + ", allytips=" + allytips + ", key="
				+ key + ", lore=" + lore + ", id=" + id + ", blurb=" + blurb + ", spells=" + spells + "]";
	}
	
	
}
