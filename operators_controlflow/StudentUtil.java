package operators_controlflow;

import java.util.ArrayList;

public class StudentUtil {
	 public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
	        // your code
		 double[] grades = new double[studentIdList.length];
	        int i = 0;

	        for (char[] studentGrade : studentsGrades) {
	            double sumGrades = 0.0;

	            for (char grade : studentGrade) {
	                if (grade == 'A') {
	                    sumGrades += 4;
	                } else if (grade == 'B') {
	                    sumGrades += 3;
	                } else {
	                    sumGrades += 2;
	                }
	            }
	            grades[i++] = sumGrades / studentGrade.length;
	        }

	        return grades;
	    }
	 
	 public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
	        // perform parameter validation. Return null if passed parameters are not valid
		 if (lower < 0.0) {
	            return null;
	        }

	        if (higher > 4.0) {
	            return null;
	        }

	        if (lower > higher) {
	            return null;
	        }

	        if (studentIdList.length != studentsGrades.length) {
	            return null;
	        }
	        // invoke calculateGPA
	        
	        double[] gpas = calculateGPA(studentIdList, studentsGrades);
	        ArrayList<Integer> ids = new ArrayList<>(); 

	        for (int i = 0; i < studentIdList.length; i++) {
	            if (gpas[i] >= lower && gpas[i] <= higher) {
	                ids.add(studentIdList[i]);
	            }
	        }
	        
	        // construct the result array and return it. You would need an extra for loop to compute the size of the resulting array
	        
	        int[] ret = new int[ids.size()];

	        for (int i = 0; i < ret.length; i++) {
	            ret[i] = ids.get(i);
	        }

	        return ret;
	    }
	   

	
}
