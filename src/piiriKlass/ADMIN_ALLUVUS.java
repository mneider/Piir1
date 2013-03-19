package piiriKlass;

import java.sql.Date;
import java.io.Serializable;

public class ADMIN_ALLUVUS {
	private static final long serialVersionUID = 1L;
	
	int admin_alluvus_id;     //INTEGER," +
	String avaja;                //VARCHAR(32) NOT NULL," +
	Date avatud;               //DATE NOT NULL," +
	String muutja;               //VARCHAR(32) NOT NULL," +
	Date muudetud;             //DATE NOT NULL," +
	String sulgeja;              //VARCHAR(32)," +
	Date suletud;              //DATE NOT NULL," +
	Date alates;               //DATE NOT NULL," +
	Date kuni;                 //DATE NOT NULL," +
	String kommentaar;           //CHAR(18)," +
	int ylemus_yksus_ID;      //INTEGER NOT NULL," +
	int alluv_yksus_ID;       //INTEGER NOT NULL," +

	public ADMIN_ALLUVUS(){
	}

	public int getAdmin_alluvus_id() {
		return admin_alluvus_id;
	}

	public void setAdmin_alluvus_id(int admin_alluvus_id) {
		this.admin_alluvus_id = admin_alluvus_id;
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

	public Date getAlates() {
		return alates;
	}

	public void setAlates(Date alates) {
		this.alates = alates;
	}

	public Date getKuni() {
		return kuni;
	}

	public void setKuni(Date kuni) {
		this.kuni = kuni;
	}

	public String getKommentaar() {
		return kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}

	public int getYlemus_yksus_ID() {
		return ylemus_yksus_ID;
	}

	public void setYlemus_yksus_ID(int ylemus_yksus_ID) {
		this.ylemus_yksus_ID = ylemus_yksus_ID;
	}

	public int getAlluv_yksus_ID() {
		return alluv_yksus_ID;
	}

	public void setAlluv_yksus_ID(int alluv_yksus_ID) {
		this.alluv_yksus_ID = alluv_yksus_ID;
	}
	
	
}
