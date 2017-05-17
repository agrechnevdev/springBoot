package com.startserver.Repository;

import com.startserver.Entity.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface EventRepository extends CrudRepository<Event, Integer>{

    @Query("select euc.eventid FROM EventUserConn euc  where euc.userid = :id ")
    Collection<Event> getEventsByUserId(@Param("id") Integer id);
}
