package com.modulith.notificacaoRepo;

import com.modulith.notificacao.Notificacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificacaoRepo extends JpaRepository<Notificacao,Long> {
}
