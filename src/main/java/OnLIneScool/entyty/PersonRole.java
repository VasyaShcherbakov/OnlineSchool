package OnLIneScool.entyty;

public enum PersonRole {

    STUDENT ("1234"),


    TEACHER("2321");

    private String translation;

    private PersonRole (String translation) {

        this.translation = translation;
    }


     public String getTranslation () {
        return translation;

}

}
