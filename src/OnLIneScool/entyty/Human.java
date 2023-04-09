package OnLIneScool.entyty;

public class Human {
    protected int height;
    protected String gender;



    public void seyHuman (){
        System.out.println("Hello!");
    }

    public int getHeight() {
        System.out.println("Height");
        return 0;
    }




    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    @Override
    public String toString() {
        return "Human{" +
                "Height=" + height +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Human(int height, String gender) {
        this.height = height;
        this.gender = gender;
    }
}
