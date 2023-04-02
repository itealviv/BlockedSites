package itea.serhii.sbserver.controller;

import itea.serhii.sbserver.domain.BlockedSite;
import itea.serhii.sbserver.repository.BlockedSitesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class BlockedSitesController {
    private final BlockedSitesRepository repository;

    @GetMapping("blocked-sites")
    public List<BlockedSite> blockedSites() {
        log.info("Request blockedSites has been performed");
        return repository.findAll();
    }
}

