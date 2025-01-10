package com.modulith.notServico;


import com.modulith.notificacao.Notificacao;
import com.modulith.notificacaoRepo.NotificacaoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;

@Service
public class NotServico {
    @Autowired
    private NotificacaoRepo notificacaoRepo;

    @ApplicationModuleListener
    public void criarNotificacao(Notificacao notificacao){
         notificacaoRepo.save(notificacao);
    }
}
