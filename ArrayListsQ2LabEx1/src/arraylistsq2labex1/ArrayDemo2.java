package arraylistsq2labex1;

import java.util.ArrayList;
import java.util.Collections;

class Student2 {
    String Name;
    int Score;
    
//    <your code>

}


public class ArrayDemo2 {
    static void display(ArrayList<Student2> AS){
//        <your code to display the array elements>
        for(int i=0; i<AS.size(); i++){
            System.out.print(AS.get(i).Name +" ");
        }
        System.out.println(" ");
        for(int i=0; i<AS.size(); i++){
            System.out.print(AS.get(i).Score +" ");
        }
        System.out.println(" ");
    }

    static ArrayList<Student2> sortScores(ArrayList<Student2> AS){
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
        
        return AS;
    }
    static void searchHighestScore(ArrayList<Student2> AS){
//<your code to search for the highest score in the array>
        int highScore;
        highScore = AS.get(0).Score;
        for(int i=0; i<AS.size();i++){
            if(AS.get(i).Score>highScore){
                highScore = AS.get(i).Score;
            }
        }
        System.out.println("highest score: " + highScore);
    }

    static void sortNames (ArrayList<Student2> AS){
//		<your code to sort the array according the names>   
        ArrayList<String> SortNameAl = new ArrayList<>();
        for(int i=0; i<5; i++){
            SortNameAl.add(AS.get(i).Name);
        }
        Collections.sort(SortNameAl);
        for(int i=0; i<5; i++){
            AS.get(i).Name = SortNameAl.get(i);
        }
        display(AS);
    }

    public static void main(String[] args) {
        ArrayList<Student2> Student2ArrayList = new ArrayList<>();

        for(int x=0; x<5; x++){Student2ArrayList.add(new Student2());}

  	String[] NameI = {"Bok", "Mik", "Jak", "Luds", "Kim"};
        int[] ScoreI = {90, 96, 91, 97, 99};

        Student2ArrayList.get(0).Name = "Bok"; Student2ArrayList.get(0).Score = 90;
        Student2ArrayList.get(1).Name = "Mik"; Student2ArrayList.get(1).Score = 96;
        Student2ArrayList.get(2).Name = "Jak"; Student2ArrayList.get(2).Score = 91;
        Student2ArrayList.get(3).Name = "Luds"; Student2ArrayList.get(3).Score = 97;
        Student2ArrayList.get(4).Name = "Kim"; Student2ArrayList.get(4).Score = 99;

        display(Student2ArrayList);
        display(sortScores(Student2ArrayList));
        sortNames(Student2ArrayList);
        searchHighestScore(Student2ArrayList);
    }
}
