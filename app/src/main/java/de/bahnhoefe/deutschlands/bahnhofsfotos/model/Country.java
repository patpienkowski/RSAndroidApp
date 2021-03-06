package de.bahnhoefe.deutschlands.bahnhofsfotos.model;

import java.io.Serializable;

public class Country implements Serializable {
    private String name;
    private String code;
    private String email;
    private String twitterTags;
    private String timetableUrlTemplate;

    public Country() {

    }

    public Country(String name, String code, String email, String twitterTags, String timetableUrlTemplate) {
        this.name = name;
        this.code = code;
        this.email = email;
        this.twitterTags = twitterTags;
        this.timetableUrlTemplate = timetableUrlTemplate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTwitterTags() {
        return twitterTags;
    }

    public void setTwitterTags(String twitterTags) {
        this.twitterTags = twitterTags;
    }

    public String getTimetableUrlTemplate() {
        return timetableUrlTemplate;
    }

    public void setTimetableUrlTemplate(String timetableUrlTemplate) {
        this.timetableUrlTemplate = timetableUrlTemplate;
    }

    @Override
    public String toString() {
        return "Land [Laendername=" + name + ", Laenderkuerzel=" + code + ", E-Mail=" + email + ", TwitterTags=" + twitterTags + ", TimetableUrlTemplate=" + timetableUrlTemplate + "]";
    }

}
