package com.jdc.pattern.genrics;

public record Pair<K, V>(K key, V value) implements PairInf<K,V>{

}
