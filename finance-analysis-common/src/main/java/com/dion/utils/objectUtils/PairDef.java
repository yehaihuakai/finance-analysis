package com.dion.utils.objectUtils;

/**
 * Created by liyang on 2017/8/15.
 * pairDef是一个工具类，组装多个对象进行传递
 */

public class PairDef<T, S> {
    private T first;
    private S second;

    public PairDef() {

    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

}
