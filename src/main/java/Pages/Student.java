package Pages;

public class Student {
    String groupID;
    String name;
    String lastName;
    String englishLvl;
    String cvUrl;
    String imgUrl;
    String entryScore;
    String approvedBy;

    public Student(String groupID, String name, String lastName, String englishLvl, String cvUrl,
                   String imgUrl, String entryScore, String approvedBy)
    {
        this.groupID = groupID;
        this.name = name;
        this.lastName = lastName;
        this.englishLvl = englishLvl;
        this.cvUrl = cvUrl;
        this.imgUrl = imgUrl;
        this.entryScore = entryScore;
        this.approvedBy = approvedBy;
    }

   public String getGroupID()
   {
       return groupID;
   }
   public String getName()
   {
       return name;
   }
   public String getLastName()
   {
       return lastName;
   }
   public String getEnglishLvl()
   {
       return englishLvl;
   }
   public String getCvUrl()
   {
       return cvUrl;
   }
   public String getImgUrl(){
        return imgUrl;
   }
   public String getEntryScore()
   {
       return entryScore;
   }
   public String getApprovedBy(){
       return  approvedBy;
   }
}
