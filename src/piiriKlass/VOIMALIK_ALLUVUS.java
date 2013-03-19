package piiriKlass;

import java.sql.Date;
import java.io.Serializable;

public class VOIMALIK_ALLUVUS {
	private static final long serialVersionUID = 1L;
	
	int voimalik_alluvus_id; //  INTEGER," +
	String avaja;            //  VARCHAR(32) NOT NULL," +
	Date avatud;             //  DATE NOT NULL," +
	String muutja;           //  VARCHAR(32) NOT NULL," +
	Date muudetud;             // DATE NOT NULL," +
	String sulgeja;              //VARCHAR(32)," +
	Date suletud;              //DATE NOT NULL," +
	int riigi_admin_yksuse_lik_id; // INTEGER NOT NULL," +
	int voimalik_alluv_liik_ID; //INTEGER // NOT NULL," +
	String kommentaar;           //LONGVARCHAR," +
    
	public VOIMALIK_ALLUVUS () {
		
	}

	public int getVoimalik_alluvus_id() {
		return voimalik_alluvus_id;
	}

	public void setVoimalik_alluvus_id(int voimalik_alluvus_id) {
		this.voimalik_alluvus_id = voimalik_alluvus_id;
	}

	public String getAvaja() {
		return avaja;
	}

	public void setAvaja(String avaja) {
		this.avaja = avaja;
	}

	public Date getAvatud() {
		return avatud;
	}

	public void setAvatud(Date avatud) {
		this.avatud = avatud;
	}

	public String getMuutja() {
		return muutja;
	}

	public void setMuutja(String muutja) {
		this.muutja = muutja;
	}

	public Date getMuudetud() {
		return muudetud;
	}

	public void setMuudetud(Date muudetud) {
		this.muudetud = muudetud;
	}

	public String getSulgeja() {
		return sulgeja;
	}

	public void setSulgeja(String sulgeja) {
		this.sulgeja = sulgeja;
	}

	public Date getSuletud() {
		return suletud;
	}

	public void setSuletud(Date suletud) {
		this.suletud = suletud;
	}

	public int getRiigi_admin_yksuse_lik_id() {
		return riigi_admin_yksuse_lik_id;
	}

	public void setRiigi_admin_yksuse_lik_id(int riigi_admin_yksuse_lik_id) {
		this.riigi_admin_yksuse_lik_id = riigi_admin_yksuse_lik_id;
	}

	public int getVoimalik_alluv_liik_ID() {
		return voimalik_alluv_liik_ID;
	}

	public void setVoimalik_alluv_liik_ID(int voimalik_alluv_liik_ID) {
		this.voimalik_alluv_liik_ID = voimalik_alluv_liik_ID;
	}

	public String getKommentaar() {
		return kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}
	
	
}
