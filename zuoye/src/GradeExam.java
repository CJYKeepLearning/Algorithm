public class GradeExam {
    public static void main(String[] args) {
        //Students' answers to the questions
        char[][] answers = {
                {'A','B','A','C','C','D','E','E','A','D'},
                {'D','B','A','B','C','A','E','E','A','D'},
                {'E','D','D','A','C','B','E','E','A','D'},
                {'C','B','A','E','D','C','E','E','A','D'},
                {'A','B','D','C','C','D','E','E','A','D'},
                {'B','B','E','C','C','D','E','E','A','D'},
                {'B','B','A','C','C','D','E','E','A','D'},
                {'E','B','E','C','C','D','E','E','A','D'}
        };
        //Key to the questions
        char[] keys = {'D','B','D','C','C','D','A','E','A','D'};
        //Grade all answers
        int[][] grades = new int[answers.length][2]; //index as student's number
        for (int i=0;i<answers.length;i++){
            int correctCount = 0;
            int j=0;
            for (;j<answers[i].length;j++){
                if (answers[i][j]==keys[j])
                    correctCount++;
            }
            grades[i][0] = i;
            grades[i][1] = correctCount;
        }
        //Sort the grade
        for (int i=0;i<answers.length-1;i++) {
            for (int j = 0; j < answers.length - i - 1; j++) {
                if (grades[j][1] > grades[j + 1][1]) {
                    int[] temp = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = temp;
                }
            }
        }
        //display
        for (int i=0;i<grades.length;i++){
                System.out.println("Student "+grades[i][0]+"'s correct count is "+grades[i][1]);
        }
    }
}
