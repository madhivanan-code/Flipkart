package DataTypeExample.copy.copy;

public class AverageMarks {

	public static void main(String[] args) {
		byte studentId=23;
        String studentName="pugazh";
        byte Mark1=89;
        byte Mark2=56;
        byte Mark3=45;
        byte Mark4=67;
        byte Mark5=66;
        
        float avg= (Mark1+Mark2+Mark3+Mark4+Mark5)/5f;
        System.out.println(studentName +" of id " + studentId + " has an average of " +avg);
        
	}
}
