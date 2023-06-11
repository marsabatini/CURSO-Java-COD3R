package br.com.sabatini.cm.Modelo;

@FunctionalInterface
public interface CampoObservador {

    public void eventoOcorreu(Campo c, CampoEvento evento);
}
