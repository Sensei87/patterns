package com.pov.singelton;

public class SingeltonClass {
    private static SingeltonClass instance = null;
    private static final SingeltonClass instanceFast = new SingeltonClass();
    private SingeltonClass() {
    }

    // Метод медленой загрузки обьекта по необходимости
    private static SingeltonClass getInstance() {
        if(instance == null) {
            synchronized (SingeltonClass.class) {
                if(instance == null) {
                    return new SingeltonClass();
                }
            }
        }
        return instance;
    }

    // Метод быстрой загрузки обьекта сразй после запуска программы
    public static SingeltonClass getInstanceFast() {
        return instanceFast;
    }
}
