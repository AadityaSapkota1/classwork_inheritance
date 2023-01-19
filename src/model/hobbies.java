package model;

import java.util.ArrayList;

public class hobbies {
    String hobby_name;
    String hobby_type;

    public hobbies(String hobby_name, String hobby_type) {
        this.hobby_name = hobby_name;
        this.hobby_type = hobby_type;
    }

    public String getHobby_name() {
        return hobby_name;
    }

    public void setHobby_name(String hobby_name) {
        this.hobby_name = hobby_name;
    }

    public String getHobby_type() {
        return hobby_type;
    }

    public void setHobby_type(String hobby_type) {
        this.hobby_type = hobby_type;
    }
}
