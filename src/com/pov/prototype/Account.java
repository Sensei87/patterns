package com.pov.prototype;

/*
 Паттерн проектирования «Прототип» (Prototype) относится к семейству порождающих из
 числа паттернов разработки программного обеспечения GoF.
  Он используется для создания объектов путем клонирования на основе экземпляра-прототипа.
  В корпоративных приложениях создание объекта требует значительных
затрат ресурсов в смысле непосредственного создания объектов и инициализации
начальных значений их свойств. В случае подобного объекта имеет смысл воспользоваться паттерном проектирования «Прототип».
  При этом просто копируется уже
существующий подобный объект вместо требующего временны ' х затрат создания
нового.
Этот паттерн включает реализацию прототипного интерфейса в целях создания
клона существующего объекта. Используется в случаях, когда непосредственное
создание объекта требует значительных затрат ресурсов,
 например, когда объект создается после дорогостоящей операции с базой данных. Объект можно закэшировать,
вернуть его клон при следующем запросе и обновлять базу по мере необходимости,
уменьшая таким образом количество требуемых обращений к ней.
* */

public abstract class Account implements Cloneable {
    abstract public void accountType();
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return clone;
    }

}
