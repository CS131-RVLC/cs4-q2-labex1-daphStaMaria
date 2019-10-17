/*
Name: STA MARIA, Daphne
Gluon 29
2QLabEx1
 */
package arraylistsq2labex1;

import java.util.ArrayList;

class Student {
    String Name;
    int Score;
   
   
    public void displayArray(ArrayList<Student> AS) {
//<your code to display the array elements>
        for(int i=0; i<AS.size(); i++){
            System.out.print(AS.get(i).Name +" ");
        }
    }
   
     public void searchHighestScore(ArrayList<Student> AS) {
//<your code to search for the highest score in the array>
        int highScore;
        highScore = AS.get(0).Score;
        for(int i=0; i<AS.size();i++){
            if(AS.get(i).Score>highScore){
                highScore = AS.get(i).Score;
            }
        }
        System.out.println("hs: " + highScore);
       
    }    
    public void sortScores(ArrayList<Student> AS) {
//         <your code to sort the array>

    }
   
    public void sortNames(ArrayList<Student> AS) {
//<your code to sort the array according the names>      
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
