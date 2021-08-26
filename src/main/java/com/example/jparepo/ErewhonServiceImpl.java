package com.example.jparepo;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
class ErewhonServiceImpl implements ErewhonService {

  @Inject
  ErewhonRepository erewhonRepository;

  @Override
  public void doStuff() {
    erewhonRepository.findAll();
  }
}
