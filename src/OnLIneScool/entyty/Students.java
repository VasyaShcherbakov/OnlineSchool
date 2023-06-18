package OnLIneScool.entyty;
import java.io.Serializable;
import java.util.Optional;

    public class Students implements Serializable {




    private Integer id;

    private int databaseResponse;
    private int homewrok;
    static   int countStudents;
    private  int curs;
    private String name;
    private String surname;
    private  int academicPerformance;

        public Optional<Integer> getID() {return Optional.ofNullable(id);
        }

        public Optional<Integer> getDatabaseResponse() {
            return Optional.ofNullable(databaseResponse);
        }
        public Students(Integer id, int databaseResponse, int homewrok) {
            this.id = id;
            this.databaseResponse = databaseResponse;
            this.homewrok = homewrok;
        }

        public Students (int height, String gender) {

            this.id = id;
            this.databaseResponse = databaseResponse;
            this.curs = curs;
            this.name = name;
            this.surname = surname;
            this.academicPerformance = academicPerformance;
            this.countStudents ++;


        }

        public Students(int height, int databaseResponse) {
            this.databaseResponse = databaseResponse;
        }





        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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

        public static int getCountStudents() {
            return countStudents;
        }

        public static void setCountStudents(int countStudents) {
            Students.countStudents = countStudents;
        }

        @Override
        public String toString() {
            return "Students{" +
                    "id=" + id +
                    ", curs=" + curs +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", academicPerformance=" + academicPerformance +
                    '}';
        }

    }
