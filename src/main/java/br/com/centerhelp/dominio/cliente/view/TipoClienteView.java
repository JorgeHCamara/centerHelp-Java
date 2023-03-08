package br.com.centerhelp.dominio.cliente.view;

import br.com.centerhelp.dominio.cliente.model.TipoCliente;

import javax.swing.*;

public class TipoClienteView {

    public static TipoCliente showForm(TipoCliente t) {
        var nome = JOptionPane.showInputDialog("Tipo de Cliente", t==null ? "" : t.getNome());

        TipoCliente tipo = new TipoCliente();

        tipo.setNome(nome).setId(t==null?null:t.getId());

        return tipo;
    }

}
