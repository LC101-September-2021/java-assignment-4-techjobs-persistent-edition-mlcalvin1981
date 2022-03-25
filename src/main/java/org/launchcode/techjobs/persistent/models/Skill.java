package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 99, message = "99 max characters allowed.")
    public String description;

    @ManyToMany(mappedBy="skills")
    @NotNull
    private List<Job> jobs = new ArrayList<>();

    public Skill(){}


    public Skill(@Size(max = 99, message = "99 max characters allowed.") String description) {
                this.description = description;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}