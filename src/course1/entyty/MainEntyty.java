package course1.entyty;

import javax.swing.*;

class MainEntyty {
 public static void main(String[] args) {
  Teacher teacher = new Teacher(1, "Petro", "Zaharovich", 100);
  teacher.count++;
  Teacher teacher1 = new Teacher(2, "Shastyslav", "Vitanovich", 90);
  teacher.count++;
  Teacher teacher2 = new Teacher(3, "Tsvitanna", "Yanivna", 95);
  teacher.count++;
  Students students = new Students(5, "Vlada", "Vadimivna", 80);
  students.count++;
  Students students1 = new Students(5, "Zvonimira", "Semenivna", 80);
  students.count++;
  Students students2 = new Students(6, "Odarka", "Timurivna", 95);
  students.count++;
  Lectures lectures = new Lectures(7, "Nikodim", "Pilipovith", 60);
  lectures.count++;
  Lectures lectures1 = new Lectures(8, "Tverdigorst", "Yaromirovith", 85);
  lectures.count++;
  Lectures lectures2 = new Lectures(9, "Juliy", "Arsenovith", 85);
  lectures.count++;
  int generalPreformence ;
  int totalPerformance ;

  generalPreformence =(teacher.academicPerformance+teacher1.academicPerformance+teacher2.academicPerformance+students.academicPerformance+students1.academicPerformance+students2.academicPerformance+lectures.academicPerformance+lectures1.academicPerformance+lectures2.academicPerformance) / 9;
  System.out.println("Total Performance = "+generalPreformence);


  teacher.sayNameTeacher();
  teacher.count();
  students.count();
  lectures.count();
 }



}

