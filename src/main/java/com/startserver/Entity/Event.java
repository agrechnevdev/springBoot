package com.startserver.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "info", nullable = true)
    private String info;

    @Column(name = "eventdate", nullable = false)
    private Date eventdate;

    @Column(name = "icon", nullable = true)
    private byte[] icon;

    public Event(Integer id, String name, String info, Date eventdate, byte[] icon) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.eventdate = eventdate;
        this.icon = icon;
    }

    public Event() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Date getEventdate() {
        return eventdate;
    }

    public void setEventdate(Date eventdate) {
        this.eventdate = eventdate;
    }

    public byte[] getIcon() {
        return icon;
    }

    public void setIcon(byte[] icon) {
        this.icon = icon;
    }

}
