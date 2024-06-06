import java.util.*;
public class studentGradecal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float percentage,average,totalMarks=0;
        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.println("Enter total number of subjects");
        int noOfSub=sc.nextInt();
        System.out.println("Enter the marks of "+noOfSub+ " subjects" );
        for(int i=0;i<noOfSub;i++){
          totalMarks+=sc.nextInt();
        }
        System.out.println("Total marks: "+totalMarks);
        average=totalMarks/noOfSub;
        System.out.println("Average marks: "+average);
        
        percentage=(totalMarks/(noOfSub*100))*100;
        System.out.println("percentage "+percentage +" %");
        
        switch ((int)percentage/10) {
            case 9: System.out.println("Grade O");
                break;
            case 8:System.out.println("Grade A");
                break;
                case 7:System.out.println("Grade B");
                break;
                case 6:System.out.println("Grade C");
                break;
                case 5:System.out.println("Grade D");
                break;
            default:System.err.println("Fail");
                break;
        }


    } 



}
