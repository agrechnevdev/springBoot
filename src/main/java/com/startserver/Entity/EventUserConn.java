package com.startserver.Entity;

import javax.persistence.*;

@Entity
@Table(name = "event_user_conn")
public class EventUserConn {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="eventid", nullable=false)
    private Event eventid;

    @Column(name = "userid", nullable = false)
    private Integer userid;

    public EventUserConn(Integer id, Event eventid, Integer userid) {
        this.id = id;
        this.eventid = eventid;
        this.userid = userid;
    }

    public EventUserConn() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Event getEventid() {
        return eventid;
    }

    public void setEventid(Event eventid) {
        this.eventid = eventid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
