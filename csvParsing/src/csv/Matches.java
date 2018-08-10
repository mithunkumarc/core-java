package csv;

import java.time.LocalDate;

public class Matches {
	String MATCH_ID;	
	String SEASON;	
	String CITY;	
	LocalDate DATE;	
	String TEAM1;	
	String TEAM2;	
	String TOSS_WINNER;	
	String TOSS_DECISION;	
	String RESULT;	
	String WINNER;
		
	public Matches(String MATCH_ID,String SEASON,String CITY,LocalDate DATE,String TEAM1,String TEAM2,String TOSS_WINNER,String TOSS_DECISION,String RESULT,String WINNER) {
		this.MATCH_ID = MATCH_ID;
		this.SEASON = SEASON;
		this.CITY = CITY;
		this.DATE = DATE;
		this.TEAM1 = TEAM1;
		this.TEAM2 = TEAM2;
		this.TOSS_DECISION = TOSS_DECISION;
		this.TOSS_WINNER = TOSS_WINNER;
		this.RESULT = RESULT;
		this.WINNER = WINNER;
	}
	
	public String getMATCH_ID() {
		return MATCH_ID;
	}
	public void setMATCH_ID(String mATCH_ID) {
		MATCH_ID = mATCH_ID;
	}
	public String getSEASON() {
		return SEASON;
	}
	public void setSEASON(String sEASON) {
		SEASON = sEASON;
	}
	public String getCITY() {
		return CITY;
	}
	public void setCITY(String cITY) {
		CITY = cITY;
	}
	public LocalDate getDATE() {
		return DATE;
	}
	public void setDATE(LocalDate dATE) {
		DATE = dATE;
	}
	public String getTEAM1() {
		return TEAM1;
	}
	public void setTEAM1(String tEAM1) {
		TEAM1 = tEAM1;
	}
	public String getTEAM2() {
		return TEAM2;
	}
	public void setTEAM2(String tEAM2) {
		TEAM2 = tEAM2;
	}
	public String getTOSS_WINNER() {
		return TOSS_WINNER;
	}
	public void setTOSS_WINNER(String tOSS_WINNER) {
		TOSS_WINNER = tOSS_WINNER;
	}
	public String getTOSS_DECISION() {
		return TOSS_DECISION;
	}
	public void setTOSS_DECISION(String tOSS_DECISION) {
		TOSS_DECISION = tOSS_DECISION;
	}
	public String getRESULT() {
		return RESULT;
	}
	public void setRESULT(String rESULT) {
		RESULT = rESULT;
	}
	public String getWINNER() {
		return WINNER;
	}
	public void setWINNER(String wINNER) {
		WINNER = wINNER;
	}	
}
