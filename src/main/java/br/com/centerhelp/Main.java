package br.com.centerhelp;

import br.com.centerhelp.dominio.equipamento.model.Equipamento;
import br.com.centerhelp.dominio.equipamento.repository.EquipamentoRepository;
import br.com.centerhelp.dominio.equipamento.repository.TipoEquipamentoRepository;
import br.com.centerhelp.dominio.equipamento.view.EquipamentoView;
import br.com.centerhelp.dominio.equipamento.view.TipoEquipamentoView;
import jakarta.persistence.Persistence;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.swing.*;
import java.io.IOException;
import java.net.URI;

public class Main {

    private static final String BASE_URI = "http://localhost:8080";

    private static HttpServer startServer(){

        ResourceConfig config = new ResourceConfig().packages("br.com.centerhelp.resources");
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), config);

    }

    public static void main(String[] args) throws IOException {
        final HttpServer server = startServer();
        System.out.println(String.format("O servidor Jersey foi inicializado com sucesso! Está operando no endereço %s%nAperte CTRL + C para parar o servidor ", BASE_URI));
        System.in.read();
        server.shutdown();

    }

}