package OnLIneScool.entyty;

    public class Students {




    private Integer id;

    static   int countStudents;
    private  int curs;
    private String name;
    private String surname;
    private  int academicPerformance;

        public Students (int height, String gender,int id,int curs,String name,String surname,int academicPerformance) {

            this.id = id;
            this.curs = curs;
            this.name = name;
            this.surname = surname;
            this.academicPerformance = academicPerformance;
            this.countStudents ++;


        }

        public Students(int height) {
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
