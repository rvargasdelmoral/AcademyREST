/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lolo
 */
@XmlRootElement
public class SubjectDTO {
    @XmlElement
    private String name;
    @XmlElement
    private String cycle;
    @XmlElement
    private String course;
    @XmlElement
    private int hours;
    
    public SubjectDTO(){};
    
    public SubjectDTO(String name, String cycle, String course, int hours){
        this.name = name;
        this.cycle = cycle;
        this.course = course;
        this.hours = hours;
    }

    public String getCourse() {
        return course;
    }

    public String getCycle() {
        return cycle;
    }

    public int getHours() {
        return hours;
    }

    public String getName() {
        return name;
    }

}
