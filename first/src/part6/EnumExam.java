package part6;

public class EnumExam {
	public static final String MALE="MALE";
	public static final String FEMAIL="FEMALE";
	public static void main(String[] args) {
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMAIL;
		
		gender1 ="boy";
		
		Gender gender2;
		gender2=Gender.MALE;
		gender2=Gender.FEMAALE;
		
		//gender2="boy"; 에러 발생
		System.out.println(Gender.MALE);
		
		
		System.out.println(Gender.FEMAALE.getTable1Value());
	}
	
}


enum Gender{
	MALE("남", true),FEMAALE("여", false);
	
	private String table1Value;
	private boolean table2Value;
	
	Gender(String table1Value, boolean table2Value){
		this.table1Value=table1Value;
		this.table2Value=table2Value;
	}
	
	public String getTable1Value() {
		return table1Value;
	}
	
	public boolean isTable2Value() {
		return table2Value;
	}
}




enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    public String color;
    Fruit(String color){
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
}