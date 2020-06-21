package com.pov.behavioral_patterns.chain_of_responsibility;
/*
* Позволяет избежать сцепления отправителя запроса с получателем за счет
предоставления возможности обработки этого запроса более чем одному
объекту. Связывает цепочкой получающие запрос объекты, передавая его
по цепочке вплоть до объекта, которому поручается обработка.
* */
public abstract class Logger {
    public static int ERR = 3;
    public static int NOTICE = 5;
    public static int DEBUG = 7;
    protected int mask;
    protected Logger next;

    public Logger setNext(Logger log) {
        this.next = log;
        return log;
    }

    public void message(String msq, int priority) {
        if(priority <= mask) {
            writeMessage(msq);
        }
        if(next != null) {
            next.message(msq, priority);
        }
    }

    abstract protected void writeMessage(String msg);
}
