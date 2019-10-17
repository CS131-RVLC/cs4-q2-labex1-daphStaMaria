/*
Name: STA MARIA, Daphne
Gluon 29
2QLabEx1
 */
package arraylistsq2labex1;
import java.util.ArrayList;
import java.util.*;

class Student {
    String Name;
    int Score;
   
   
    public void displayArray(ArrayList<Student> AS) {
        for(int i=0; i<AS.size(); i++){
            System.out.print(AS.get(i).Name +" ");
        }
        System.out.println(" ");

    }
   
    public void searchHighestScore(ArrayList<Student> AS) {
        int highScore;
        highScore = AS.get(0).Score;
        for(int i=0; i<AS.size();i++){
            if(AS.get(i).Score>highScore){
                highScore = AS.get(i).Score;
            }
        }
        System.out.println("highest score: " + highScore);
       
    }    
    public void sortScores(ArrayList<Student> AS) {
        ArrayList<Integer> SortScoreAl = new ArrayList<>();
        for(int i=0; i<5; i++){
            SortScoreAl.add(AS.get(i).Score);
        }
        Collections.sort(SortScoreAl);
        for(int i=0; i<5; i++){
            AS.get(i).Score = SortScoreAl.get(i);
            System.out.print(AS.get(i).Score + " ");
        }
        System.out.println(" ");
    }
   
    public void sortNames(ArrayList<Student> AS) {
        ArrayList<String> SortNameAl = new ArrayList<>();
        for(int i=0; i<5; i++){
            SortNameAl.add(AS.get(i).Name);
        }
        Collections.sort(SortNameAl);
        for(int i=0; i<5; i++){
            AS.get(i).Name = SortNameAl.get(i);
        }
        displayArray(AS);
   }
}

public class ArrayListsQ2LabEx1 {

    public static void main(String[] args) {
        String[] NameI = {"Bok", "Mik", "Jak", "Luds", "Kim"};
        int[] ScoreI = {90, 96, 91, 97, 99};
       
        ArrayList<Student> StudentArrayList = new ArrayList<Student>();
        for (int i = 0; i <= 4; i++) {
            StudentArrayList.add(new Student());
            StudentArrayList.get(i).Name = NameI[i];
            StudentArrayList.get(i).Score = ScoreI[i];
        }
       
       
        Student method = new Student();

        method.displayArray(StudentArrayList);

        method.searchHighestScore(StudentArrayList);

        method.sortScores(StudentArrayList);
       
        method.displayArray(StudentArrayList);

        method.sortNames(StudentArrayList);
       
        method.displayArray(StudentArrayList);        
       
    }
    
}
