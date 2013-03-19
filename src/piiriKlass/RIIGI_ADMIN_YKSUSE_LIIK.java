package piiriKlass;

import java.sql.Date;
import java.io.Serializable;

public class RIIGI_ADMIN_YKSUSE_LIIK {
	private static final long serialVersionUID = 1L;
	
	
	
	 int riigi_admin_yksuse_lik_id;
	 String avaja;
	 Date avatud;               
	 String muutja;              
	 Date muudetud;             
	 String sulgeja;              
	 Date suletud;              
	 String kood;                
     String nimetus;              
	 String kommentaar;           
	 Date alates;               
	 Date kuni;                 

	 public RIIGI_ADMIN_YKSUSE_LIIK (){
		 
	 }

	public int getRiigi_admin_yksuse_lik_id() {
		return riigi_admin_yksuse_lik_id;
	}

	public void setRiigi_admin_yksuse_lik_id(int riigi_admin_yksuse_lik_id) {
		this.riigi_admin_yksuse_lik_id = riigi_admin_yksuse_lik_id;
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

	public String getKood() {
		return kood;
	}

	public void setKood(String kood) {
		this.kood = kood;
	}

	public String getNimetus() {
		return nimetus;
	}

	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
	}

	public String getKommentaar() {
		return kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
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
	 
	 
}
