package OnLIneScool.entyty;

import java.util.Objects;

public class Teacher implements Comparable<Teacher> {
    private Integer id;
    static int countTeacher;
    private int curs;
    private String name;
    private String surname;
    private int academicPerformance;

        public Teacher (int height, String gender,int id,int curs,String name,String surname,int academicPerformance) {


            this.id = id;
            this.curs = curs;
            this.name = name;
            this.surname = surname;
            this.academicPerformance = academicPerformance;
            countTeacher ++;
        }



        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public static int getCountTeacher() {
            return countTeacher;
        }

        public static void setCountTeacher(int countTeacher) {
            Teacher.countTeacher = countTeacher;
        }

        public int getCurs() {
            return curs;
        }

        public void setCurs(int curs) {
            this.curs = curs;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getAcademicPerformance() {
            return academicPerformance;
        }

        public void setAcademicPerformance(int academicPerformance) {
            this.academicPerformance = academicPerformance;
        }


      /*  @Override
        public void seyHuman() {
            System.out.println("Hello I am Teaher");
        }*/

        @Override
        public String toString() {
            return "Teacher{" +
                    "id=" + id +
                    ", curs=" + curs +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", academicPerformance=" + academicPerformance +
                    '}';
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return curs == teacher.curs && academicPerformance == teacher.academicPerformance && id.equals(teacher.id) && name.equals(teacher.name) && surname.equals(teacher.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, curs, name, surname, academicPerformance);
    }

    @Override
    public int compareTo(Teacher o) {
        return 0;
    }
}
