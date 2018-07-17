package com.service;

import com.view.logindexView;

import java.util.List;

public interface LogService {
    List<logindexView> findalllog();

    void deleteLogById(String id);
}
