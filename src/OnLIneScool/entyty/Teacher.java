package OnLIneScool.entyty;

    public class Teacher implements Person {
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


        @Override
        public void seyHuman() {
            System.out.println("Hello I am Teaher");
        }

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
    }
