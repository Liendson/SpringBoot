package com.redetex.web.controller;

import com.redetex.web.model.entidade.Orcamento;
import com.redetex.web.model.entidade.dto.ConsultarOrcamentoDTO;
import com.redetex.web.model.entidade.dto.OrcamentoDTO;
import com.redetex.web.model.exception.CustomException;
import com.redetex.web.model.service.OrcamentoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orcamentos")
public class OrcamentosController {

    @Autowired
    private OrcamentoService orcamentoService;

    @GetMapping(value = "/buscar")
    public ResponseEntity<List<OrcamentoDTO>> buscarTodosOrcamentos() {
        return ResponseEntity.ok(orcamentoService.listarTodosOrcamentos());
    }

    @GetMapping(value = "/buscar/{idOrcamento}")
    public ResponseEntity<OrcamentoDTO> buscarOrcamento(@PathVariable Long idOrcamento) throws CustomException {
        return ResponseEntity.ok(orcamentoService.detalharOrcamento(idOrcamento));
    }

    @PostMapping(value = "/salvar")
    public ResponseEntity<OrcamentoDTO> salvarOrcamento(@RequestBody OrcamentoDTO orcamento) throws CustomException {
        return ResponseEntity.ok(orcamentoService.salvarOrcamento(orcamento));
    }

    @GetMapping(value = "/cancelar/{idOrcamento}")
    public ResponseEntity<OrcamentoDTO> cancelarOrcamento(@PathVariable Long idOrcamento) throws CustomException {
        return ResponseEntity.ok(orcamentoService.cancelarOrcamento(idOrcamento));
    }

    @GetMapping(value = "/concluir/{idOrcamento}")
    public ResponseEntity<OrcamentoDTO> concluirOrcamento(@PathVariable Long idOrcamento) throws CustomException {
        return ResponseEntity.ok(orcamentoService.concluirOrcamento(idOrcamento));
    }

    @PostMapping(value = "/consultar")
    public ResponseEntity<List<Orcamento>> consultarOrcamento(@RequestBody ConsultarOrcamentoDTO orcamentoDTO) throws CustomException {
        return ResponseEntity.ok(orcamentoService.consultarOrcamentos(orcamentoDTO));
    }

}
