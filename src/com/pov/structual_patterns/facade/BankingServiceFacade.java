package com.pov.structual_patterns.facade;
/*
* Предоставляет единый интерфейс для набора интерфейсов подсистемы.
Фасад задает высокоуровневый интерфейс, облегчающий использование
подсистемы.
* */
public interface BankingServiceFacade {
    void moneyTransfer();
}
