package com.lol.tracer.model.lol.match;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParticipantStatsDto {

	private long physicalDamageDealt;
	private int neutralMinionsKilledTeamJungle;
	private long magicDamageDealt;
	private int totalPlayerScore;
	private int deaths;
	private boolean win;
	private int neutralMinionsKilledEnemyJungle;
	private int altarsCaptured;
	private int largestCriticalStrike;
	private long totalDamageDealt;
	private long magicDamageDealtToChampions;
	private int visionWardsBoughtInGame;
	private long damageDealtToObjectives;
	private int largestKillingSpree;
	private int item0;
	private int item1;
	private int item2;
	private int item3;
	private int item4;
	private int item5;
	private int item6;
	private int quadraKills;
	private int teamObjective;
	private int totalTimeCrowdControlDealt;
	private int longestTimeSpentLiving;
	private int wardsKilled;
	private boolean firstTowerAssist;
	private boolean firstTowerKill;
	private boolean firstBloodAssist;
	private long visionScore;
	private int wardsPlaced;
	private int turretKills;
	private int tripleKills;
	private long damageSelfMitigated;
	private int champLevel;
	private int nodeNeutralizeAssist;
	private boolean firstInhibitorKill;
	private int goldEarned;
	private long magicalDamageTaken;
	private int kills;
	private int doubleKills;
	private int nodeCaptureAssist;
	private long trueDamageTaken;
	private int nodeNeutralize;
	private boolean firstInhibitorAssist;
	private int assists;
	private int unrealKills;
	private int neutralMinionsKilled;
	private int objectivePlayerScore;
	private int combatPlayerScore;
	private long damageDealtToTurrets;
	private int altarsNeutralized;
	private long physicalDamageDealtToChampions;
	private int goldSpent;
	private long trueDamageDealt;
	private long trueDamageDealtToChampions;
	private int participantId;
	private int pentaKills;
	private long totalHeal;
	private int totalMinionsKilled;
	private boolean firstBloodKill;
	private int nodeCapture;
	private int largestMultiKill;
	private int sightWardsBoughtInGame;
	private long totalDamageDealtToChampions;
	private int totalUnitsHealed;
	private int inhibitorKills;
	private int totalScoreRank;
	private long totalDamageTaken;
	private int killingSprees;
	private long timeCCingOthers;
	private long physicalDamageTaken;
	private int playerScore0;
	private int playerScore1;
	private int playerScore2;
	private int playerScore3;
	private int playerScore4;
	private int playerScore5;
	private int playerScore6;
	private int playerScore7;
	private int playerScore8;
	private int playerScore9;

	private Long perk0;
	private Long perk0Var1;
    private Long perk0Var2;
    private Long perk0Var3;

    private Long perk1;
    private Long perk1Var1;
    private Long perk1Var2;
    private Long perk1Var3;

    private Long perk2;
    private Long perk2Var1;
    private Long perk2Var2;
    private Long perk2Var3;

    private Long perk3;
    private Long perk3Var1;
    private Long perk3Var2;
    private Long perk3Var3;

    private Long perk4;
    private Long perk4Var1;
    private Long perk4Var2;
    private Long perk4Var3;

    private Long perk5;
    private Long perk5Var1;
    private Long perk5Var2;
    private Long perk5Var3;

    private Long perk6;
    private Long perk6Var1;
    private Long perk6Var2;
    private Long perk6Var3;

    private Long perk7;
    private Long perk7Var1;
    private Long perk7Var2;
    private Long perk7Var3;

    private Long perk8;
    private Long perk8Var1;
    private Long perk8Var2;
    private Long perk8Var3;

    private Long perk9;
    private Long perk9Var1;
    private Long perk9Var2;
    private Long perk9Var3;
}
