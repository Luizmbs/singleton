package org.example;

public class SystemConfig {

    private SystemConfig() {};
    private static SystemConfig instance = new SystemConfig();
    public static SystemConfig getInstance() {
        return instance;
    }

    private String nomeSistema;
    private String usuarioLogado;

    public String getNomeSistema() {
        return nomeSistema;
    }

    public void setNomeSistema(String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
