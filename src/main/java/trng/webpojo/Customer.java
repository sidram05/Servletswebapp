package trng.webpojo;

public class Customer {
	
	private String fname;
	private String lname;
	private String email;
	private int cardNo;
	private String cardName;
	private String bstate;
	private int bzip;
	private String bcountry;
	private String sstreet;
	private String scity;
	private String sstate;
	private int szip;
	private String scountry;
	private String other;
	
	
	public Customer(String fname, String lname, String email, int cardNo, String cardName, String bstate, int bzip,
			String bcountry, String sstreet, String scity, String sstate, int szip, String scountry, String other) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.cardNo = cardNo;
		this.cardName = cardName;
		this.bstate = bstate;
		this.bzip = bzip;
		this.bcountry = bcountry;
		this.sstreet = sstreet;
		this.scity = scity;
		this.sstate = sstate;
		this.szip = szip;
		this.scountry = scountry;
		this.other = other;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getcardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getBstate() {
		return bstate;
	}
	public void setBstate(String bstate) {
		this.bstate = bstate;
	}
	public int getBzip() {
		return bzip;
	}
	public void setBzip(int bzip) {
		this.bzip = bzip;
	}
	public String getBcountry() {
		return bcountry;
	}
	public void setBcountry(String bcountry) {
		this.bcountry = bcountry;
	}
	public String getSstreet() {
		return sstreet;
	}
	public void setSstreet(String sstreet) {
		this.sstreet = sstreet;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public String getSstate() {
		return sstate;
	}
	public void setSstate(String sstate) {
		this.sstate = sstate;
	}
	public int getSzip() {
		return szip;
	}
	public void setSzip(int szip) {
		this.szip = szip;
	}
	public String getScountry() {
		return scountry;
	}
	public void setScountry(String scountry) {
		this.scountry = scountry;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	@Override
	public String toString() {
		return "Customer [fname=" + fname + ", lname=" + lname + ", email=" + email + ", cardNo=" + cardNo
				+ ", cardName=" + cardName + ", bstate=" + bstate + ", bzip=" + bzip + ", bcountry=" + bcountry
				+ ", sstreet=" + sstreet + ", scity=" + scity + ", sstate=" + sstate + ", szip=" + szip + ", scountry="
				+ scountry + ", other=" + other + "]";
	}
	
	
	

}
