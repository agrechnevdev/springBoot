package com.startserver.Dao;

import com.startserver.Entity.Event;
import com.startserver.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class EventDao {

    @Autowired
    private EventRepository eventRepository;

    public Collection<Event> getEventsByUserId(Integer userId) {
        return eventRepository.getEventsByUserId(userId);
    }
}
