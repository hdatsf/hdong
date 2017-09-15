package com.hdong.common.db;

public interface BaseEnum<E extends Enum<?>, T> {  
    public T getValue();  
    public String getName();  
}  
