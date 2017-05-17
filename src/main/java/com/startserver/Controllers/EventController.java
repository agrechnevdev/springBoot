package com.startserver.Controllers;


import com.startserver.Entity.Event;
import com.startserver.Entity.User;
import com.startserver.Services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.net.URL;
import java.util.Collection;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/userid={userid}", method = RequestMethod.GET)
    public Collection<Event> getEventsByUserId(@PathVariable("userid") Integer userId) {
        return eventService.getEventsByUserId(userId);
    }

    @RequestMapping(value = "/userid", method = RequestMethod.POST, consumes = "application/json", headers = "content-type=application/x-www-form-urlencoded")
    public Collection<Event> getEventsByUserIdPost(@RequestBody Integer userid) {
        return eventService.getEventsByUserId(userid);
    }

    @ResponseBody
    @RequestMapping(value = "/icon={eventid}", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getEventIcon(@PathVariable("eventid") Integer eventid) {
        InputStream in=null;
        File file = new File("D:\\Projects\\SpringBoot\\src\\main\\resources\\" + eventid  + ".jpg");
        byte[] bytesArray = new byte[(int) file.length()];
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);

            fis.read(bytesArray);
            fis.close();
        } catch (FileNotFoundException ex){
            return bytesArray;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytesArray;
    }
}
