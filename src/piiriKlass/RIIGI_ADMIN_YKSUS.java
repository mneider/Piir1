package piiriKlass;
import java.sql.Date;
import java.io.Serializable;

public class RIIGI_ADMIN_YKSUS {
	private static final long serialVersionUID = 1L;
	
	int riigi_admin_yksus_ID; //INTEGER," +
	String avaja;                //VARCHAR(32) NOT NULL," +
	Date avatud;               //DATE NOT NULL," +
	String muutja;               //VARCHAR(32) NOT NULL," +
	Date muudetud;             //DATE NOT NULL," +
	String sulgeja;              //VARCHAR(32)," +
	Date suletud;              //DATE NOT NULL," +
	String kood;                 //VARCHAR(20)," +
	String nimetus;              //VARCHAR(100)," +
	String kommentaar;           //LONGVARCHAR," +
	Date alates;               //DATE NOT NULL," +
	Date kuni;                 //DATE NOT NULL," +
	int riigi_admin_yksuse_lik_id;//INTEGER NOT NULL," +
	
	public RIIGI_ADMIN_YKSUS(){
		
	}

	public int getRiigi_admin_yksus_ID() {
		return riigi_admin_yksus_ID;
	}

	public void setRiigi_admin_yksus_ID(int riigi_admin_yksus_ID) {
		this.riigi_admin_yksus_ID = riigi_admin_yksus_ID;
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

	public int getRiigi_admin_yksuse_lik_id() {
		return riigi_admin_yksuse_lik_id;
	}

	public void setRiigi_admin_yksuse_lik_id(int riigi_admin_yksuse_lik_id) {
		this.riigi_admin_yksuse_lik_id = riigi_admin_yksuse_lik_id;
	}
	
}
