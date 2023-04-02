package itea.serhii.sbserver;

import itea.serhii.sbserver.domain.BlockedSite;
import itea.serhii.sbserver.repository.BlockedSitesRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SbServerApplication {

    public static void main(String[] args) {
        var applicationContext = SpringApplication.run(SbServerApplication.class, args);

        var repository = applicationContext.getBean(BlockedSitesRepository.class);
        repository.save(new BlockedSite("https://telegram.org/"));
        repository.save(new BlockedSite("https://azure.microsoft.com/"));
        repository.save(new BlockedSite("https://github.com/"));
    }
}
