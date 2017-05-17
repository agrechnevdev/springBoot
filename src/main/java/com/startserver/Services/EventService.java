package com.startserver.Services;

import com.startserver.Dao.EventDao;
import com.startserver.Entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EventService {

    @Autowired
    private EventDao eventDao;

    public Collection<Event> getEventsByUserId(Integer userId) {
        return eventDao.getEventsByUserId(userId);
    }
}
