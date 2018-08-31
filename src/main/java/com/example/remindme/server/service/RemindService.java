package com.example.remindme.server.service;

import com.example.remindme.server.entity.Remind;

import java.util.List;

public interface RemindService {

    List<Remind> getAll();
    Remind getByID(long id);
    Remind save(Remind remind);
    void remove(long id);

}
