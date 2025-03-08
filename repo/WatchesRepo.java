package com.mru.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mru.entity.Watches;

public interface WatchesRepo extends JpaRepository<Watches, Integer> {

}
