public class SocialMedia extends Persons {
    private String lineID;
    private String whatsappNumber;
    private String facebookID;
    private String instaID;
    private String twitterID;
    private String personalwebsite;
    private String areaOfInterest;
    private String keywordExpertise;
    private String personalDesc;

    public SocialMedia() {
    }

    public SocialMedia(String lineID, String whatsappNumber, String facebookID, String instaID, String twitterID,
            String personalwebsite, String areaOfInterest, String keywordExpertise, String personalDesc) {
        this.lineID = lineID;
        this.whatsappNumber = whatsappNumber;
        this.facebookID = facebookID;
        this.instaID = instaID;
        this.twitterID = twitterID;
        this.personalwebsite = personalwebsite;
        this.areaOfInterest = areaOfInterest;
        this.keywordExpertise = keywordExpertise;
        this.personalDesc = personalDesc;
    }

    public String getLineID() {
        return this.lineID;
    }

    public void setLineID(String lineID) {
        this.lineID = lineID;
    }

    public String getWhatsappNumber() {
        return this.whatsappNumber;
    }

    public void setWhatsappNumber(String whatsappNumber) {
        this.whatsappNumber = whatsappNumber;
    }

    public String getFacebookID() {
        return this.facebookID;
    }

    public void setFacebookID(String facebookID) {
        this.facebookID = facebookID;
    }

    public String getInstaID() {
        return this.instaID;
    }

    public void setInstaID(String instaID) {
        this.instaID = instaID;
    }

    public String getTwitterID() {
        return this.twitterID;
    }

    public void setTwitterID(String twitterID) {
        this.twitterID = twitterID;
    }

    public String getPersonalwebsite() {
        return this.personalwebsite;
    }

    public void setPersonalwebsite(String personalwebsite) {
        this.personalwebsite = personalwebsite;
    }

    public String getAreaOfInterest() {
        return this.areaOfInterest;
    }

    public void setAreaOfInterest(String areaOfInterest) {
        this.areaOfInterest = areaOfInterest;
    }

    public String getKeywordExpertise() {
        return this.keywordExpertise;
    }

    public void setKeywordExpertise(String keywordExpertise) {
        this.keywordExpertise = keywordExpertise;
    }

    public String getPersonalDesc() {
        return this.personalDesc;
    }

    public void setPersonalDesc(String personalDesc) {
        this.personalDesc = personalDesc;
    }

    public void displayDetails() {
        System.out.println("Line ID\t\t\t: " + this.lineID);
        System.out.println("Whatsapp Number\t\t: " + this.whatsappNumber);
        System.out.println("Facebook ID\t\t: " + this.facebookID);
        System.out.println("Instagram ID\t\t: " + this.instaID);
        System.out.println("Twitter ID\t\t: " + this.twitterID);
        System.out.println("Personal Website\t: " + this.personalwebsite);
        System.out.println("Area Of Interest\t: " + this.areaOfInterest);
        System.out.println("Keyword Expertise\t: " + this.keywordExpertise);
        System.out.println("Personal Desc\t\t: " + this.personalDesc);
    }

    public void displayDetails(String namaVariabel) {
        switch (namaVariabel) {
            case "lineID":
                System.out.println("Line ID\t\t\t: " + this.lineID);
            case "whatsappNumber":
                System.out.println("Whatsapp Number\t\t: " + this.whatsappNumber);
            case "facebookID":
                System.out.println("Facebook ID\t\t: " + this.facebookID);
            case "instaID":
                System.out.println("Instagram ID\t\t: " + this.instaID);
            case "twitterID":
                System.out.println("Twitter ID\t\t: " + this.twitterID);
            case "personalwebsite":
                System.out.println("Personal Website\t: " + this.personalwebsite);
            case "areaOfInterest":
                System.out.println("Area Of Interest\t: " + this.areaOfInterest);
            case "keywordExpertise":
                System.out.println("Keyword Expertise\t: " + this.keywordExpertise);
            case "personalDesc":
                System.out.println("Personal Desc\t\t: " + this.personalDesc);
        }
    }
}
