package br.com.rafa.screenmatch.service;

public interface IConvertsData {
    <T> T execute(String json, Class<T> clazz);
}
