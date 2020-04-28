package com.example.app.model.banco;

import java.util.List;

public interface BaseDAO<T> {

    /**
     * Método para consultar tudo o que há no db;
     * @return ArrayList<?>
     */
    List<?> consultarTodos();

    /**
     * Consulta algo especifico através de um id;
     * @param id: int
     * @return object
     */
    T consultarPorId(int id);

    /**
     * Método para cadastrar;
     * @param object : Object
     * @return object
     */
    T cadastrar(T object);

    /**
     * Método para altera/atualizar;
     * @param object: Object
     * @return object
     */
    Integer alterar(T object);

    /**
     * Método para excluir;
     * @param object : Int array
     * @return true/false
     */
    Integer excluir(T object);

    /**
     * Método para consulta coluna especifica
     * @param string: Query
     * @return List
     */
    List<?> consultarColuna(String string);

    Integer inserirDadosEmColuna(String table, String value);
}
