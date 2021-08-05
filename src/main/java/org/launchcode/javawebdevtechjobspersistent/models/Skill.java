package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {


    //make a new constructor for skills

    @ManyToMany(mappedBy = "skills")
    private static List<Job> jobs = new ArrayList<>();

    public static List<Job> getJobs() {
        return jobs;
    }

    public static void setJobs(List<Job> jobs) {
        Skill.jobs = jobs;
    }

    @Valid
    private String description;

    public Skill(String description, List<Job> jobs) {
        this.jobs = jobs;
        this.description = description;
    }

    public Skill() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


